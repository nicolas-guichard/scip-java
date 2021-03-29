package com.sourcegraph.lsif_java

import scala.jdk.CollectionConverters._

import com.sourcegraph.lsif_semanticdb.SignatureFormatter
import com.sourcegraph.lsif_semanticdb.Symtab
import com.sourcegraph.semanticdb_javac.Semanticdb.SymbolInformation
import com.sourcegraph.semanticdb_javac.Semanticdb.SymbolOccurrence
import com.sourcegraph.semanticdb_javac.Semanticdb.SymbolOccurrence.Role
import com.sourcegraph.semanticdb_javac.Semanticdb.TextDocument

object SemanticdbPrinters {
  def printTextDocument(doc: TextDocument): String = {
    val occurrencesByLine = doc
      .getOccurrencesList
      .asScala
      .groupBy(_.getRange.getStartLine)
    val symbolsmap = doc.getSymbolsList.asScala.map(s => s.getSymbol -> s).toMap
    val out = new StringBuilder()
    val symtab = new Symtab(doc)
    doc
      .getText
      .linesWithSeparators
      .zipWithIndex
      .foreach { case (line, i) =>
        out.append(line)
        val occurences = occurrencesByLine
          .getOrElse(i, Nil)
          .sortBy(o =>
            (
              o.getRange.getStartCharacter,
              o.getRange.getEndLine,
              o.getRange.getEndCharacter
            )
          )
        occurences.foreach { occ =>
          formatOccurrence(out, occ, line, symbolsmap, symtab)
        }
      }
    out.toString()
  }

  private def formatOccurrence(
      out: StringBuilder,
      occ: SymbolOccurrence,
      line: String,
      symbols: Map[String, SymbolInformation],
      symtab: Symtab
  ): Unit = {
    val r = occ.getRange
    val isMultiline = r.getStartLine != r.getEndLine
    val width =
      if (isMultiline) {
        line.length - r.getStartCharacter - 1
      } else {
        r.getEndCharacter - r.getStartCharacter
      }
    out
      .append(
        if (r.getStartCharacter > 2)
          "// " + " " * (r.getStartCharacter - 3)
        else
          "//"
      )
      .append(
        if (r.getStartCharacter == 1)
          "^" * (width - 1)
        else
          "^" * width
      )
      .append(" ")
      .append(occ.getRole.toString.toLowerCase)
      .append(" ")
      .append(occ.getSymbol)
      .append(
        if (isMultiline)
          " "
        else
          ""
      )
      .append(
        if (isMultiline)
          s"${r.getEndLine - r.getStartLine}:${r.getEndCharacter}"
        else
          ""
      )
      .append(
        symbols.get(occ.getSymbol) match {
          case Some(info) if occ.getRole == Role.DEFINITION =>
            " " + new SignatureFormatter(info, symtab).formatSymbol() + ""
          case _ =>
            ""
        }
      )
      .append("\n")
  }

}

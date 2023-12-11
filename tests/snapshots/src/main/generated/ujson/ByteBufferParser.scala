package ujson
//      ^^^^^ definition semanticdb maven . . ujson/
import upickle.core.{ObjArrVisitor, Visitor}
//     ^^^^^^^ reference semanticdb maven . . upickle/
//             ^^^^ reference semanticdb maven . . upickle/core/
//                   ^^^^^^^^^^^^^ reference semanticdb maven maven/com.lihaoyi/upickle-core_2.13 1.4.0 upickle/core/ObjArrVisitor#
//                                  ^^^^^^^ reference semanticdb maven maven/com.lihaoyi/upickle-core_2.13 1.4.0 upickle/core/Visitor#
//                                  ^^^^^^^ reference semanticdb maven maven/com.lihaoyi/upickle-core_2.13 1.4.0 upickle/core/Visitor.

import scala.annotation.{switch, tailrec}
//     ^^^^^ reference semanticdb maven . . scala/
//           ^^^^^^^^^^ reference semanticdb maven . . scala/annotation/
//                       ^^^^^^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/annotation/switch#
//                               ^^^^^^^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/annotation/tailrec#
import java.nio.ByteBuffer
//     ^^^^ reference semanticdb maven . . java/
//          ^^^ reference semanticdb maven . . java/nio/
//              ^^^^^^^^^^ reference semanticdb maven jdk 11 java/nio/ByteBuffer#
import java.nio.charset.StandardCharsets
//     ^^^^ reference semanticdb maven . . java/
//          ^^^ reference semanticdb maven . . java/nio/
//              ^^^^^^^ reference semanticdb maven . . java/nio/charset/
//                      ^^^^^^^^^^^^^^^^ reference semanticdb maven jdk 11 java/nio/charset/StandardCharsets#

/**
 * Basic ByteBuffer parser.
 *
 * This assumes that the provided ByteBuffer is ready to be read. The
 * user is responsible for any necessary flipping/resetting of the
 * ByteBuffer before parsing.
 *
 * The parser makes absolute calls to the ByteBuffer, which will not
 * update its own mutable position fields.
 */
final class ByteBufferParser[J](src: ByteBuffer) extends ByteParser[J]{
//          ^^^^^^^^^^^^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#
//                           display_name ByteBufferParser
//                           documentation ```scala\nfinal class ByteBufferParser[J]\n```
//                           ^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#[J]
//                             display_name J
//                             documentation ```scala\nJ\n```
//                             ^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#`<init>`().
//                               display_name <init>
//                               documentation ```scala\ndef this(src: ByteBuffer)\n```
//                              ^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#src.
//                                  display_name src
//                                  documentation ```scala\nprivate[this] val src: ByteBuffer\n```
//                                  relationship is_reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#`<init>`().(src)
//                              ___ synthetic_definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#`<init>`().(src)
//                                  display_name src
//                                  documentation ```scala\nsrc: ByteBuffer \n```
//                                  relationship is_reference is_definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#src.
//                                   ^^^^^^^^^^ reference semanticdb maven jdk 11 java/nio/ByteBuffer#
//                                                       ^^^^^^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteParser#
//                                                                  ^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#[J]
//                                                                    ^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteParser#`<init>`().
  private[this] final val start = src.position()
//                        ^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#start.
//                              display_name start
//                              documentation ```scala\nprivate[this] final val start: Int\n```
//                                ^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#src.
//                                    ^^^^^^^^ reference semanticdb maven jdk 11 java/nio/Buffer#position().
  private[this] final val limit = src.limit() - start
//                        ^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#limit.
//                              display_name limit
//                              documentation ```scala\nprivate[this] final val limit: Int\n```
//                                ^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#src.
//                                    ^^^^^ reference semanticdb maven jdk 11 java/nio/Buffer#limit().
//                                            ^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/Int#`-`(+3).
//                                              ^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#start.


  protected[this] final def close() = { src.position(start) }
//                          ^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#close().
//                                display_name close
//                                documentation ```scala\nfinal def close(): Unit\n```
//                                relationship is_reference is_implementation semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteParser#close().
//                                      ^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#src.
//                                          ^^^^^^^^ reference semanticdb maven jdk 11 java/nio/ByteBuffer#position().
//                                                   ^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#start.
  override def growBuffer(until: Int): Unit = ()
//             ^^^^^^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#growBuffer().
//                        display_name growBuffer
//                        documentation ```scala\ndef growBuffer(until: Int): Unit\n```
//                        relationship is_reference is_implementation semanticdb maven maven/com.lihaoyi/upickle-core_2.13 1.4.0 upickle/core/BufferingByteParser#growBuffer().
//                        ^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#growBuffer().(until)
//                              display_name until
//                              documentation ```scala\nuntil: Int \n```
//                               ^^^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/Int#
//                                     ^^^^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/Unit#
  def readDataIntoBuffer(buffer: Array[Byte], bufferOffset: Int) = {
//    ^^^^^^^^^^^^^^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#readDataIntoBuffer().
//                       display_name readDataIntoBuffer
//                       documentation ```scala\ndef readDataIntoBuffer(buffer: Array[Byte], bufferOffset: Int): (Array[Byte], Boolean, Int)\n```
//                       relationship is_reference is_implementation semanticdb maven maven/com.lihaoyi/upickle-core_2.13 1.4.0 upickle/core/BufferingByteParser#readDataIntoBuffer().
//                       ^^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#readDataIntoBuffer().(buffer)
//                              display_name buffer
//                              documentation ```scala\nbuffer: Array[Byte] \n```
//                               ^^^^^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/Array#
//                                     ^^^^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/Byte#
//                                            ^^^^^^^^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#readDataIntoBuffer().(bufferOffset)
//                                                         display_name bufferOffset
//                                                         documentation ```scala\nbufferOffset: Int \n```
//                                                          ^^^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/Int#

    if(buffer == null) (java.util.Arrays.copyOfRange(src.array(), start, src.limit()), limit == 0, limit)
//     ^^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#readDataIntoBuffer().(buffer)
//            ^^ reference semanticdb maven jdk 11 java/lang/Object#`==`().
//                      ^^^^ reference semanticdb maven . . java/
//                           ^^^^ reference semanticdb maven . . java/util/
//                                ^^^^^^ reference semanticdb maven jdk 11 java/util/Arrays#
//                                       ^^^^^^^^^^^ reference semanticdb maven jdk 11 java/util/Arrays#copyOfRange(+2).
//                                                   ^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#src.
//                                                       ^^^^^ reference semanticdb maven jdk 11 java/nio/ByteBuffer#array().
//                                                                ^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#start.
//                                                                       ^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#src.
//                                                                           ^^^^^ reference semanticdb maven jdk 11 java/nio/Buffer#limit().
//                                                                                     ^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#limit.
//                                                                                           ^^ reference semanticdb maven maven/org.scala-lang/scala-library 2.13.10 scala/Int#`==`(+3).
//                                                                                                 ^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#limit.
    else (src.array(), true, -1)
//        ^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#src.
//            ^^^^^ reference semanticdb maven jdk 11 java/nio/ByteBuffer#array().
  }
}

object ByteBufferParser extends Transformer[ByteBuffer]{
//     ^^^^^^^^^^^^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser.
//                      display_name ByteBufferParser
//                      documentation ```scala\nobject ByteBufferParser\n```
//                              ^^^^^^^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/Transformer#
//                                          ^^^^^^^^^^ reference semanticdb maven jdk 11 java/nio/ByteBuffer#
//                                                     ^ reference semanticdb maven jdk 11 java/lang/Object#`<init>`().
  def transform[T](j: ByteBuffer, f: Visitor[_, T]) = new ByteBufferParser(j).parse(f)
//    ^^^^^^^^^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser.transform().
//              display_name transform
//              documentation ```scala\ndef transform(j: ByteBuffer, f: Visitor[local0, T[): T\n```
//              relationship is_reference is_implementation semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/Transformer#transform().
//              ^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser.transform().[T]
//                display_name T
//                documentation ```scala\nT\n```
//                 ^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser.transform().(j)
//                   display_name j
//                   documentation ```scala\nj: ByteBuffer \n```
//                    ^^^^^^^^^^ reference semanticdb maven jdk 11 java/nio/ByteBuffer#
//                                ^ definition semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser.transform().(f)
//                                  display_name f
//                                  documentation ```scala\nf: Visitor[local0, T[ \n```
//                                   ^^^^^^^ reference semanticdb maven maven/com.lihaoyi/upickle-core_2.13 1.4.0 upickle/core/Visitor#
//                                              ^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser.transform().[T]
//                                                        ^^^^^^^^^^^^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#
//                                                                        ^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser#`<init>`().
//                                                                         ^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser.transform().(j)
//                                                                            ^^^^^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteParser#parse().
//                                                                                  ^ reference semanticdb maven maven/com.lihaoyi/ujson_2.13 1.4.0 ujson/ByteBufferParser.transform().(f)
}

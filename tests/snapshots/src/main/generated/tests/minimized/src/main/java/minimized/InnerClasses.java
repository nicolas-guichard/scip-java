package minimized;

public class InnerClasses {
//           ^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#
//                        display_name InnerClasses
//                        documentation ```java\npublic class InnerClasses\n```

  private final int exampleField;
//                  ^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#exampleField.
//                               display_name exampleField
//                               documentation ```java\nprivate final int exampleField\n```

  private static final String STRING = "asdf";
//                     ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                            ^^^^^^ definition semanticdb maven . . minimized/InnerClasses#STRING.
//                                   display_name STRING
//                                   documentation ```java\nprivate static final String STRING\n```

  private static final int top = 5;
//                         ^^^ definition semanticdb maven . . minimized/InnerClasses#top.
//                             display_name top
//                             documentation ```java\nprivate static final int top\n```
  private static final int bottom = 10;
//                         ^^^^^^ definition semanticdb maven . . minimized/InnerClasses#bottom.
//                                display_name bottom
//                                documentation ```java\nprivate static final int bottom\n```

  public InnerClasses(int exampleField) {
//       ^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#`<init>`().
//                    display_name <init>
//                    documentation ```java\npublic InnerClasses(int exampleField)\n```
//                        ^^^^^^^^^^^^ definition local 0
//                                     display_name exampleField
//                                     documentation ```java\nint exampleField\n```
    this.exampleField = exampleField;
//       ^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#exampleField.
//                      ^^^^^^^^^^^^ reference local 0
  }

  public enum InnerEnum {
//            ^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerEnum#
//                      display_name InnerEnum
//                      documentation ```java\npublic enum InnerEnum\n```
//                      relationship is_implementation semanticdb maven jdk 11 java/io/Serializable#
//                      relationship is_implementation semanticdb maven jdk 11 java/lang/Comparable#
//                      relationship is_implementation semanticdb maven jdk 11 java/lang/Enum#
//            ^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerEnum#`<init>`().
//                      display_name <init>
//                      documentation ```java\nprivate InnerEnum()\n```
    A,
//  ^ definition semanticdb maven . . minimized/InnerClasses#InnerEnum#A.
//    display_name A
//    documentation ```java\nInnerEnum.A /* ordinal 0 */\n```
//  ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#`<init>`().
    B,
//  ^ definition semanticdb maven . . minimized/InnerClasses#InnerEnum#B.
//    display_name B
//    documentation ```java\nInnerEnum.B /* ordinal 1 */\n```
//  ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#`<init>`().
    C
//  ^ definition semanticdb maven . . minimized/InnerClasses#InnerEnum#C.
//    display_name C
//    documentation ```java\nInnerEnum.C /* ordinal 2 */\n```
//  ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#`<init>`().
  }

  public interface InnerInterface<A, B> {
//                 ^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerInterface#
//                                display_name InnerInterface
//                                documentation ```java\npublic interface InnerInterface<A, B>\n```
//                                ^ definition semanticdb maven . . minimized/InnerClasses#InnerInterface#[A]
//                                  display_name A
//                                  documentation ```java\nA\n```
//                                   ^ definition semanticdb maven . . minimized/InnerClasses#InnerInterface#[B]
//                                     display_name B
//                                     documentation ```java\nB\n```
    B apply(A a);
//  ^ reference semanticdb maven . . minimized/InnerClasses#InnerInterface#[B]
//    ^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerInterface#apply().
//          display_name apply
//          documentation ```java\npublic abstract B apply(A a)\n```
//          relationship is_reference is_implementation semanticdb maven . . minimized/InnerClasses#InnerClass#apply().
//          ^ reference semanticdb maven . . minimized/InnerClasses#InnerInterface#[A]
//            ^ definition local 1
//              display_name a
//              documentation ```java\nA a\n```
  }

  public @interface InnerAnnotation {
//                  ^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerAnnotation#
//                                  display_name InnerAnnotation
//                                  documentation ```java\npublic @interface InnerAnnotation\n```
//                                  relationship is_reference is_implementation semanticdb maven jdk 11 java/lang/annotation/Annotation#
    int value();
//      ^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerAnnotation#value().
//            display_name value
//            documentation ```java\npublic abstract int value()\n```
  }

  @SuppressWarnings(STRING + " ")
// ^^^^^^^^^^^^^^^^ reference semanticdb maven jdk 11 java/lang/SuppressWarnings#
//                  ^^^^^^ reference semanticdb maven . . minimized/InnerClasses#STRING.
  @InnerAnnotation(top / bottom)
// ^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerAnnotation#
//                 ^^^ reference semanticdb maven . . minimized/InnerClasses#top.
//                       ^^^^^^ reference semanticdb maven . . minimized/InnerClasses#bottom.
  public static class InnerStaticClass {
//                    ^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerStaticClass#
//                                     display_name InnerStaticClass
//                                     documentation ```java\n@SuppressWarnings(STRING + " ")\n@InnerAnnotation(top / bottom)\npublic static class InnerStaticClass\n```
//                    ^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerStaticClass#`<init>`().
//                                     display_name <init>
//                                     documentation ```java\npublic InnerStaticClass()\n```

    public static void innerStaticMethod() {}
//                     ^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerStaticClass#innerStaticMethod().
//                                       display_name innerStaticMethod
//                                       documentation ```java\npublic static void innerStaticMethod()\n```
  }

  public class InnerClass implements InnerInterface<Integer, Integer> {
//             ^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerClass#
//                        display_name InnerClass
//                        documentation ```java\npublic class InnerClass\n```
//                        relationship is_implementation semanticdb maven . . minimized/InnerClasses#InnerInterface#
//                                   ^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerInterface#
//                                                  ^^^^^^^ reference semanticdb maven jdk 11 java/lang/Integer#
//                                                           ^^^^^^^ reference semanticdb maven jdk 11 java/lang/Integer#
    private final int field;
//                    ^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerClass#field.
//                          display_name field
//                          documentation ```java\nprivate final int field\n```

    public InnerClass(int field) {
//         ^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerClass#`<init>`().
//                    display_name <init>
//                    documentation ```java\npublic InnerClass(int field)\n```
//                        ^^^^^ definition local 2
//                              display_name field
//                              documentation ```java\nint field\n```
      this.field = field;
//         ^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerClass#field.
//                 ^^^^^ reference local 2
    }

    public void innerMethod() {
//              ^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerClass#innerMethod().
//                          display_name innerMethod
//                          documentation ```java\npublic void innerMethod()\n```
      System.out.println(field + exampleField);
//    ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//           ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//               ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+3).
//                       ^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerClass#field.
//                               ^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#exampleField.
    }

    @Override
//   ^^^^^^^^ reference semanticdb maven jdk 11 java/lang/Override#
    public Integer apply(Integer integer) {
//         ^^^^^^^ reference semanticdb maven jdk 11 java/lang/Integer#
//                 ^^^^^ definition semanticdb maven . . minimized/InnerClasses#InnerClass#apply().
//                       display_name apply
//                       documentation ```java\n@Override\npublic Integer apply(Integer integer)\n```
//                       relationship is_reference is_implementation semanticdb maven . . minimized/InnerClasses#InnerInterface#apply().
//                       ^^^^^^^ reference semanticdb maven jdk 11 java/lang/Integer#
//                               ^^^^^^^ definition local 3
//                                       display_name integer
//                                       documentation ```java\nInteger integer\n```
      return field * integer;
//           ^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerClass#field.
//                   ^^^^^^^ reference local 3
    }
  }

  private static <A, B> B runInnerInterface(InnerInterface<A, B> fn, A a) {
//                ^ definition semanticdb maven . . minimized/InnerClasses#runInnerInterface().[A]
//                  display_name A
//                  documentation ```java\nA\n```
//                   ^ definition semanticdb maven . . minimized/InnerClasses#runInnerInterface().[B]
//                     display_name B
//                     documentation ```java\nB\n```
//                      ^ reference semanticdb maven . . minimized/InnerClasses#runInnerInterface().[B]
//                        ^^^^^^^^^^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#runInnerInterface().
//                                          display_name runInnerInterface
//                                          documentation ```java\nprivate static <A, B> B runInnerInterface(InnerInterface<A, B> fn, A a)\n```
//                                          ^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerInterface#
//                                                         ^ reference semanticdb maven . . minimized/InnerClasses#runInnerInterface().[A]
//                                                            ^ reference semanticdb maven . . minimized/InnerClasses#runInnerInterface().[B]
//                                                               ^^ definition local 4
//                                                                  display_name fn
//                                                                  documentation ```java\nInnerInterface<A, B> fn\n```
//                                                                   ^ reference semanticdb maven . . minimized/InnerClasses#runInnerInterface().[A]
//                                                                     ^ definition local 5
//                                                                       display_name a
//                                                                       documentation ```java\nA a\n```
    return fn.apply(a);
//         ^^ reference local 4
//            ^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerInterface#apply().
//                  ^ reference local 5
  }

  public static void testEnum(InnerEnum magicEnum) {
//                   ^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#testEnum().
//                            display_name testEnum
//                            documentation ```java\npublic static void testEnum(InnerEnum magicEnum)\n```
//                            ^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#
//                                      ^^^^^^^^^ definition local 6
//                                                display_name magicEnum
//                                                documentation ```java\nInnerEnum magicEnum\n```
    if (System.nanoTime() > System.currentTimeMillis()) {
//      ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//             ^^^^^^^^ reference semanticdb maven jdk 11 java/lang/System#nanoTime().
//                          ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//                                 ^^^^^^^^^^^^^^^^^ reference semanticdb maven jdk 11 java/lang/System#currentTimeMillis().
      magicEnum = InnerEnum.B;
//    ^^^^^^^^^ reference local 6
//                ^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#
//                          ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#B.
    }
    switch (magicEnum) {
//          ^^^^^^^^^ reference local 6
      case B:
//         ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#B.
        System.out.println("b");
//      ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//             ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//                 ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+8).
        break;
      case A:
//         ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#A.
        System.out.println("a");
//      ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//             ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//                 ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+8).
        break;
      default:
        break;
    }
    if (magicEnum == InnerEnum.A) System.out.println("a");
//      ^^^^^^^^^ reference local 6
//                   ^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#
//                             ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#A.
//                                ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//                                       ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//                                           ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+8).
    else if (magicEnum == InnerEnum.C) System.out.println("b");
//           ^^^^^^^^^ reference local 6
//                        ^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#
//                                  ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#C.
//                                     ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//                                            ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//                                                ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+8).
    else System.out.println("c");
//       ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//              ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//                  ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+8).
  }

  public static void testAnon() {
//                   ^^^^^^^^ definition semanticdb maven . . minimized/InnerClasses#testAnon().
//                            display_name testAnon
//                            documentation ```java\npublic static void testAnon()\n```
    InnerInterface<String, String> fn =
//  ^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerInterface#
//                 ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                         ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                                 ^^ definition local 7
//                                    display_name fn
//                                    documentation ```java\nInnerInterface<String, String> fn\n```
        new InnerInterface<String, String>() {
//          ^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerInterface#
//                         ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                                 ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
          @Override
//         ^^^^^^^^ reference semanticdb maven jdk 11 java/lang/Override#
          public String apply(String s) {
//               ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                      ^^^^^ definition local 9
//                            display_name apply
//                            documentation ```java\n@Override\npublic String apply(String s)\n```
//                            relationship is_reference is_implementation semanticdb maven . . minimized/InnerClasses#InnerInterface#apply().
//                            ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                                   ^ definition local 10
//                                     display_name s
//                                     documentation ```java\nString s\n```
            return s + "b";
//                 ^ reference local 10
          }
        };
    System.out.println(fn.apply("a"));
//  ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//         ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//             ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+8).
//                     ^^ reference local 7
//                        ^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerInterface#apply().
  }

  public static String app() {
//              ^^^^^^ reference semanticdb maven jdk 11 java/lang/String#
//                     ^^^ definition semanticdb maven . . minimized/InnerClasses#app().
//                         display_name app
//                         documentation ```java\npublic static String app()\n```
    int a = 42;
//      ^ definition local 11
//        display_name a
//        documentation ```java\nint a\n```
    InnerStaticClass.innerStaticMethod();
//  ^^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerStaticClass#
//                   ^^^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerStaticClass#innerStaticMethod().
    InnerClasses innerClasses = new InnerClasses(a);
//  ^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#
//               ^^^^^^^^^^^^ definition local 12
//                            display_name innerClasses
//                            documentation ```java\nInnerClasses innerClasses\n```
//                                  ^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#`<init>`().
//                                               ^ reference local 11
    InnerClass innerClass = innerClasses.new InnerClass(a);
//  ^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerClass#
//             ^^^^^^^^^^ definition local 13
//                        display_name innerClass
//                        documentation ```java\nInnerClass innerClass\n```
//                          ^^^^^^^^^^^^ reference local 12
//                                           ^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerClass#`<init>`().
//                                                      ^ reference local 11
    innerClass.innerMethod();
//  ^^^^^^^^^^ reference local 13
//             ^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerClass#innerMethod().
    System.out.println(runInnerInterface(innerClass, a));
//  ^^^^^^ reference semanticdb maven jdk 11 java/lang/System#
//         ^^^ reference semanticdb maven jdk 11 java/lang/System#out.
//             ^^^^^^^ reference semanticdb maven jdk 11 java/io/PrintStream#println(+9).
//                     ^^^^^^^^^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#runInnerInterface().
//                                       ^^^^^^^^^^ reference local 13
//                                                   ^ reference local 11
    testEnum(InnerEnum.A);
//  ^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#testEnum().
//           ^^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#
//                     ^ reference semanticdb maven . . minimized/InnerClasses#InnerEnum#A.
    testAnon();
//  ^^^^^^^^ reference semanticdb maven . . minimized/InnerClasses#testAnon().
    return "";
  }
}

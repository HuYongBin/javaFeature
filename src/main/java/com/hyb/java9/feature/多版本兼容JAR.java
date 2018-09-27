package com.hyb.java9.feature;

/**
 *  multirelease.jar 可以在 Java 9 中使用, 不过 Helper 这个类使用的不是顶层的 multirelease.Helper 这个 class, 而是处在“META-INF/versions/9”下面的这个。这是特别为 Java 9 准备的 class 版本，可以运用 Java 9 所提供的特性和库。
 */
public class 多版本兼容JAR {
//    multirelease.jar
//                  ├── META-INF
//                  │   └── versions
//                  │       └── 9
//                          │           └── multirelease
//                  │               └── Helper.class
//                  ├── multirelease
//                      ├── Helper.class
//                     └── Main.class
}

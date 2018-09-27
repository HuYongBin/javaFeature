package com.hyb.java10.feature;

import java.util.ArrayList;

/**
 * 编译器行为
 * var 只能用在以下情况：
 *
 * 声明的同时赋值，比如上面那个例子
 * 增强的 for 循环中的索引 （这将在后面提到）
 * 传统 for 循环中声明的本地变量
 */
public class 局部变量推断 {
    public static void main(String[] args) {
        //入了 var，既保持 Java 对静态类型安全的承诺，又能让开发者省略不必要的局部变量类型的声明。
        var arrayList = new ArrayList<String>();
        var str = "ABC"; //根据推断为 字符串类型
        var l = 10L;//根据10L 推断long 类型
        var flag = true;//根据 true推断 boolean 类型
        var flag1 = 1;//这里会推断boolean类型。0表示false 非0表示true
        var list = new ArrayList<String>();  // 推断 ArrayList<String>
        var stream = list.stream();          // 推断 Stream<String>
    }

}
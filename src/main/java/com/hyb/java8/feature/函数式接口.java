package com.hyb.java8.feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 如果一个接口定义了一个方法（@FunctionalInterface），那么这个接口就成为函数式接口
 * 被它捕获的变量必须是“有效final”的。所以要么它们需要用final修饰符号标记，要么保证它们在赋值后不能被改变。
 * <p>
 * Lambdas
 */
@FunctionalInterface
public interface 函数式接口 {
    public void run();

    public static void main(String[] args) {

        函数式接口 h = () -> System.out.println("hh");

        List<String> strings = Arrays.asList("afff", "b", "c");
        Stream<String> stream = strings.stream(); //
        stream.mapToInt(String::length)//方法与构造函数引用,String::new
                .mapToDouble(x -> x / 10.0)
                .mapToLong(x -> 1L);
    }
}

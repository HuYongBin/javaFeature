package com.hyb.java9.feature;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream 接口中添加了 4 个新的方法：dropWhile, takeWhile, ofNullable
 */
public class 改进的StreamAPI {
    public static void main(String[] args) {
        //第二个参数是一个 Lambda，它会在当前 IntStream 中的元素到达 100 的时候返回 true。因此这个简单的示例是向控制台打印 1 到 99。
        IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);
        //现在可以通过 Optional 的新方法 `stram` 将一个 Optional 对象转换为一个(可能是空的) Stream 对象
        Stream<Integer> s = Optional.of(1).stream();

    }
}

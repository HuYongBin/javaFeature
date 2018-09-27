package com.hyb.java9.feature;

import java.util.List;
import java.util.Set;

/**
 * 在创建后，继续添加元素到这些集合会导致 “UnsupportedOperationException”
 */
public class 不可变的集合 {
    public static void main(String[] args) {
        Set<Integer> ints = Set.of(1, 2, 3);
        List<String> strings = List.of("first", "second");
    }
}

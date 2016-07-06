package com.hyb.java7.feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * http://book.51cto.com/art/201205/339154.htm
 */
public class 使用可变参数时提升编译器的警告和错误信息 {

    public static  void addToList (List<String> listArg, String... elements) {
        for (String x : elements) {
            listArg.add(x);
        }
    }

    /**
     * java 7前处理警告
     * @param listArg
     * @param elements
     * @param <T>
     */
    @SuppressWarnings({"unchecked", "varargs"})
    public static <T> void addToList2 (List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    /**
     * @SafeVarargs注解只能用在参数长度可变的方法或构造方法上，
     * 且方法必须声明为static或final，否则会出现编译错误。
     * 一个方法使用@SafeVarargs注解的前提是，
     * 开发人员必须确保这个方法的实现中对泛型类型参数的处理不会引发类型安全问题。
     * @param listArg
     * @param elements
     * @param <T>
     */
    @SafeVarargs
    public static <T> void addToList3 (List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList<String>();
        addToList3(list);

    }

}


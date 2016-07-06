package com.hyb.java8.feature;

/**
 * Created by sun32 on 2016/1/12.
 */
public class Optional {
    public static void main(String[] args) {
        java.util.Optional name = java.util.Optional.ofNullable(null);
        name.ifPresent((value) -> {
            System.out.println("The length of the value is: " + value.toString());
        });

        System.out.println(name.orElse("null"));
        System.out.println(name.orElseGet(()->new String("123")));
    }
}

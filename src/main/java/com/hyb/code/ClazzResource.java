package com.hyb.code;

/**
 * Created by sun32 on 2016/1/5.
 */
public class ClazzResource {
    public static void main(String[] args) {

        System.out.println(ClazzResource.class.getResource("").getPath());
        System.out.println( ClassLoader.getSystemClassLoader().getResource("").getPath());
        System.out.println( ClazzResource.class.getClassLoader().getResource("").getPath());
    }
}

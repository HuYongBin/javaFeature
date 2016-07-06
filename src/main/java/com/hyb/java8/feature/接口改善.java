package com.hyb.java8.feature;

import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by root on 2014/6/22.
 */
public interface 接口改善<T> extends Iterable<T> {

    /**
     * Java 8中接口可以定义默认的方法
     * 不能重载equals，hashCode和toString，因为Object里面有这写方法
     *
     * @param action
     */
    default void forEach(Consumer<? super T> action) {

        //NullPoint
        Optional< String > fullName = Optional.ofNullable( null );
        System.out.println( "Full Name is set? " + fullName.isPresent() );
        System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) );
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }

    /**
     * 静态方法
     */
    static void method() {
    }
}

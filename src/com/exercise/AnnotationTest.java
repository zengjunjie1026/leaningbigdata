package com.exercise;

/*
*
* 在Java 8之前，注解只能是在声明的地方所使用，Java8开始，注解可以应用 在任何地方。
ElementType.TYPE_PARAMETER 表示该注解能写在类型变量的声明语 句中(如:泛型声明)。
 ElementType.TYPE_USE 表示该注解能写在使用类型的任何语句中。
*
*
* */

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@MyAnnotation1
public class AnnotationTest<U> { @MyAnnotation1
private String name;
    public static void main(String[] args) {
        AnnotationTest<@MyAnnotation1 String> t = null; int a = (@MyAnnotation1 int) 2L;
        @MyAnnotation1
        int b = 10;
    }
    public static <@MyAnnotation1 T> void method(T t) {
    }
    public static void test(@MyAnnotation1 String arg) throws @MyAnnotation1 Exception { }
}
@Target(ElementType.TYPE_USE)
@interface MyAnnotation1 {
}
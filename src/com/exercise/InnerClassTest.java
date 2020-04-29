package com.exercise;

/*
 *类的成员
 * 属性
 * 构造器
 * 方法
 * 代码块
 * 内部类
 *
 * 修饰符
 * static
 * final
 * abstract
 * interface
 * navie
 *
 * 内部类
 * 当一个类的内部定义了一个新的类
 *
 *
 */

public class InnerClassTest {
    public static void main(String[] args) {
        System.out.println("inner classes");
    }
}

class Outer{
    private int i = 10;
    private int j;

    static class Inner{
        public void test(){
//            System.out.println(i);
          //  System.out.println(j); error 非static
        }

    }
}
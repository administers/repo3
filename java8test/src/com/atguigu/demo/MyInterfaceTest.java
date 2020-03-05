package com.atguigu.demo;

interface MyInterface{

    //jdk7:只能声明全局变量（public static final）和抽象方法（public abstract）
    void method1();

    //jdk8:声明静态方法和默认方法
    public static void method2(){
        System.out.println("method2");
    }

    default void method3(){
        System.out.println("method3");
    }

    //jdk9:声明私有方法
 /*   private void method4(){
        System.out.println("私有方法");
    }*/
}

public class MyInterfaceTest {
}

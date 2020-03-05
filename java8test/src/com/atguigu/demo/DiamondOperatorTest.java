package com.atguigu.demo;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 钻石操作符
 */
public class DiamondOperatorTest {

    @Test
    public void testDiamondOperator(){
        diamondOperator();
    }

    public void diamondOperator(){
//        Set<String> set = new HashSet<>(){};//编译不通过  jdk9
        Set<String> set = new HashSet<>();//类型推断
        set.add("MM");
        set.add("GG");
        set.add("JJ");
        set.add("DD");

        for(String s : set){
            System.out.println(s);
        }
    }
}

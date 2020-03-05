package com.atguigu.demo;

import org.junit.Test;

/**
 * 关于下划线的使用
 */
public class UnderScoreTest {

    //jdk 8可以使用下划线作为变量名   jdk9下划线是关键字
    @Test
    public void testUnderScore(){
        String _ = "北京";
        System.out.println(_);
    }
}

package com.atguigu.demo;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryTest {

    //举例1
    @Test
    public void testTry1(){
        InputStreamReader reader = null;
        try {
            reader = new InputStreamReader(System.in);
            reader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //资源关闭操作
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //举例2:是在举例1的基础上升级的写法，不用显示处理资源的关闭 默认关闭
    //java8中,要求资源对象的实例化,必须放在try的一对()内完成
    //java9中,可以在try()中调用已经实例化的资源对象
    public void testTry2(){
        try (InputStreamReader reader = new InputStreamReader(System.in)){
            reader.read();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //如下操作不可以在jdk及之前的版本使用
    @Test
    public void testTry3(){
       /* InputStreamReader reader = new InputStreamReader(System.in);
        try(reader){
            reader.read();
        }catch (IOException e){
            e.printStackTrace();
        }*/
    }
}

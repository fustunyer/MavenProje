package com.techproed;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day08_BeforeAfterClass {
    @BeforeClass
    public static void setUp(){
        System.out.println("setup calisti");
    }
    @Test
    public void  test1(){
        System.out.println("test1 calisti");

    }
    @Test
    public void test2(){
        System.out.println("Test 2 çalıştı.");
    }
  @AfterClass
    public static void tearDown(){
        System.out.println("tearDown calisti");

    }




}

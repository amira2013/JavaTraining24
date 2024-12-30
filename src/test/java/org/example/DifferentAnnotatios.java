package org.example;
import org.testng.annotations.*;

public class DifferentAnnotatios {
    @BeforeSuite
    public void beforeTest(){
        System.out.println("Runing before suite");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Runing before method");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("Runing after method");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test
    public void test3(){
        System.out.println("Test 3");
    }

}

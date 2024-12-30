package org.example;

import org.testng.annotations.Test;

public class TestBase {
    @Test(priority = 2)
    public void atest() {
        System.out.println("A test");
    }
    @Test
    public void ctest(){
        System.out.println("C test");
    }
    @Test
    public void btest(){
        System.out.println("B test");
    }
}

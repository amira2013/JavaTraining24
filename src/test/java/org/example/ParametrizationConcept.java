package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationConcept {
    @Parameters({"a","b"})
    @Test(priority = 2)

    public void atest(int a,int b) {
        int total=a+b;
        System.out.println(total);
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

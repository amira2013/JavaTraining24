package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserParametrization {
@Parameters({"x","y"})
    @Test
    public void subs(int c,int d){
    int result=c-d;
    System.out.println("the multiplication  of  the two given numbers are : "+result);

}
}

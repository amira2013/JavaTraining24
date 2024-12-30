package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Rprop {
    public static void add(int a,int b){

        System.out.println(a+b);
    }

}
 class main extends Rprop{
    public static void subs(int c,int d){

        System.out.println(c-d);
    }

    public static void main(String[] args) {

        subs(9,7);

add(7,9);

    }
}

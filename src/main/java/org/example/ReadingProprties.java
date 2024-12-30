package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProprties {
    public static void main(String[] args) throws IOException {


    File file=new File("src/main/Config.properties");


            FileInputStream fis = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(fis);
            String user = prop.getProperty("username");
            String url = prop.getProperty("url");
            System.out.println(user + "   " + url);


}}

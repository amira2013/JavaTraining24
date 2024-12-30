package org.example;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.io.FileHandler;

public class ScreenshotSeleniumDemo {
    public static void main(String[] args) throws IOException {

    
     System.setProperty("webdriver.chrome.driver","C:\\Users\\STUDENTLOANER\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");

    WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println(title);

        TakesScreenshot scrn= (TakesScreenshot) driver;

        File source=scrn.getScreenshotAs(OutputType.FILE);
        File target=new File("C:\\Users\\STUDENTLOANER\\IdeaProjects\\SeleniumLearning\\src\\screen3\\screen3.png");
       FileHandler.copy(source,target);
            }
        }


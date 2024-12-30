package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionConcept {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\STUDENTLOANER\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://lottiefiles.com/");
        driver.manage().window().maximize();
        WebElement product =driver.findElement(By.xpath("//*[@id=\"Products\"]/div[1]/p"));
        Actions action=new Actions(driver);
        action.moveToElement(product).perform();
       WebElement img= driver.findElement(By.xpath("//*[@id=\"submenu-link\"]/div/div/div/img"));
action.click(img).perform();
}}

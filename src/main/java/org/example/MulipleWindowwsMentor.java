package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MulipleWindowwsMentor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\STUDENTLOANER\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/au/");
        driver.manage().window().maximize();
        WebElement tryForFree= driver.findElement(By.xpath("//*[@id=\"1727194472988_l1b\"]/div[1]/article/div[2]/div/pbc-button[1]/a"));
        tryForFree.click();
        Thread.sleep(4000);
        Set<String> windows =driver.getWindowHandles();
        System.out.println("The window handels are :"+windows);
        Iterator<String>it =windows.iterator();
        String parentWindow=it.next();
        String childwidow=it.next();
        driver.switchTo().window(childwidow);


        driver.findElement(By.name("UserFirstName")).sendKeys("Samito");
        driver.findElement(By.name("UserLastName")).sendKeys("Lina");
}}

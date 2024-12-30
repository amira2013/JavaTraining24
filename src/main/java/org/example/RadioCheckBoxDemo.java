package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioCheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\STUDENTLOANER\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();
        /*JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,-250)");*/
        WebElement redBox =driver.findElement(By.xpath("//input[@value='red']"));
        redBox.click();
        WebElement blueBoxBox =driver.findElement(By.xpath("//input[@value='blue']"));

        blueBoxBox.click();


        boolean selected=redBox.isSelected();
        boolean disply= redBox.isDisplayed();
        boolean enable= redBox.isEnabled();
        System.out.println("is selected  :"+selected);
        System.out.println("is displeyed:"+disply);
        System.out.println("is enabled  :"+enable);
        List<WebElement>listOfcheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(listOfcheckboxes.size());
        for (WebElement checkBox:listOfcheckboxes
             ) {if(!checkBox.isSelected()){
                 checkBox.click();
        }

        }}}



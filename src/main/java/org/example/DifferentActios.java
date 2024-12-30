package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentActios {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\STUDENTLOANER\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        //driver.findElement(By.xpath("//a[text()='Register']")).click();
        WebElement linkText=driver.findElement(By.linkText("Register"));
        linkText.click();
        WebElement firstName =driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Sami");
        WebElement lastName= driver.findElement(By.name("customer.lastName"));
        lastName.sendKeys("Chima");
        WebElement heading=driver.findElement(By.tagName("h1"));
        driver.findElement(By.xpath("//*[contains( @ id,'customer.address.street')]")).sendKeys("adress");
        String head=heading.getText();
        WebElement ssn=driver.findElement(By.xpath("//*[@ id ='customer.ssn']"));
        ssn.sendKeys("12345");
        System.out.println(head);
      //  driver.close();
    }
}

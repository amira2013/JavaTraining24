package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProviderConcept {
  @DataProvider
    public static Object[][]testData(){
      return new Object[][]{{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"},{"performance_glitch_user","secret_sauce"}};

  }
  @Test(dataProvider = "testData")
          public void test(String username,String password) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver","C:\\Users\\STUDENTLOANER\\IdeaProjects\\SeleniumLearning\\src\\main\\drivers\\chromedriver.exe");

    WebDriver driver=new ChromeDriver();
    driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("user-name")).sendKeys(username);
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    driver.findElement(By.id("login-button")).click();
    Thread.sleep(2000);
    driver.close();


    }}



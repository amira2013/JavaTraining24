package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

       public WebDriver driver;
        public void setup(){
        String userdir=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",userdir+"\\src\\main\\drivers\\chromedriver.exe");

         driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.navigate().refresh();
       driver.findElement(By.xpath("//a[@href=\"register.htm\"]")).click();
}
public void teardown(){

                driver.close();

}
}

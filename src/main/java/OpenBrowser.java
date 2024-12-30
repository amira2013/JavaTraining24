import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class OpenBrowser {
    public static void main(String[] args) {
       String userdir=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",userdir+"\\src\\main\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
       /* Dimension d=new Dimension(700,800);
        driver.manage().window().setSize(d);*/
       String url= driver.getCurrentUrl();
        System.out.println("The url is   :"+url);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                .sendKeys("Iphone"+ Keys.ENTER);
       // driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Ipad"+ Keys.ENTER);
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Ipad"+ Keys.ENTER);
        //driver.close();

       // System.out.println("curreny dir is : "+userdir);
    }
}

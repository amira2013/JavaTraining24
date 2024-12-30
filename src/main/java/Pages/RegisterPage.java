package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    WebDriver driver;
    @FindBy(id = "customer.firstName")
    WebElement cutsFirstName;
    @FindBy(id = "customer.lastName")
    WebElement cutsLastName;
    @FindBy(id = "customer.address.street")
    WebElement custAddress;
    @FindBy(id = "customer.address.city")
    WebElement custCity;
    public RegisterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void enterFirstName(String firstNme){
       cutsFirstName.sendKeys(firstNme);
    }
    public void enterlastName(String lastNme){
        cutsLastName.sendKeys(lastNme);
    }
    public void enterCustomerAdress(String address){
        custAddress.sendKeys(address);
    }

}

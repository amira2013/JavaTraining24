package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTest;
import Pages.RegisterPage;
public class LoginTest extends BaseTest {

    RegisterPage loginpage;
    @BeforeMethod
    public void setUp(){
        setup();
        loginpage=new RegisterPage(driver);
    }
    @Test
    public void registerLogin(){
        loginpage.enterFirstName("Sami");
        loginpage.enterlastName("Diaz");
        loginpage.enterCustomerAdress("123 Main St");

    }
 /*   @AfterMethod
    public void tearDown(){
        teardown();
    }*/


}

package part2.com.saucedemo.tests.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMsg () {
        loginPage.setUserName("standard_user");
        loginPage.setPassword("WrongPassword");
        loginPage.clickLogin();
        String actualMessage =  loginPage.getErrorMsg();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));

    }
}

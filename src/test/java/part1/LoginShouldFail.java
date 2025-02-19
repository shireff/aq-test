package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.WebDriverUtil;

public class LoginShouldFail {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = WebDriverUtil.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void tearDown() {
        WebDriverUtil.closeDriver();
    }

    @Test
    public void testLoginShouldFail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("wrongPassword");
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        String actualErrorMessage = driver.findElement(By.className("oxd-alert-content-text")).getText();
        String expectedErrorMessage = "Invalid credentials";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, actualErrorMessage);
    }
}

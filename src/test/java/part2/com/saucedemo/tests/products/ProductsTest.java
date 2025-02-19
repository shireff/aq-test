package part2.com.saucedemo.tests.products;

import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed(){
        loginPage.loginIntoApp("standard_user", "secret_sauce");
    }
}

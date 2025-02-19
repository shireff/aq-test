package com.saucedemo.com;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMsg= By.cssSelector("#login_button_container h3");



    public void setUserName(String userName) {
        set(usernameField, userName);
    }

    public void setPassword(String pass) {
        set(passwordField, pass);
    }

    public ProductsPage clickLogin(){
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage loginIntoApp (String userName, String password) {
        setUserName(userName);
        setPassword(password);
        return clickLogin();
    }

    public String getErrorMsg() {
        return find(errorMsg).getText();
    }

}

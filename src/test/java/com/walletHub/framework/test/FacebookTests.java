package com.walletHub.framework.test;

import com.Methods.FacebookMethods;
import com.framework.pages.utilities.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.framework.pages.pages.FacebookBody;



public class FacebookTests extends DriverManager{
    private WebDriver driver;
    private FacebookMethods facebookMethods;

    @BeforeMethod
    public void before() {
        driver = openBrowser();
        facebookMethods = new FacebookMethods(driver, new FacebookBody(driver));
    }

    @Test
    public void loginTest() {

        facebookMethods.loginFacebook();

        facebookMethods.addPost();

        facebookMethods.assertPostPublished();
    }

    @AfterMethod
    public void tearDown() {

        DriverManager.quitDriver();
    }
}

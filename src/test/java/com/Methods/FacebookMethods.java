package com.Methods;

import com.framework.pages.pages.FacebookBody;
import com.framework.pages.utilities.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FacebookMethods {

    private WebDriver driver;
    private FacebookBody facebookBody;

    public FacebookMethods(WebDriver driver, FacebookBody facebookBody) {
        this.driver = driver;
        this.facebookBody = facebookBody;
    }

    public void loginFacebook(){

        facebookBody.enterUsername("");
        facebookBody.enterPassword("");
        facebookBody.clickLoginButton();
    }

    public void addPost() {

        facebookBody.clickPostField();
        facebookBody.addTextField();
        facebookBody.clickPostButton();
    }

    public void assertPostPublished() {

        facebookBody.postIsPublished();
    }

}

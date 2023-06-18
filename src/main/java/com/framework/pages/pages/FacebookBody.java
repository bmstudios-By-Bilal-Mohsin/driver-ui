package com.framework.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.framework.pages.utilities.ElementUtils.waitForElement;

public class FacebookBody {
    private WebDriver driver;
    private final String enterPost = "[role=\"textbox\"]";

    @FindBy(id = "email")
    private WebElement usernameInput;

    @FindBy(id = "pass")
    private WebElement passwordInput;

    @FindBy(css = "[name='login']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[contains(text(), 'on your mind')]")
    private WebElement postField;

    @FindBy(css = enterPost)
    private WebElement enterPostField;

    @FindBy(xpath = "//span[text() = 'Post']")
    private WebElement postButton;

    @FindBy(xpath = "//div[text() = 'sfsdfsdds']")
    private WebElement postedPost;

    public FacebookBody(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickPostField() {

        postField.click();
    }

    public void addTextField(){

        waitForElement(driver, By.cssSelector(enterPost), 10);
        enterPostField.sendKeys("HelloWorld from WalletHub");
    }

    public void clickPostButton(){

        postButton.click();
    }

    public void postIsPublished(){

        postedPost.isDisplayed();
    }
}


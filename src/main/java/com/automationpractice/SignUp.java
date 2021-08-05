package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
    private static String url = "http://automationpractice.com/index.php";
    private WebDriver driver;

    @FindBy (linkText = "Sign in")
    private WebElement signInButton;


    public SignUp (WebDriver newDriver) {
        this.driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        SignUp.url = url;
    }

    public void SignInButton() {
        signInButton.click();
    }

    }


   

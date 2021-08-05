package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class LogInPage {
        private static String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        private WebDriver driver;

    public LogInPage (WebDriver newDriver) {
        this.driver = newDriver;
        PageFactory.initElements(driver, this);
        }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        LogInPage.url = url;
    }

    @FindBy(id = "email")
    private WebElement emailAddress;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy (id = "SubmitLogin")
    private WebElement signInButton;

    public void inputEmailAddress (String testUser){
        emailAddress.sendKeys("cenane6452@186site.com");
    }

    public void inputPassword (String testUser){
        password.sendKeys("6452ane!");
    }

    public void signInToAccount(){
        signInButton.click();
    }
}

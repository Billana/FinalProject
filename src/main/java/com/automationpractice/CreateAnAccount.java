package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {
    private static String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private WebDriver driver;

    @FindBy(id = "email_create")
    private WebElement emailAddress;

    @FindBy (id = "SubmitCreate")
    private WebElement createAnAccountButton;

    public CreateAnAccount  (WebDriver newDriver) {
        this.driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        CreateAnAccount.url = url;
    }

    public void inputEmailAddress(String testUser){
        emailAddress.sendKeys("cenane6452@186sites.com");
    }
    public void CreateAnAccountFinish(){
        createAnAccountButton.click();
    }
}
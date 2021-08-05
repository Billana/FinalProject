package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopBanner {
    private static String url = "http://automationpractice.com/index.php";
    private WebDriver driver;

    @FindBy(css = ".row > a > .img-responsive")
    private WebElement saleBanner;

    public TopBanner (WebDriver newDriver) {
        this.driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        TopBanner.url = url;
    }

    public void saleBannerClick() {
        saleBanner.click();
    }


    }


   

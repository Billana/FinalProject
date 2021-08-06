package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PurchaseTestSignUp {
    private WebDriver driver;
    private PurchaseSignUp projectPage;
    private SoftAssert softAssertHellper;
    private String startPageUrl = "http://automationpractice.com/index.php";
  
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        projectPage = new PurchaseSignUp(driver);
        driver.get(startPageUrl);
        softAssertHellper = new SoftAssert();
    }

    @Test
    public void Purchase() {
        projectPage.firstProductOpen();
        projectPage.sizeSelect();
        projectPage.colorSelect();
        projectPage.addToCart();
        projectPage.proceedToCheckout();
        projectPage.nextStep2();
        projectPage.signUp();
        projectPage.personalInformation();
        projectPage.nextStep4();
        projectPage.payByWire();
        projectPage.confirmOrder();
        softAssertHellper.assertEquals(driver.getCurrentUrl(),"");


    }

    @AfterTest
    public void tearDown(){
      driver.quit();
    }
}

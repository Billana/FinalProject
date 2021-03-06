package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PurchaseTest {
    private WebDriver driver;
    private Purchase projectPage;
    private SoftAssert softAssertHellper;
    private String startPageUrl = "http://automationpractice.com/index.php";
  
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        projectPage = new Purchase(driver);
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
        projectPage.logIn();
        projectPage.nextStep3();
        projectPage.nextStep4();
        projectPage.payByWire();
        projectPage.confirmOrder();
        softAssertHellper.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=order-confirmation&id_cart=3525001&id_module=3&id_order=349524&key=071600e0c0ee6ec2f40300ce63e3452f");


    }

    @AfterTest
    public void tearDown(){
      driver.quit();
    }
}

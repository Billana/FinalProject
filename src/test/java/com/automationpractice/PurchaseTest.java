package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PurchaseTest {
    private WebDriver driver;
    private Purchase projectPage;
    private String startPageUrl = "http://automationpractice.com/index.php";
  
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        projectPage = new Purchase(driver);
        driver.get(startPageUrl);
    }

    @Test
    public void Purchase() {
        projectPage.firstProductOpen();
        projectPage.sizeSelect();
        // projectPage.colorSelect();
        //projectPage.addToWishList();
        // projectPage.addToCart();
        // projectPage.cartLayer();
    }

    @AfterTest
    public void tearDown(){
      driver.quit();
    }
}

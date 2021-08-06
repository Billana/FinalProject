package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

public class AddProductToBasketTest {
    private WebDriver driver;
    private AddProductToBasket projectPage;
  
    @BeforeTest
    public void setUp(){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      projectPage = new AddProductToBasket(driver);
      driver.get("http://automationpractice.com/index.php");
    }
  
    @Test
    public void AddProductToBasket() {
        projectPage.selectWomenCategory();
        // projectPage.browseWomenTops();
        // projectPage.sizeCheckBox();
        // projectPage.colourCheckBox();

        WebElement firstProductItem = driver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1)"));
        Actions hover = new Actions(driver);
        hover.moveToElement(firstProductItem);
        hover.build();
        hover.perform();

        WebElement addToCartButton = firstProductItem.findElement(By.cssSelector("a.ajax_add_to_cart_button"));
        addToCartButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("layer_cart")));

        WebElement cartModalElement = driver.findElement(By.id("layer_cart"));

        WebElement cartHeading = cartModalElement.findElement(By.cssSelector("div.layer_cart_cart > h2"));
        assertEquals("There is 1 item in your cart.", cartHeading.getText());

    }

    @AfterTest
    public void tearDown(){
      driver.quit();
    }
}

package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TopBannerTest {
  private WebDriver driver;
  private TopBanner projectPage;
  private SoftAssert softAssertHellper;
  private String startPageUrl = "http://automationpractice.com/index.php";

    @BeforeTest
    public void setUp(){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      projectPage = new TopBanner(driver);
      driver.get(startPageUrl);
      softAssertHellper = new SoftAssert();
    }
  
    @Test
    public void saleBannerIsClickable() {
      projectPage.saleBannerClick();
      softAssertHellper.assertEquals(driver.getCurrentUrl(), startPageUrl);
    }

    @AfterTest
    public void tearDown(){
      driver.quit();
    }
}

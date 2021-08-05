package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SignUpTest {
  private WebDriver driver;
  private SignUp projectPage;
  private SoftAssert softAssertHellper;
  private String startPageUrl = "http://automationpractice.com/index.php";
  private String autenthicationPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    @BeforeTest
    public void setUp(){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      projectPage = new SignUp(driver);
      driver.get(startPageUrl);
      softAssertHellper = new SoftAssert();
    }
  
    @Test
    public void SignUpHomepageButton() {
      projectPage.SignInButton();
      softAssertHellper.assertEquals(driver.getCurrentUrl(), autenthicationPage);

    }

    @AfterTest
    public void tearDown(){
      driver.quit();
    }
}

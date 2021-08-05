package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
// import com.automationpractice.SignInPageTest;
// import com.automationpractice.CreateAnAccount;

public class CreateAnAccountTest {
    private WebDriver driver;
    private CreateAnAccount projectPage;  
    private SoftAssert softAssertHellper;
    private String autenthicationPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private String enterDataPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
  
    @BeforeTest
    public void setUp(){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      projectPage = new CreateAnAccount(driver);
      driver.get(autenthicationPage);
      softAssertHellper = new SoftAssert();
    }
  
    @Test
    public void CreateAnAccount() {
        projectPage.inputEmailAddress("cenane6452@186sites.com");
        projectPage.CreateAnAccountFinish();
        softAssertHellper.assertEquals(driver.getCurrentUrl(), enterDataPage);
    }

    @AfterTest
    public void tearDown(){
      driver.quit();
    }
}

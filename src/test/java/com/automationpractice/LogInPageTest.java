package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LogInPageTest {
    private WebDriver driver;
    private SoftAssert softAssertHellper;
    private LogInPage projectPage;  
    private String autenthicationPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";  
    private String accountPage = "http://automationpractice.com/index.php?controller=my-account";
  
    @BeforeTest
    public void setUp() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      projectPage = new LogInPage (driver);
      driver.get(autenthicationPage);
      softAssertHellper = new SoftAssert();

    }
  
    @Test
    public void personalInformation() {
        projectPage.inputEmailAddress("cenane6452@186site.com");
        projectPage.inputPassword("6452ane!");
        projectPage.signInToAccount();
        softAssertHellper.assertEquals(driver.getCurrentUrl(), accountPage);
    }

    @AfterTest
    public void tearDown(){
       driver.quit();
    }
    
}

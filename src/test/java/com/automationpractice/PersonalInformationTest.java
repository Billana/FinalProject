package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// import org.testng.asserts.SoftAssert;

public class PersonalInformationTest {
    private WebDriver driver;
    private PersonalInformation projectPage;  
    // private SoftAssert softAssertHellper;
    private String autenthicationPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
  
    @BeforeTest
    public void setUp(){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      projectPage = new PersonalInformation(driver);
      driver.get(autenthicationPage);
      projectPage.inputEmailAddress("cenane6452@186site.com");
      projectPage.CreateAnAccountFinish();    
}
  
    @Test
    public void PersonalInformation() {
        projectPage.inputFirstName("Cen");
        projectPage.inputLastName("Ane");
    //     projectPage.CreateAnAccountFinish();
    //     softAssertHellper.assertEquals(driver.getCurrentUrl(), enterDataPage);
    // }

    // @AfterTest
    // public void tearDown(){
    //   driver.quit();
    }
}

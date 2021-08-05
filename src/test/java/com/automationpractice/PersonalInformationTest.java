package com.automationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class PersonalInformationTest {
    private WebDriver driver;
    private PersonalInformation projectPage;  
    private String autenthicationPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";  
  
    @BeforeTest
    public void setUp() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      projectPage = new PersonalInformation(driver);
      driver.get(autenthicationPage);
      projectPage.inputEmailAddress("cenane6452@186site.com");
      projectPage.CreateAnAccountFinish();
    }
  
    @Test
    public void PersonalInformation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
        projectPage.inputFirstName("Cen");
        projectPage.inputLastName("Ane");
        projectPage.inputPassword("6452ane!");
        projectPage.inputAddress("Somewhere 1");
        projectPage.inputCity("New York");
        projectPage.selectState();
        projectPage.inputPostalCode("10872");
        projectPage.selectCountry();
        projectPage.inputphoneNumber("01234567891");
        projectPage.registrationFinish();


    }

    @AfterTest
    public void tearDown(){
       driver.quit();
    }
}

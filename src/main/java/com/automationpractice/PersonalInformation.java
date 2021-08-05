package com.automationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automationpractice.CreateAnAccount;

    public class PersonalInformation {
        private static String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        private WebDriver driver;

    public PersonalInformation (WebDriver newDriver) {
        this.driver = newDriver;
        PageFactory.initElements(driver, this);
        }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        PersonalInformation.url = url;
    }

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "firstname")
    private WebElement addressFirstName;

    @FindBy(id = "lastname")
    private WebElement addressLastName;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postalCode;

    @FindBy(id = "id_country")
    private WebElement country;

    @FindBy(id = "phone_mobile")
    private WebElement phone;

    @FindBy(id = "alias")
    private WebElement address2;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    @FindBy(id = "email_create")
    private WebElement emailAddress;

    @FindBy (id = "SubmitCreate")
    private WebElement createAnAccountButton;

    public void inputEmailAddress(String testUser){
        emailAddress.sendKeys("cenane6452@186site.com");
    }
    public void CreateAnAccountFinish(){
        createAnAccountButton.click();
    }

    public void inputFirstName(String testUser){
        customerFirstName.sendKeys("Cen");
        //addressFirstName.sendKeys("Cen");
    }

    public void inputLastName(String testUser){
        customerLastName.sendKeys("Ane");        
        //addressLastName.sendKeys("Ane");
    }

    public void inputPassword(String testUser){
        password.sendKeys("6452ane!");
    }

    // public void inputAddressName(String testUser){
    //     addressName.sendKeys("Cen");
    // }

    // public void inputAddressLastName(String testUser){
    //     addressLastName.sendKeys("Ane");
    // }
    
    
    // public void CreateAnAccountFinish(){
    //     createAnAccountButton.click();
    // }
}
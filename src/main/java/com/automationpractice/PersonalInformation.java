package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

    public class PersonalInformation {
        private static String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
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

    @FindBy(id = "email_create")
    private WebElement emailAddress;

    @FindBy (id = "SubmitCreate")
    private WebElement createAnAccountButton;
    
    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "uniform-id_state")
    private WebElement state;

    @FindBy(id = "postcode")
    private WebElement postalCode;

    @FindBy(id = "uniform-id_country")
    private WebElement country;

    @FindBy(id = "phone_mobile")
    private WebElement phone;

    @FindBy(id = "alias")
    private WebElement address2;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;


    public void inputEmailAddress(String testUser){
        emailAddress.sendKeys("cenane6452@186site.com");
    }
    public void CreateAnAccountFinish(){
        createAnAccountButton.click();
    }

    public void inputFirstName(String testUser){
        customerFirstName.sendKeys("Cen");
    }

    public void inputLastName(String testUser){
        customerLastName.sendKeys("Ane");        
    }

    public void inputPassword(String testUser){
        password.sendKeys("6452ane!");
    }
    
    public void inputAddress (String testUser){
        address.sendKeys("Somewhere 1");
    }

    public void inputCity (String testUser){
        city.sendKeys("New York");
    }

    public void selectState () {
        state.click(); 
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByValue("32");
    }

    public void inputPostalCode (String testUser){
        postalCode.sendKeys("10872");
    }

    public void selectCountry () {
        country.click();
        Select country = new Select(driver.findElement(By.id("id_country")));
        country.selectByValue("21");
    }

    public void inputphoneNumber (String testUser) {
        phone.sendKeys("01234567891");
    }

    public void registrationFinish () {
        registerButton.click();
    }
}

package com.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseSignUp {
    private static String url = "http://automationpractice.com/index.php";
    private WebDriver driver;
    public PurchaseSignUp (WebDriver newDriver) {
        this.driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        PurchaseSignUp.url = url;
    }

    @FindBy (linkText = "Faded Short Sleeve T-shirts") 
    private WebElement firstProduct;

    @FindBy (id = "quantity_wanted")
    private WebElement quantity;

    @FindBy (className = "icon-minus")
    private WebElement quantityDelete;

    @FindBy (className = "icon-plus")
    private WebElement quantityAdd;

    @FindBy (id = "uniform-group_1")
    private WebElement size;

    @FindBy (id = "color_13")
    private WebElement color;

    @FindBy (id = "add_to_cart")
    private WebElement addToCartButton;

    @FindBy(id = "email_create")
    private WebElement emailAddress;

    @FindBy(id = "SubmitCreate")
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

    public void firstProductOpen() {
        firstProduct.click();
    }

    public void quantitySet (String testUser) {
        quantity.sendKeys("2");
    }

    public void quantitySet2 () {
        quantityDelete.click();
        quantityAdd.click();
    }

    public void sizeSelect(){
        size.click(); 
        Select size = new Select(driver.findElement(By.id("group_1")));
        size.selectByValue("2");
    }

    public void colorSelect(){
        color.click();
    }

    public void addToWishList(){
        addToWishListButton.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void proceedToCheckout () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("layer_cart")));

        WebElement proceedToCheckout = driver.findElement(By.cssSelector("div.button-container > a"));
        proceedToCheckout.click();
    }

    public void nextStep2 () {
        WebElement proceedToCheckout = driver.findElement(By.cssSelector("p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium"));
        proceedToCheckout.click();      
    } 

    public void signUp () {
        emailAddress.sendKeys("cenane6452@186sitesa.com");        
        createAnAccountButton.click();
    }

    public void personalInformation () {
        customerFirstName.sendKeys("Cen");
        customerLastName.sendKeys("Ane");        
        password.sendKeys("6452ane!");
        address.sendKeys("Somewhere 1");
        city.sendKeys("New York");
        state.click(); 
        Select state = new Select(driver.findElement(By.id("id_state")));
        state.selectByValue("32");
        postalCode.sendKeys("10872");
        country.click();
        Select country = new Select(driver.findElement(By.id("id_country")));
        country.selectByValue("21");
        phone.sendKeys("01234567891");
        registerButton.click();
    }

    public void nextStep4 () {
        WebElement checkbox = driver.findElement(By.id("cgv"));
        checkbox.click();  
        WebElement proceedToCheckout2 = driver.findElement(By.cssSelector("#form > p > button"));
        proceedToCheckout2.click(); 
    }

    public void payByWire () {
        WebElement payButton = driver.findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a"));
        payButton.click(); 
    }

    public void confirmOrder () {
        WebElement confirmButton = driver.findElement(By.cssSelector("#cart_navigation > button > span"));
    confirmButton.click(); 
    }

    
}
package com.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Purchase {
    private static String url = "http://automationpractice.com/index.php";
    private WebDriver driver;
    private SoftAssert softAssertHellper;

    public Purchase (WebDriver newDriver) {
        this.driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Purchase.url = url;
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
    
    @FindBy (id = "wishlist_button")
    private WebElement addToWishListButton;

    @FindBy (id = "add_to_cart")
    private WebElement addToCartButton;

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
    
    public void nextStep3 () {
        WebElement proceedToCheckout1 = driver.findElement(By.cssSelector("p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium"));
        proceedToCheckout1.click();  
    }

    // public void nextStep4 () {
    //     WebElement proceedToCheckout = driver.findElement(By.cssSelector("#center_column > form > p > button"));
    //     proceedToCheckout.click();   
    // }
   


    
}
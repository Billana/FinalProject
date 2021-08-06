package com.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddProductToBasket {
    private static String url = "http://automationpractice.com/index.php";
    private WebDriver driver;

    @FindBy(linkText = "Women")
    private WebElement womenCategory;

    @FindBy(linkText = "Tops")
    private WebElement womenTops;

    public AddProductToBasket (WebDriver newDriver) {
        this.driver = newDriver;
        PageFactory.initElements(driver, this);
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        AddProductToBasket.url = url;
    }

    public void selectWomenCategory(){
        womenCategory.click();
    }
    public void browseWomenTops(){
        womenTops.click();
    }

    public void sizeCheckBox(){
        WebElement checkbox = driver.findElement(By.id("uniform-layered_id_attribute_group_1"));
        checkbox.click();
    }

    public void colourCheckBox(){
        WebElement checkbox = driver.findElement(By.id("layered_id_attribute_group_8"));
        checkbox.click();
    }
}

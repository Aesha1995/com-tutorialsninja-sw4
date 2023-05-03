package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartText =By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By productText =By.xpath("(//a[contains(text(),'HP LP3065')])[2]");
    By mackBookText =By.xpath("(//a[contains(text(),'MacBook')])[2]");
    By modelText =By.xpath("//td[normalize-space()='Product 21']");
    By deliveryDateText =By.xpath("(//small)[2]");
    By quantity =By.xpath("//input[contains(@name,'quantity')]");
    By updateButton =By.xpath("//i[@class='fa fa-refresh']");
    By successText =By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By priceText =By.xpath("(//td[@class='text-right'][normalize-space()='$122.00'])[4]");
    By mackBookPriceText =By.xpath("(//td[@class='text-right'][normalize-space()='$1,204.00'])[3]");
    By checkOut =By.xpath("//a[@class='btn btn-primary']");


    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getProductText(){
        return getTextFromElement(productText);
    }
    public String getMackBookText(){
        return getTextFromElement(mackBookText);
    }
    public String getModelText(){
        return getTextFromElement(modelText);
    }
    public String getDeliveryDateText(){
        return getTextFromElement(deliveryDateText);
    }
    public String getPriceText(){
        return getTextFromElement(priceText);
    }
    public void updateQuantity(String value){
        driver.findElement(quantity).clear();
        sendTextToElement(quantity,value);
        clickOnElement(updateButton);
    }
    public String getSuccessText(){
        return getTextFromElement(successText);
    }
    public String getMackBookPriceText(){
        return getTextFromElement(mackBookPriceText);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOut);
    }

}

package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HPLP3065 extends Utility {
    By textHP3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By button = By.xpath("//div[@class = 'input-group date']//button");
    By monthAndYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By nextSign = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By dates = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By successFullText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    public String getHP3065Text(){
        return getTextFromElement(textHP3065);
    }
    public void selectDate(){
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(button);
        while (true) {
            String monAndYear = driver.findElement(monthAndYear).getText();
            String[] arr = monAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextSign);
            }
        }

        List<WebElement> dateList = driver.findElements(dates);
        for (WebElement list :dateList) {
            if(list.getText().equalsIgnoreCase(date)){
                list.click();
                break;
            }
        }

    }
    public String getSuccessFullText() {
        return getTextFromElement(successFullText);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
}

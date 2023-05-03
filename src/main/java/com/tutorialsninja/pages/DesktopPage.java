package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    By desktopText = By.xpath("//h2[contains(text(),'Desktops')]");
    By product = By.xpath("//h4/a");
    By defaultText = By.xpath("//select[@id='input-sort']");
    By HPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    public void selectPositionZtoA(String text){
        selectByVisibleTextFromDropDown(defaultText,text);
    }
    public String getDesktopText(){
        return getTextFromElement(desktopText);
    }
    public ArrayList<String> getProductList(){
        List<WebElement> beforeFilterProductList = driver.findElements(product);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement productList : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(productList));
        }
        Collections.sort(beforeFilterProductList1);
        Collections.reverse(beforeFilterProductList1);
        return beforeFilterProductList1;
    }
    public ArrayList<String> getProductList1(){
        List<WebElement> afterFilterProductList = driver.findElements(product);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement productList1 :afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(productList1));
        }
        Collections.sort(afterFilterProductList1);
        Collections.reverse(afterFilterProductList1);
        return afterFilterProductList1;
    }
    public void selectAtoZ(String text1){
        selectByVisibleTextFromDropDown(defaultText,text1);
    }
    public void selectHPLP3065(){
        clickOnElement(HPLP3065);
    }
}

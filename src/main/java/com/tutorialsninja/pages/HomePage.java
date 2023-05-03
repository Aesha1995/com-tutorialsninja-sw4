package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktop = By.linkText("Desktops");
    By laptopNotebooks = By.linkText("Laptops & Notebooks");
    By components = By.linkText("Components");
    By accountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
    By myAccount = By.xpath("//h2[normalize-space()='My Account']");
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(topMenu);
        }
    }
    public void mouseHoverOnDesktop(){
        mouseHoverToElementAndClick(desktop);
    }
    public void mouseHoverOnShowAllDesktop(String menu){
        selectMenu(menu);
    }
    public void mouseHoverOnLaptopsAndNotebooks(){
        mouseHoverToElementAndClick(laptopNotebooks);
    }
    public void mouseHoverOnShowAllLaptopsAndNotebooks(String menu){
        selectMenu(menu);
    }
    public void mouseHoverOnComponents()
    {
        mouseHoverToElementAndClick(components);
    }
    public void clickOnShowAllComponents(String menu)
    {
        selectMenu(menu);
    }
    public String getAccountLogoutText() {
        return getTextFromElement(accountLogout);
    }
    public String getMyAccountText(){
        return getTextFromElement(myAccount);
    }

}

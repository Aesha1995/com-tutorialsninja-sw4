package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {
    By myAccount = By.xpath("//span[normalize-space()='My Account']");

    public void selectMyAccountOptions(String option){
        clickOnElement(myAccount);
        clickOnElement(By.xpath("(//a[normalize-space()='" + option + "'])[1]"));
    }
}

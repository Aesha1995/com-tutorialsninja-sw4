package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HPLP3065;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    HPLP3065 hplp3065 = new HPLP3065();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        homePage.mouseHoverOnDesktop();
        homePage.mouseHoverOnShowAllDesktop("Show AllDesktops");
        desktopPage.selectPositionZtoA("Name (Z - A)");
        Assert.assertEquals(desktopPage.getProductList(),desktopPage.getProductList1());
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        homePage.mouseHoverOnDesktop();
        homePage.mouseHoverOnShowAllDesktop("Show AllDesktops");
        desktopPage.selectAtoZ("Name (A - Z)");
        desktopPage.selectHPLP3065();
        Assert.assertEquals(hplp3065.getHP3065Text(),"HP LP3065");
        hplp3065.selectDate();
        hplp3065.clickOnAddToCart();

        String expectedMessage = "Success: You have added HP LP3065 to your shopping cart!\n";
        String actualMessage = hplp3065.getSuccessFullText();
        String[] actualMsg = actualMessage.split("×");
        Assert.assertEquals(expectedMessage, actualMsg[0]);

        hplp3065.clickOnShoppingCartLink();

        expectedMessage = "Shopping Cart  (1.00kg)";
        actualMessage = shoppingCartPage.getShoppingCartText();
        Assert.assertEquals(expectedMessage,actualMessage);

        expectedMessage = "HP LP3065";
        actualMessage = shoppingCartPage.getProductText();
        Assert.assertEquals(expectedMessage,actualMessage);

        expectedMessage = "2023-11-30";
        actualMessage = shoppingCartPage.getDeliveryDateText();
        String[] actualmsg1 = actualMessage.split(":");
        Assert.assertEquals(expectedMessage, actualmsg1[1]);

        expectedMessage = "Product 21";
        actualMessage = shoppingCartPage.getModelText();
        Assert.assertEquals(expectedMessage,actualMessage);

        expectedMessage = "$122.00";
        actualMessage = shoppingCartPage.getPriceText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }

}

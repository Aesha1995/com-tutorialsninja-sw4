package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.mouseHoverOnDesktop();
        homePage.mouseHoverOnShowAllDesktop("Show AllDesktops");
        Assert.assertEquals(desktopPage.getDesktopText(),"Desktops");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.mouseHoverOnLaptopsAndNotebooks();
        homePage.mouseHoverOnShowAllLaptopsAndNotebooks("Show AllLaptops & Notebooks");
        Assert.assertEquals(laptopsAndNotebooksPage.getTextLaptopAndNotebook(),"Laptops & Notebooks");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully()
    {
        homePage.mouseHoverOnComponents();
        homePage.clickOnShowAllComponents("Show AllComponents");
        Assert.assertEquals(componentsPage.getComponentText(),"Components");
    }
}

package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WishListStepDef {
    P03_HomePage wish = new P03_HomePage();

    @When("user click on love button")
    public void wishList() {
//Hooks.driver.findElement(By.cssSelector("class=\"bar-notification success\"")).getCssValue("background-color");
//        Hooks.driver.findElement(By.cssSelector("class=\"bar-notification success\"")).getText();
//        System.out.println(Hooks.driver.findElement(By.cssSelector("class=\"bar-notification success\"")).getText());

        wish.wishButton().click();
        // Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("product wishlist add successfully")
    public void wishAsert() {
        SoftAssert check = new SoftAssert();
        String wishTextSuccess = wish.wishText().getText();
        String expectedtext = "The product has been added to your wishlist";
        check.assertEquals(expectedtext, wishTextSuccess);
        System.out.println(wishTextSuccess);
        String backcolour = wish.wishText().getCssValue("background-color");
        String colour = "rgba(75, 176, 122, 1)";
        System.out.println(backcolour);
        check.assertEquals(backcolour, colour);
        check.assertAll();

    }

    @And("click on wishlist icon")
    public void wishlistIcon() {
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wish.wishcount().click();

    }

    @Then("verify number of specified product")
    public void verifyQuantity() {
        String quantity = wish.productQ().getAttribute("value");
        System.out.println(quantity);
        String value ="0";
        Assert.assertFalse(quantity == value);
    }
}


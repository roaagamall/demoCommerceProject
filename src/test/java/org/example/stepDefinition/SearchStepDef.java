package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchStepDef {
    P03_HomePage search = new P03_HomePage();

    String productName;
    String sku;

    @Given("test this value {string}")
    public void testThisValue(String sku) {
        this.sku = sku;
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(sku);
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);
        System.out.println("did");
        String skuValue =search.searchforproduct().getAttribute("value");
        System.out.println(skuValue);
        Assert.assertEquals(skuValue,sku);

        }

    @Given("test this values {string}")
    public void testThisValues(String productName) {
        this.productName = productName;
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(productName);
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);

    }
}




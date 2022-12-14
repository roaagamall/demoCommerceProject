package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.xml.stream.events.EntityReference;
import java.util.List;

public class SearchStepDef {

    String productName;
    String sku;



    @Given("test this value {string}")
    public void testThisValue(String sku) {
        this.sku = sku;
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(sku);
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys(Keys.ENTER);

       WebElement result = Hooks.driver.findElement(By.className("search-text valid"));
        System.out.println("did");

            int expectedResult = 1;
          System.out.println(result.getSize());
            Assert.assertEquals(expectedResult,result.getSize());
            System.out.println(result.getText());
        }


}




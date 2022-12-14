package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class CategoriesStepDef {




    @When("User go to home page and select random category")
    public void select_category(){
        List<WebElement> categories = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        int randomNumber = new Random().nextInt(3);
        Actions hover = new Actions(Hooks.driver);
        hover.moveToElement(categories.get(randomNumber)).perform();
        String mainCategory = categories.get(randomNumber).getText();
        System.out.println(mainCategory);
        List<WebElement> subCategories = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+randomNumber+"]/ul[@class=\"sublist first-level\"]/li"));
         int randomNumberSub = new Random().nextInt(3);
        String subCategory = subCategories.get(randomNumberSub).getText();
        System.out.println(subCategory);
        subCategories.get(randomNumberSub).click();
        String pageTitle =  Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText();
        Assert.assertTrue(pageTitle.contains(subCategory));

    }
    @And("select sub category from list")
    public void select_subCategory(){

    }
    @Then("check what you select")
    public void check (){
        System.out.println("done");

    }

}

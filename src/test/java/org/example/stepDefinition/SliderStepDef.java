package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SliderStepDef {
    @When("user click on slider image")
    public void slider1(){
        Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"]/img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]")).click();


    }
    @Then("user go to product page")
            public void urlassertion(){
        String expectedResult ="https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);

    }
    @When("user click on slider2 image")
    public void slider2(){
        Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"]/img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]")).click();
    }
    @Then("user go tO product page")
    public void urllassertion(){
        String expectedResultt ="https://demo.nopcommerce.com/iphone-6";
        String actualResultt = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResultt,actualResultt);

    }

}


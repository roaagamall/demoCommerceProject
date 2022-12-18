package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SliderStepDef {
    WebDriverWait  waiting = new WebDriverWait(Hooks.driver, Duration.ofMillis(8000));

    P03_HomePage slider = new P03_HomePage();
    @When("user click on slider image")
    public void slider1() {
        waiting.until(ExpectedConditions.attributeToBe(slider.sliderImg(),"style","display: block;"));

        slider.sliderImg().click();
        System.out.println("done");


    }
    @Then("user go to product page")
            public void urlassertion(){
        String expectedResult ="https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);

    }
    @When("user click on slider2 image")
    public void slider2() throws InterruptedException{
        waiting.until(ExpectedConditions.attributeToBe(slider.sliderImg1(),"style","display: block;"));
        slider.sliderImg1().click();
    }
    @Then("user go tO product page")
    public void urllassertion(){
        String expectedResultt ="https://demo.nopcommerce.com/iphone-6";
        String actualResultt = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResultt,actualResultt);

    }

}


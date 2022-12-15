package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SliderStepDef {
    P03_HomePage slider = new P03_HomePage();
    @When("user click on slider image")
    public void slider1() throws InterruptedException{
        Thread.sleep(4000);
       slider.sliderImg().click();
       System.out.println(slider.sliderImg().getText());


    }
    @Then("user go to product page")
            public void urlassertion(){
        String expectedResult ="https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);

    }
    @When("user click on slider2 image")
    public void slider2() throws InterruptedException{
        Thread.sleep(4000);
        slider.sliderImg1().click();
    }
    @Then("user go tO product page")
    public void urllassertion(){
        String expectedResultt ="https://demo.nopcommerce.com/iphone-6";
        String actualResultt = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResultt,actualResultt);

    }

}


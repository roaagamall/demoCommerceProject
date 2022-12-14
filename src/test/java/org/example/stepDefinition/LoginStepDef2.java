package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Registration;
import org.example.Pages.P02_Login;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginStepDef2 {
    P02_Login login = new P02_Login();
    @Given("user go to login page")
    public void loginPage(){
       login.logPage().click();
    }


    @And("user entre valid email \"test@example.com\" and password \"P@ssw0rd\"")
    public void validData(){
        login.emailLogin().sendKeys("tester@example.com");
        login.passwordLogin().sendKeys("P@ssw0rd");
    }


    @Then("user click on login button")
    public void loginButton(){
        login.logBUTTON().click();
    }
    @And("user entre invalid email \"wrong@example.com\" and valid password \"P@ssw0rd\"")
    public void invalidEmail(){
        login.emailLogin().sendKeys("wrong@example.com");
        login.passwordLogin().sendKeys("P@ssw0rd");
    }
    @And("unsuccessful message")
    public void unsuccessMesg(){
        SoftAssert softt = new SoftAssert();
        String expectedResult ="Login was unsuccessful. Please correct the errors and try again.";
        String actualResult = login.logText().getText();
        softt.assertTrue(actualResult.contains(expectedResult));
        String colourfail = login.logText().getCssValue("color");
        System.out.println(colourfail);
        String expectedColour ="rgba(228, 67, 75)";
        softt.assertTrue(colourfail.contains(expectedColour));
        softt.assertAll();
        System.out.println("firstassertion");
    }

}

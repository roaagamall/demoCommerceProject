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

    @And("user entre valid email and password")
    public void validData(){
        login.emailLogin().sendKeys("roaagamal004@gmail.com");
        login.passwordLogin().sendKeys("helloagain");
    }
    @And("check account button and url")
    public void accountBtnAssertion (){
        SoftAssert softt = new SoftAssert();
        String actualurl = Hooks.driver.getCurrentUrl();
        String expectUrl = "https://demo.nopcommerce.com/";
        softt.assertEquals(actualurl,expectUrl);
        System.out.println(actualurl);
        softt.assertTrue(login.accountBtn().isDisplayed());
        System.out.println("is displayed");
        softt.assertAll();

    }

    @Then("user click on login button")
    public void loginButton() throws InterruptedException{
        login.logBUTTON().click();
        Thread.sleep(4000);
        System.out.println("done");
    }
    @And("user entre invalid email \"wrong@example.com\" and valid password \"P@ssw0rd\"")
    public void invalidEmail(){
        login.emailLogin().sendKeys("wrong@example.com");
        login.passwordLogin().sendKeys("P@ssw0rd");
    }
    @And("unsuccessful message")
    public void unsuccessMesg(){
        SoftAssert softT = new SoftAssert();
        String expectedResult ="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualResult = login.logText().getText();
        System.out.println(actualResult);
        softT.assertTrue(actualResult.contains(expectedResult));
        String colourfail = login.logText().getCssValue("color");
        System.out.println(colourfail);
        String expectedColour ="rgba(228, 67, 75, 1)";
        softT.assertTrue(colourfail.contains(expectedColour));
        softT.assertAll();
        System.out.println("firstassertion");
    }

}

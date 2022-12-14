package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegistrationstepDef1 {

    P01_Registration register = new P01_Registration();
    @Given("user go to register page")
    public void registration(){
        register.registerLink().click();
    }
    @When("user entre gender type")
    public void gender(){
        register.genderType().click();

    }
    @And("user entre first name \"automation\" and last name \"tester\"")
    public void username(){
         register.firstName().sendKeys("automation");
         register.lastName().sendKeys("tester");
    }

    @And("user enter date of birth")
    public void dateofBirth(){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        select.selectByIndex(24);
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByValue("4");
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("1998");
    }
    @And("user entre valid email")
    public void validEmail(){
        register.emailValid().sendKeys("ttester@example.com");

    }
    @And("user entre password \"P@ssw0rd\" and confirm password \"P@ssw0rd\"")
    public void passwordField(){
        register.passwordNew().sendKeys("P@ssw0rd");
        register.confirmedPass().sendKeys("P@ssw0rd");
    }
    @And("click on registration button")
    public void registrationButton(){
        register.regBUTTON().click();
        System.out.println(Hooks.driver.getCurrentUrl());
       // Assert.assertEquals(Hooks.driver.getCurrentUrl(),""
    }
  @Then("you register successfully")
    public void successMesg(){
        SoftAssert soft = new SoftAssert();
      String regyText = register.successtext().getText();
      String actualText ="Your registration completed";
      soft.assertTrue(actualText.contains(regyText));
      String textColor = register.successtext().getCssValue("color");
      System.out.println(textColor);
      String expectedColor ="rgba(76, 177, 124, 1)";
      soft.assertTrue(textColor.contains(expectedColor));
       soft.assertAll();

     // Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
  }




}

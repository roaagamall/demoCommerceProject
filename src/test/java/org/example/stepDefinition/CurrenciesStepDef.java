package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class CurrenciesStepDef {

    @When("user click on currencies list and select currency")
    public void currencies(){
        Select select = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        select.selectByVisibleText("Euro");
        List<WebElement> elements =Hooks.driver.findElements(By.xpath("//div[@class=\"prices\"]"));

            for(WebElement element : elements){
                String expectedCurr ="€";
                String actualCurr = element.getText();
                Assert.assertEquals(actualCurr.contains(expectedCurr),true);
                System.out.println(element.getText());
            }
    }


}

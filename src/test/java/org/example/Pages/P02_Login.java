package org.example.Pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {

    public WebElement logPage(){
        WebElement log =  Hooks.driver.findElement(By.className("ico-login"));
        return log;
    }
    public WebElement emailLogin(){
        WebElement logEmail = Hooks.driver.findElement(By.id("Email"));
        return logEmail;
    }
    public WebElement passwordLogin(){
        WebElement logPassword = Hooks.driver.findElement(By.id("Password"));
        return logPassword;
    }
    public WebElement logBUTTON(){
        WebElement logBtn = Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
        return logBtn;
    }
    public WebElement logText(){
        WebElement loginText = Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
        return loginText;
    }
}

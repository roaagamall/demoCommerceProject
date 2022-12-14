package org.example.Pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class P01_Registration {
    public WebElement registerLink(){
        WebElement rg =  Hooks.driver.findElement(By.className("ico-register"));
        return rg;
    }
    public WebElement genderType(){
        WebElement genderT = Hooks.driver.findElement(By.className("male"));
        return genderT;
    }
    public WebElement firstName(){
        WebElement firstname = Hooks.driver.findElement(By.id("FirstName"));
        return firstname;
    }
    public WebElement lastName(){
        WebElement lastname = Hooks.driver.findElement(By.id("LastName"));
        return lastname;
    }
//    public WebElement dayBirth(){
//        WebElement dayNum = Hooks.driver.findElement(By.className("DateOfBirthDay"));
//        return dayNum;
//    }
//    public WebElement monthBirth(){
//        WebElement month = Hooks.driver.findElement(By.className("DateOfBirthMonth"));
//        return month;
//    }
//    public WebElement yearBirth(){
//        WebElement year = Hooks.driver.findElement(By.className("DateOfBirthYear"));
//        return year;
//    }
    public WebElement emailValid(){
        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }
    public WebElement passwordNew(){
        WebElement pass1 = Hooks.driver.findElement(By.id("Password"));
        return pass1;
    }
    public WebElement confirmedPass(){
        WebElement pass2 = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return pass2;
    }
    public WebElement regBUTTON(){
        WebElement regBtn = Hooks.driver.findElement(By.id("register-button"));
        return regBtn;
    }
    public WebElement successtext(){
        WebElement text = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return text;
    }
}

package org.example.Pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_HomePage {

    public WebElement sliderImg(){
     WebElement slider1 =   Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"]/img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]"));
     return slider1;
    }
    public WebElement sliderImg1(){
        WebElement slider2 =Hooks.driver.findElement(By.xpath("//a[@href=\"http://demo.nopcommerce.com/\"]/img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]"));
                return slider2;
    }

    public WebElement searchforproduct(){
        WebElement product =Hooks.driver.findElement(By.className("search-text"));
        return product;
    }
    public WebElement wishButton(){
        WebElement wishBtn = Hooks.driver.findElement(By.cssSelector("button[onclick=\"return AjaxCart.addproducttocart_catalog(\\\"/addproducttocart/catalog/18/2/1\\\"),!1\"]"));
        return wishBtn;
    }
    public WebElement wishText(){
        WebElement wishT = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
        return wishT;
    }
    public WebElement wishcount(){
        WebElement wishcont = Hooks.driver.findElement(By.className("wishlist-label"));
        return wishcont;
    }

    public WebElement productQ(){
        WebElement quantity = Hooks.driver.findElement(By.className("qty-input"));
        return quantity;
    }
}

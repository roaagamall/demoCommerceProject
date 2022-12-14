package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class FollowUsStepDef {

    @When("user go to homepage and click on facebook icon")
    public void facebook() throws InterruptedException{
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")).click();

        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println("facebook");

    }

    @Then("Check facebook url and switch between two tabs")
    public void checkFacebook(){
        String facebookurl = Hooks.driver.getCurrentUrl();
        String actualurl ="https://www.facebook.com/nopCommerce";
        Assert.assertEquals(facebookurl,actualurl);
        System.out.println("facebook1");
    }



    @When("user go to homepage and click on twitter icon")
    public void twitter() throws InterruptedException{
        Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")).click();
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        System.out.println(Hooks.driver.getCurrentUrl());

        System.out.println("twitter");
    }
    @Then("Check twitter url and switch between two tabs")
    public void checkTwitter(){
        String twitterurl = Hooks.driver.getCurrentUrl();
        String actualurl ="https://twitter.com/nopCommerce";
        Assert.assertEquals(twitterurl,actualurl);
        System.out.println("twitter");
    }



    @When("user go to homepage and click on rss icon")
    public void rss() throws InterruptedException{
        Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")).click();
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println("rss1");
    }
    @Then("Check rss url and switch between two tabs")
    public void checkRss(){
        String rssurl = Hooks.driver.getCurrentUrl();
        String actualurl ="https://demo.nopcommerce.com/new-online-store-is-open";
        Assert.assertEquals(rssurl,actualurl);
        System.out.println("rss1");
    }



    @When("user go to homepage and click on youtube icon")
    public void youtube() throws InterruptedException{
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println("youtube");
    }
    @Then("Check youtube url and switch between two tabs")
    public void checkYoutube(){
        String youtubeurl = Hooks.driver.getCurrentUrl();
        String actualurl ="https://www.youtube.com/user/nopCommerce";
        Assert.assertEquals(youtubeurl,actualurl);
        System.out.println("youtube");

    }




}

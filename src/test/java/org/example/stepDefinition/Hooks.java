package org.example.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {

public static WebDriver driver;

    @Before
    public static void openBrowser() throws InterruptedException{
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);
        System.out.println("s1");
        driver = new ChromeDriver();
        System.out.println("s2");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("s3");
        driver.navigate().to("https://demo.nopcommerce.com/");
        System.out.println("s4");


    }

    @After
    public static void quitDriver() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();

    }
}

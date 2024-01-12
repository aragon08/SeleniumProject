package com.jc.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.time.Duration.*;


public class FluentWaitEx {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Fluent wait
        Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).
                withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofSeconds(1)).
                ignoring(NoSuchElementException.class);
        fwait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.orangehrm-login-branding>img")));


        /*
        Declare and initialise a fluent wait
        FluentWait wait = new FluentWait(driver).withTimeout(5000, TimeUnit.MILLISECONDS).pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

        Specify the timout of the wait
        wait.withTimeout(5000, TimeUnit.MILLISECONDS).pollingEvery(250, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
        Sepcify polling time
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        Specify what exceptions to ignore
        wait.ignoring(NoSuchElementException.class);

        This is how we specify the condition to wait on.
        This is what we will explore more in this chapter
        wait.until(ExpectedConditions.alertIsPresent());
         */
    }
}

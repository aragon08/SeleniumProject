package com.jc.automation.jsExecutorDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutorDemo {

    public static void flash(WebElement element, WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        String bgcolor = element.getCssValue("backgroundColor");

        for (int i = 0; i <500; i++){
            //changeColor
        }
    }
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        //driver.manage().window().maximize();
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("alert('Welcome to Selenium)");

        //js.executeScript("arguments[0].style.backgroundColor = '" + color ="'", element);

    }
}

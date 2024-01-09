package com.jc.automation;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.Files;

import java.io.File;

public class TakeScreenshotDemo {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        TakesScreenshot sS = ((TakesScreenshot) driver);
        File sSFile = sS.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject");

    }
}

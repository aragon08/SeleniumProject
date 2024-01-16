package com.jc.automation.seleniumExceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InvalidSelectorExceptionEx {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://omayo.blogspot.com/");
//        driver.findElement(By.cssSelector("input.gsc-search-butto")).click();
//        System.out.println("Se selecciono el boton");


        try {
            driver.get("https://omayo.blogspot.com/");
            WebElement searchBtn = driver.findElement(By.cssSelector("input.gsc-search-button"));
            searchBtn.click();
            System.out.println("Se selecciono el boton" + searchBtn.getText());

        }catch (InvalidSelectorException e){
            System.out.println("El elemento no se encontro en el sitio");
            e.printStackTrace();

        }finally {
            //driver.quit();
            System.out.println("Este es el finally");
        }
    }
}

package com.jc.automation.seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SetScriptTimeoutEx {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        try {

            driver.manage().timeouts().scriptTimeout(Duration.ofNanos(1));
            driver.get("https://omayo.blogspot.com/");
            WebElement searchBtn = driver.findElement(By.cssSelector("textarea#ta1"));
            searchBtn.click();
            System.out.println("Se selecciono el boton" + searchBtn.getText());

        }catch (Exception e){
            System.out.println("El elemento no se encontro en el sitio");
            e.printStackTrace();

        }finally {
            //driver.quit();
            System.out.println("Este es el finally");
        }
    }
}

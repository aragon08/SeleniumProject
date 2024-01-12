package com.jc.automation.seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimeoutExceptionEx {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            //Explicit wait
            WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.orangehrm-login-branding>im")));
            System.out.println("El logo de OrangeHRM esta visible");

        }catch (TimeoutException e){
            System.out.println("Timeout al esperar el elemento de la pagina");
            e.printStackTrace();

        }finally {
            //driver.quit();
            System.out.println("Este es el finally");
        }
    }
}

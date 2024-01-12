package com.jc.automation.seleniumExceptions;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PageLoadTimeoutEx {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        try {
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        }catch (TimeoutException e){
            System.out.println("La pagina no se cargo en el tiempo establecido");
            e.printStackTrace();

        }finally {
            //driver.quit();
            System.out.println("Este es el finally");
        }
    }
}

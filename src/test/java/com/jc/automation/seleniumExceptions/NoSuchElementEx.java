package com.jc.automation.seleniumExceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class NoSuchElementEx {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        try {
            //Explicit wait
            WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.orangehrm-login-branding>im")));

            WebElement usernameField = driver.findElement(By.cssSelector("input[name = \"username\"]"));
            usernameField.sendKeys("Admin");

            WebElement passwordField = driver.findElement(By.cssSelector("input[name = \"password\"]"));
            passwordField.sendKeys("admin123");
            WebElement loginBtn = driver.findElement(By.cssSelector("button.orangehrm-login-button"));

            loginBtn.click();
            //Implicit wait
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }catch (NoSuchElementException e){
            System.out.println("El elemento no se pudo encontrar en la pagina");
            e.printStackTrace();
            e.getCause();
            e.getMessage();

        }finally {
            //driver.quit();
            System.out.println("Este es el finally");
        }
    }
}

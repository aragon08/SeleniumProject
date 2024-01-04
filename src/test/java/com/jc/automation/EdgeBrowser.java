package com.jc.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EdgeBrowser {
    public static void main(String[] args) {
        //Inicializamos driver para edge
        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/edge/120.0.2210.91/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Abrir un sitio web
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.orangehrm-login-branding>img")));
        WebElement usernameField = driver.findElement(By.cssSelector("input[name = \"username\"]"));

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        WebElement passwordField = driver.findElement(By.cssSelector("input[name = \"password\"]"));
        passwordField.sendKeys("admin123");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        WebElement loginBtn = driver.findElement(By.cssSelector("button.orangehrm-login-button"));
        loginBtn.click();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //driver.quit();

    }
}

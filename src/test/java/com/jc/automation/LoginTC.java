package com.jc.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTC {
    public static WebDriver driverSetup(String browser){
        WebDriver driver;

        switch (browser.toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "firefox":
                System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/firefox/121/geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "edge":
                System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/edge/120.0.2210.91/msedgedriver.exe");
                driver = new EdgeDriver();
                break;

            default:
                throw new IllegalArgumentException("El navegador que ingresaste no es valido");
        }

        return driver;
    }

    public static void main(String[] args) {
        String browser = "chrome";
        WebDriver driver = driverSetup(browser);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.orangehrm-login-branding>img")));
        WebElement usernameField = driver.findElement(By.cssSelector("input[name = \"username\"]"));
        usernameField.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.cssSelector("input[name = \"password\"]"));
        passwordField.sendKeys("admin123");
        WebElement loginBtn = driver.findElement(By.cssSelector("button.orangehrm-login-button"));
        loginBtn.click();
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        //driver.quit();
    }

}

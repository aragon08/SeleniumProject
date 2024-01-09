package com.jc.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LocatorsEx {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //Explicit wait for the OrangeHRM logo
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.orangehrm-login-branding>img")));
        //WebElement usernameField = driver.findElement(By.cssSelector("input[name = \"username\"]"));
        WebElement usernameField2 = driver.findElement(By.xpath("//input[@name = 'username']"));
        System.out.println(driver.findElement(By.id("app")).getTagName());
        usernameField2.sendKeys("Admin");
        WebElement passwordField = driver.findElement(By.cssSelector("input[name = \"password\"]"));
        passwordField.sendKeys("admin123");
        //WebElement loginBtn = driver.findElement(By.cssSelector("button.orangehrm-login-button"));
        WebElement loginBtn = driver.findElement(By.className("orangehrm-login-button"));
        loginBtn.click();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.findElement(By.linkText("PIM")).click();
        System.out.println(driver.findElement(By.cssSelector("h6.oxd-topbar-header-breadcrumb-module")).getText());
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.findElement(By.partialLinkText("Info")).click();
        System.out.println(driver.findElement(By.cssSelector("div.orangehrm-edit-employee-name")).getAttribute("value"));

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //driver.quit();
    }

}

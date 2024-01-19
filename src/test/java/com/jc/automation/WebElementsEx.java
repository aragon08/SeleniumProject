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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebElementsEx {
    public static void main(String[] args) {
        //Identificando webElements usando By
//        By userNameInput = By.id("user-name");
//        By pwdInput = By.name("password");
//        By loginBtnInput = By.className("btn_action");
        By inputList = By.tagName("input");

        //Configuramos el chrome driver
        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Entramos al sitio web
        driver.get("https://www.saucedemo.com/v1/");

        //Credenciales
        String userName = "standard_user";
        String password = "secret_sauce";


        //Utilizando WebElements
        List<WebElement> loginFields = driver.findElements(inputList);

        for (int i = 0; i < loginFields.size(); i++) {
            if (i == 0){
                driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                loginFields.get(i).sendKeys(userName);
            }else if(i == 1){
                driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                loginFields.get(i).sendKeys(password);
            }else{
                driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                loginFields.get(i).click();
            }

        }

        //driver.quit();
    }
}

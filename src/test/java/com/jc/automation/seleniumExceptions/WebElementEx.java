package com.jc.automation.seleniumExceptions;

import navigationPages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx {
    public static void main(String[] args) {


        //Configuramos el chrome driver
        System.setProperty("webdriver.edge.driver", "C:/Users/mxjcruz/Desktop/SeleniumWorkshop/SeleniumProject/drivers/chrome/120/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Entramos al sitio web
        driver.get("https://www.saucedemo.com/v1/");

        //Credenciales
        String userName = "standard_user";
        String password = "secret_sauce";

//**** Utilizando WebElement ****
        //### Localizar elementos web ###
//        WebElement userNameField = driver.findElement(By.id("user-name"));
//        WebElement passwordField = driver.findElement(By.name("password"));
//        WebElement loginBtn = driver.findElement(By.className("btn_action"));

//### Localizar elementos web pot By ###
        //Identificando webElements usando By
        By userNameInput = By.id("user-name");
        By pwdInput = By.name("password");
        By loginBtnInput = By.className("btn_action");

//        WebElement userNameField = driver.findElement(userNameInput); //Referencia linea 11
//        WebElement passwordField = driver.findElement(pwdInput); //Referencia linea 12
//        WebElement loginBtn = driver.findElement(loginBtnInput); //Referencia linea 13

//### Localizar elementos por medio de una navigation page ###
        LoginPage loging = new LoginPage(driver);
        loging.login(userName,password);


        //Interaccion con los elementos web
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginBtn.click();
    }
}

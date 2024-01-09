package com.jc.automation;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coockiesDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://www.example.com");
            Cookie cookie = new Cookie.Builder("key", "value").sameSite("Strict").build();
            Cookie cookie1 = new Cookie.Builder("key", "value").sameSite("Lax").build();
            driver.manage().addCookie(cookie);
            driver.manage().addCookie(cookie1);
            System.out.println(cookie.getSameSite());
            System.out.println(cookie1.getSameSite());
        } finally {
           // driver.quit();
        }
    }
}

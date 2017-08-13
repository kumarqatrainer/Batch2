package com;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class openDriver {

    public static  WebDriver driver;


    public void browser() {
        String browser = System.getProperty("browser");

        if (browser.equals("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();

        } else if (browser.equals("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();

        } else if (browser.equals("safari")) {
            driver = new SafariDriver();
        }


    }


    public void quitBrowsre(){

        driver.close();
    }


}

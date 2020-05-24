package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.sql.Driver;


public class Connect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\edgedriver.exe");

        ChromeDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

//        EdgeDriver edge = new EdgeDriver();
//        edge.get("https://www.google.com/");

//        FirefoxDriver d= new FirefoxDriver();
//        d.get("https://www.google.com/");
    }

}

package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver","C:\\edgedriver.exe");

        ChromeDriver driver  = new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");
        driver.findElement(By.partialLinkText("Management")).click();
        driver.get("https://www.na.edu/");
        driver.findElement(By.tagName("a")).click();


    }
}

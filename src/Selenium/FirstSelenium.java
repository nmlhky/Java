package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        //System.setProperty("webdriver.edge.driver","C:\\edgedriver.exe");

        ChromeDriver driver  = new ChromeDriver();
        driver.get("https://www.bankofamerica.com/");
        //driver.findElement(By.partialLinkText("Management")).click();
        //driver.findElement(By.xpath("//*[@id=\"DCTAHZ4J\"]/div/div[2]/div/span/span"));
        driver.findElement(By.xpath
                ("//span[text()='Click to see options' ]"  )).click();



    }
}

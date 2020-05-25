package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptop {
    private static WebDriver driver  = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        searcLaptop();
        for (int i = 2; i < 6; i++) {
            Thread.sleep(2000);
            findProduct(i);
            getTitle();
            driver.navigate().back();
        }

        //driver.navigate().back();
    }

    public static void findProduct(int n){
        try {
            driver.findElement(By.xpath("//*[@id='search']//div[@data-index="+n+"]//h2//a[1]")).sendKeys(Keys.RETURN);
        }catch (Exception e){
            System.out.println("hata " + n);
        }

    }

    public static void getTitle(){
        try {
            System.out.println(driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).getText());
            System.out.println();
        }catch (Exception e){
            System.out.println("title error");
        }

    }

    public static void searcLaptop(){
        //driver.get("https://www.amazon.com/");
        driver.get("https://www.amazon.com/s?k=laptop&ref=nb_sb_noss");
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop"+ Keys.RETURN);
    }

}

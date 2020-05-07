package questionsAnswers.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connect {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        ChromeDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.partialLinkText("")).click();
    }
}

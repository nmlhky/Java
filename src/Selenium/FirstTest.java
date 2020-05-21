//package Selenium;
//// Generated by Selenium IDE
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.Keys;
//import java.util.*;
//import java.net.MalformedURLException;
//import java.net.URL;
//public class FirstTest {
//  private WebDriver driver;
//  private Map<String, Object> vars;
//  JavascriptExecutor js;
//  @Before
//  public void setUp() {
//    driver = new ChromeDriver();
//    js = (JavascriptExecutor) driver;
//    vars = new HashMap<String, Object>();
//  }
//  @After
//  public void tearDown() {
//    driver.quit();
//  }
//  @Test
//  public void first() {
//    driver.get("https://www.amazon.com/");
//    driver.manage().window().setSize(new Dimension(1294, 1040));
//    {
//      WebElement element = driver.findElement(By.id("nav-orders"));
//      Actions builder = new Actions(driver);
//      builder.moveToElement(element).perform();
//    }
//    {
//      WebElement element = driver.findElement(By.tagName("body"));
//      Actions builder = new Actions(driver);
//      builder.moveToElement(element, 0, 0).perform();
//    }
//    driver.findElement(By.cssSelector("#nav-orders > .nav-line-2")).click();
//    driver.findElement(By.id("a-autoid-3-announce")).click();
//    js.executeScript("window.scrollTo(0,110)");
//    driver.findElement(By.linkText("Tracking ID: TBA039276811701")).click();
//    driver.findElement(By.cssSelector(".tracking-event-trackingId-text > .a-spacing-medium")).click();
//    driver.findElement(By.cssSelector(".tracking-event-trackingId-text > .a-spacing-medium")).click();
//    {
//      WebElement element = driver.findElement(By.cssSelector(".tracking-event-trackingId-text > .a-spacing-medium"));
//      Actions builder = new Actions(driver);
//      builder.doubleClick(element).perform();
//    }
//  }
//}

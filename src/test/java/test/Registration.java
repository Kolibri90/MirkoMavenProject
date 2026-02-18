package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Registration {

    WebDriver driver;

    @BeforeMethod
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://jackentertainment.lv-stg.gameaccount.com");
        acceptCookies();
    }

    public void acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By acceptBtn = By.id("onetrust-accept-btn-handler");
        wait.until(ExpectedConditions.visibilityOfElementLocated(acceptBtn));
        WebElement btn = driver.findElement(acceptBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btn);
    }

    @Test
    void registration() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Header_signupBtn__WxllR"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("popup-title")));

        driver.findElement(By.id("username")).sendKeys("testdone1234");
        driver.findElement(By.id("email")).sendKeys("test165443322e2@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("testuser23135");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-qa='signup_submit_btn']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-qa='signup_checkbox']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-qa='signup_submit_btn']"))).submit();
    }
@AfterMethod
   public void tearDown() {
       if (driver != null) {
          driver.quit();
           driver = null;
     }
    }}



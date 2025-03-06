package org.example.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTest {
    private WebDriver driver;

    @BeforeAll
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    void testLogin() {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        driver.findElement(By.className("menuToggle")).click();

        driver.findElement(By.id("account")).sendKeys("sa");
        driver.findElement(By.id("pass")).sendKeys("sa");

        driver.findElement(By.id("signin-btn")).click();

        WebElement userProfile = driver.findElement(By.id("userProfile"));
        assertTrue(userProfile.isDisplayed());
    }

    @AfterAll
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

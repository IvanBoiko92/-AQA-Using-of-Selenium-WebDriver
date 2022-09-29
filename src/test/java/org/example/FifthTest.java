package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class FifthTest {

    @Test
    public void myTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        /*But the path to the chrome driver is already in the "path" for my user, so this line is not really needed*/
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://avic.ua/");
        chromeDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(15));
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("js_popUp")));
        webElement.click();
        String url = chromeDriver.getCurrentUrl();
        String ExpectedUrl = "https://avic.ua/ua/back-to-school-skidki-do-50";
        System.out.println(url);
        Assert.assertTrue(Objects.equals(url, ExpectedUrl));
        System.out.println(5);


    }
}

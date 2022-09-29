package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ThirdTest {

    @Test
    public void myTest() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
         /*But the path to the chrome driver is already in the "path" for my user, so this line is not really needed*/
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://avic.ua/");
        chromeDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Знижені в ціні товари")));
        webElement.click();
        WebElement element;
        element = chromeDriver.findElement(By.linkText("Показати все"));
        element.click();
        System.out.println(3);



    }
}

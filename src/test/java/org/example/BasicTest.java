package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class BasicTest {

    @Test
    public void myTest() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
         /*But the path to the chrome driver is already in the "path" for my user, so this line is not really needed*/
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://avic.ua/");
        chromeDriver.manage().window().maximize();
        System.out.println(1);


    }
}


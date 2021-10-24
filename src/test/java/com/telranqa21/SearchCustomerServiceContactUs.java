package com.telranqa21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class SearchCustomerServiceContactUs {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new EdgeDriver();
        driver.navigate().to("http://automationpractice.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void searchProductTest() {
        driver.findElement(By.id("contact-link")).click();
        String text = driver.findElement(By.className("page-heading")).getText();
        Assert.assertEquals(text.toUpperCase(Locale.ROOT), "CUSTOMER SERVICE - CONTACT US");
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }
}




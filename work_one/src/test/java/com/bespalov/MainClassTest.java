package com.bespalov;

import org.junit.jupiter.api.Test;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;

class MainClassTest {

    @Test
    public void startTest() {
        System.setProperty("webdriver.firefox.marionette","D:\\Download\\geckodriver.exe");
        WebDriver webDriver=new FirefoxDriver();
        webDriver.navigate().to("http://www.google.com");
        Assert.assertTrue("Title",webDriver.getTitle().startsWith("Selenium"));
        webDriver.close();
    }

}
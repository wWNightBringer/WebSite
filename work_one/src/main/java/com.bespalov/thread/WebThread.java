package com.bespalov.thread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebThread implements Runnable {
    private FirefoxDriver driver;
    private String website;

    public WebThread(String website) {
        this.website = website;
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\andre\\IdeaProjects\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public synchronized void showSite() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(website);
    }

    @Override
    public void run() {
        showSite();
    }
}

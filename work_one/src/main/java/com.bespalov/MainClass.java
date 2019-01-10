package com.bespalov;

import com.bespalov.config.ConfigWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ConfigWeb();
    }
}

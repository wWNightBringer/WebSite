package com.bespalov.config;

import com.bespalov.thread.WebThread;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConfigWeb {
    private static final String[] webArrays = {"https://www.google.com/", "https://m.facebook.com/", "https://www.youtube.com/",
            "https://www.gismeteo.ua"};
    private List<String> webList;
    private ThreadPoolExecutor executor;

    public ConfigWeb() throws InterruptedException {
        webList = new ArrayList<>(Arrays.asList(webArrays));
        executor = new ThreadPoolExecutor(2, 3, 4, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(500));
        initThread();
    }

    public void initThread() throws InterruptedException {
        for (String website : webList) {
            executor.execute(new WebThread(website));
        }
        Thread.sleep(20000);
        executor.shutdown();
        System.gc();
        System.exit(0);


    }
}

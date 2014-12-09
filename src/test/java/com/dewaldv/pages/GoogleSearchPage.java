package com.dewaldv.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearchPage {

    private WebDriver webDriver = getWebDriver();

    public void navigateToHomePage() {
        webDriver.navigate().to("https://www.google.com");
    }

    private WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        return new ChromeDriver(options);
    }
}

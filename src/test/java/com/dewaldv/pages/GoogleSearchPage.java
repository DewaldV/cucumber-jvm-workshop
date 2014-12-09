package com.dewaldv.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleSearchPage {

    private WebDriver webDriver = getWebDriver();

    public void navigateToHomePage() {
        webDriver.navigate().to("https://www.google.com");
    }

    public void fillInSearchString(String searchString) {
        webDriver.findElement(By.id("gbqfq")).sendKeys(searchString);
    }

    public List<WebElement> getListOfResults() {
        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rso")));
        return webDriver.findElements(By.cssSelector("#rso > div.srg > li"));
    }

    private WebDriver getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        return new ChromeDriver(options);
    }
}

package PageObjects.BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Arrays;

public class BasePageObject {
    public String baseURL = "https://us.etrade.com/what-we-offer/our-accounts#tab_0";
    public static WebDriver webDriver;

    public BasePageObject() {
        WebDriverManager.chromedriver().properties("\\").setup();
        if (webDriver == null){
            webDriver = new ChromeDriver();
        }
    }

    public void navigateTo() {
        if (webDriver == null){
            webDriver = new ChromeDriver();
        }
        webDriver.navigate().to(baseURL);
        waitForPageToBeLoaded();
    }

    public void navigateTo(String url) {
        if (webDriver == null){
            webDriver = new ChromeDriver();
        }
        webDriver.navigate().to(url);
        waitForPageToBeLoaded();
    }

    public void sendTextWithClear(By Locator, String text){
        WebElement element = getClickableElement(Locator);
        element.clear();
        element.sendKeys(text);
    }

    public WebElement getClickableElement(By locator) {
        return new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class)
                .until(driver -> driver.findElement(locator));
    }

    public void waitForAttributeValue(By locator, String attributeName, String value) {
        new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.attributeContains(locator, attributeName, value));
    }

    public void checkTheCheckBox(boolean isShouldBeChecked, By locator, String attributeName, String condition) {
        /**
         * 1. add verification if condition of the object was changed after the click action
         */
        WebElement checkBox = getClickableElement(locator);
        if (!checkBox.getAttribute(attributeName).contains(condition) && isShouldBeChecked) {
            checkBox.click();
        } else if (checkBox.getAttribute(attributeName).contains(condition) && !isShouldBeChecked) {
            checkBox.click();
        }
    }

    public void closeDriver() {
        if (webDriver != null) {
            webDriver.close();
            webDriver = null;
        }
    }

    public void waitForPageToBeLoaded() {
        new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class)
                .until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
    }
}

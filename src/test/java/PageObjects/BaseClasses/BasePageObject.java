package PageObjects.BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePageObject {
    public static WebDriver webDriver;
    public String baseURL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#";

    public BasePageObject() {
        WebDriverManager.chromedriver().properties("\\").setup();
        if (webDriver == null) {
            webDriver = new ChromeDriver();
        }
    }

    public void navigateTo() {
        if (webDriver == null) {
            webDriver = new ChromeDriver();
        }
        webDriver.navigate().to(baseURL);
        waitForPageToBeLoaded();
    }

    public void navigateTo(String url) {
        if (webDriver == null) {
            webDriver = new ChromeDriver();
        }
        webDriver.navigate().to(url);
        waitForPageToBeLoaded();
    }

    public void sendTextWithClear(By Locator, String text) {
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

    public Boolean isAllImagesLoaded(WebElement element) {
        Object tmp = ((JavascriptExecutor) webDriver)
                .executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != " +
                        "\"undefined\" && arguments[0].naturalWidth > 0", element);
        return true;
    }

    public Boolean isElementDisplayed(By locator) {
        return new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class)
                .until(driver -> driver.findElement(locator).isDisplayed());
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

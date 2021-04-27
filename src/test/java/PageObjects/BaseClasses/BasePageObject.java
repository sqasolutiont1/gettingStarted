package PageObjects.BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;

import java.time.Duration;
import java.util.List;

public class BasePageObject {
    public String baseURL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#";
    public WebDriver webDriver;

    public BasePageObject() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    public WebElement getClickableElement(By locator) {
        return new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class)
                .until(driver -> driver.findElement(locator));
    }

    public void waitForAttributeValue(By locator, String attributeName, String value){
        new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions.attributeContains(locator, attributeName, value));
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public void checkTheCheckBox(boolean isShouldBeChecked, By locator, String attributeName, String condition) {
        WebElement checkBox = getClickableElement(locator);
         if (!checkBox.getAttribute(attributeName).contains(condition) && isShouldBeChecked){
            checkBox.click();
        } else if (checkBox.getAttribute(attributeName).contains(condition) && !isShouldBeChecked){
            checkBox.click();
        }
    }

    public void closeDriver() {
        if (webDriver != null) {
            webDriver.close();
            webDriver = null;
        }
    }
}

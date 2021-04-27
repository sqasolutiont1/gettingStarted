package PageObjects.BaseClasses;

import PageObjects.Abstract.AbstractPO;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePageObject extends AbstractPO {
    public String baseURL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#";
    public WebDriver webDriver;

    public BasePageObject() {
        webDriver();
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

    @Override
    public void getTitle() {

    }

    @Override
    public void webDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Override
    public void waitForPageToBeLoaded() {
        new FluentWait<>(webDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(50))
                .ignoring(NoSuchElementException.class)
                .until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
    }

    @Override
    public void navigateToThePage() {

    }
}

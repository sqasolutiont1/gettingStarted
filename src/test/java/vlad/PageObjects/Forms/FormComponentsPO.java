package vlad.PageObjects.Forms;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FormComponentsPO {
    String URL = "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#/forms/components";
    WebDriver webDriver;
    public FormComponentsPO(){
        webDriver = getDriver();
    }
    public WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        return webDriver = new ChromeDriver();
    }

    public void closeWebDriver(){
        if (webDriver != null){
            webDriver.close();
            webDriver = null;
        }
    }
    public void navigateToFormComponentsPage(){
        webDriver.navigate().to(URL);
        waitForPageLoaded();
    }

    public WebElement waitFluently(By locator){
        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(webDriver).withTimeout(60, TimeUnit.SECONDS)
                        .pollingEvery(1, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

        return wait.until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(webDriver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public WebElement getClickableElement(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }


    public void fillOutEmailAddress(String text){
        //wait - for element to be in DOM
        By locator = By.cssSelector("[id='exampleInputEmail1']");
        WebElement webElement = webDriver.findElement(locator);
        //wait for element to be visible/clickable/enabled
        getClickableElement(webElement).sendKeys(text);
    }

    public void fillOutPassword(){}
    public void attachFile(){}
    public void pressSubmit(){}

}

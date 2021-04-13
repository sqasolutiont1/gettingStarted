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
        /**
         * Here we are checking if web driver instance in the memory
         *
         */
        if (webDriver != null){
            /**
             * if it is in the memory:
             * We are closing the browser window.
             */
            webDriver.close();
            /**
             * Then we are destroying instance in the memory.
             */
            webDriver = null;
        }
    }
    public void navigateToFormComponentsPage(){
        /**
         * this is where our navigation is happening
         */
        webDriver.navigate().to(URL);
        /**
         * This is where we are waiting for page to be loaded.
         */
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
        /**
         * Creating locator object. Why? we have to supply webDriver with object which it can use to find the element.
         */
        By locator = By.cssSelector("[id='exampleInputEmail1']");
        /**
         * Creating WebElement Object. Why? This is the only one way how we can manipulate the object on the web Page.
         * We are manipulating web applications through WebElements.
         * We need WebElement to emulate end-user actions.
         */
        WebElement webElement = webDriver.findElement(locator);
        /**
         * We Are acting! We are using Selenium WebElement to send keys (send text) to the Element on the page.
         * Why? Selenium WebElement built with the locator to the Element on the page.
         * So: Selenium WebDriver knows where to find element. And Selenium WebDriver gives us the list of teh methods
         * (Actions) that could be done with elements on the page.
         */
        getClickableElement(webElement).sendKeys(text);
    }

    public void fillOutPassword(){}
    public void attachFile(){}
    public void pressSubmit(){}

}

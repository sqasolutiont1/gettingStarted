package vlad;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
    WebDriver webDriver = null;
    @BeforeMethod
    public void openTheBrowser(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.navigate().to("https://coreui.io/angular/demo/free/2.11.1/#/base/forms");
    }

    @Test
    public void getTitle() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(webDriver.getTitle(),"CoreUI - Free Angular Admin Template",
                    "The Title is not what we are expecting");
    }

    @AfterMethod
    public void closeBrowser(){
        webDriver.quit();
        webDriver = null;
    }
}

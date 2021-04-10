package workingwithclasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class StratWorkingwithSelenium {
    WebDriver webDriver = null;
    @Test
    public void openTheBrowser(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.navigate().to("http://www.cnn.com");
    }

    @AfterMethod
    public void closeBrowser(){
        webDriver.quit();
        webDriver = null;
    }
}

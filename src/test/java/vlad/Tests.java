package vlad;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vlad.pagesObjects.HomePO;

public class Tests {
    HomePO homePO = new HomePO();
    @BeforeMethod
    public void openTheBrowser(){
        homePO.OpenHomePage();
    }

    @Test
    public void checkTitle() throws InterruptedException {
        Assert.assertEquals(homePO.getTitle(),"NeuBoard | Multiple File Upload",
                    "The Title is not what we are expecting");
    }

    @AfterMethod
    public void closeBrowser(){
        homePO.closeEverything();
    }
}

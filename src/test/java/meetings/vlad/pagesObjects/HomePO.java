package meetings.vlad.pagesObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePO {
    /**
     * I want to have one method here, which will return Title of the Page
     */
    WebDriver webDriver;
    public HomePO(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    public String getTitle() throws InterruptedException {
        Thread.sleep(5000);
        return webDriver.getTitle();
    }

    public void OpenHomePage(){
        webDriver.navigate().to("http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/index.html#/forms/multi-upload");
    }

    public void closeEverything(){
        webDriver.quit();
        webDriver = null;
    }

}

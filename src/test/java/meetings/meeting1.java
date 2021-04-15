package meetings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class meeting1 {
    @Test
    public void firstTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.cssSelector("[title='Search']"));
        searchField.sendKeys("Testing is awesome!");
        Thread.sleep(3000);
        WebElement submitBtn = driver.findElement(By.cssSelector("[type='submit']"));
        submitBtn.click();
        Thread.sleep(3000);
        driver.quit();
    }
}

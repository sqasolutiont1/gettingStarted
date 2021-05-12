import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_class {
    @DataProvider(name = "ThisISANameOFDataProviderItSelf")
    public Object[][] createData1() {
        return new Object[][]{
                //POI will read the file and return the content of the file as the collection
        };
    }

    @Test(dataProvider = "ThisISANameOFDataProviderItSelf")
    /**
     * this test will accept the Collection as an input for it's Test Data
     */
    public void testme(String n1, Integer n2) {
        System.out.println(n1 + " " + n2);

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://www.google.com");
        Assert.assertEquals(webDriver.getTitle(), "Google");
    }
}

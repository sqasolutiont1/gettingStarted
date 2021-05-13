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
                { "Cedric", "435643" },
                { "Anne", "34534"},
        };
    }

   @Test(dataProvider = "ThisISANameOFDataProviderItSelf")
    public static void testme(String n1, String n2) {
        System.out.println(n1 + " " + n2);

//        WebDriverManager.chromedriver().setup();
//        WebDriver webDriver = new ChromeDriver();
//        webDriver.navigate().to("http://www.google.com");
//        Assert.assertEquals(webDriver.getTitle(), "Google");
    }
}

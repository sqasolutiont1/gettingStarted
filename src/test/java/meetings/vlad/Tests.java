package meetings.vlad;

import meetings.vlad.pagesObjects.HomePO;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
    HomePO homePO = new HomePO();

    @BeforeMethod
    public void openTheBrowser() {
        homePO.OpenHomePage();
    }

    @Test
    public void checkTitle() throws InterruptedException {
        Assert.assertEquals(homePO.getTitle(), "NeuBoard | Multiple File Upload",
                "The Title is not what we are expecting");
    }

    @AfterMethod
    public void closeBrowser() {
        homePO.closeEverything();
    }
}

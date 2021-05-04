package etrade.PageObjects.wizard;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class WizardBasePO extends BasePageObject {
    public static By continueBtn = By.cssSelector("[type=\"button\"]");
    Set<String> allWindowHandles;
    Iterator<String> iterator;

    public void pressContinueBtn() {
        Actions actions = new Actions(webDriver);
        actions.click(getClickableElement(continueBtn)).build().perform();

        //Get handles of the windows
        String mainWindowHandle = webDriver.getWindowHandle();
        allWindowHandles = webDriver.getWindowHandles();
        iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                webDriver.switchTo().window(ChildWindow);
                String text = webDriver.getTitle();
                System.out.println("Heading of child window is " + text);
                webDriver.close();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                webDriver.switchTo().window(mainWindowHandle);
                actions.click(getClickableElement(By.cssSelector("[type=\"button\"]"))).build().perform();
                allWindowHandles = webDriver.getWindowHandles();
                iterator = allWindowHandles.iterator();

            }

            waitForPageToBeLoaded();
        }
    }
}

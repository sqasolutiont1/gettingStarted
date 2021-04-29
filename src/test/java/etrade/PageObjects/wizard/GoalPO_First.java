package etrade.PageObjects.wizard;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GoalPO_First extends WizardBasePO {
    public String getHeader(){
        return getClickableElement(By.cssSelector("[class='vertical-offset-xs text-center small-header']")).getText();
    }

    public void selectGoal(String goal){
        By locator = null;
        By bw_locator = By.xpath("//span[normalize-space()='Simply build wealth']");
        By sr_locator = By.xpath("//span[normalize-space()='Save for retirement']");
        By go_locator = By.xpath("//span[normalize-space()='Target a specific goal (e.g., buying a home)']");
        if (goal.equals("wealth")){
            locator = bw_locator;
        } else if (goal.equals("retirement")){
            locator = sr_locator;
        } else if (goal.equals("specific")){
            locator = go_locator;
        } else {
            Assert.fail("Wrong goal specified");
        }
        getClickableElement(locator).click();
    }
}

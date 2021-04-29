package etrade.PageObjects.wizard;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

public class GoalPO_First extends BasePageObject {
    public String getHeader(){
        return getClickableElement(By.cssSelector("[class='vertical-offset-xs text-center small-header']")).getText();
    }
}

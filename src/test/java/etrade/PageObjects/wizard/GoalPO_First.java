package etrade.PageObjects.wizard;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;
import org.testng.Assert;

public class GoalPO_First extends WizardBasePO {
    public static String simplyBuildWealth = "Simply build wealth";
    public static String SaveforRetirement = "Save for retirement";
    public static String TargetSpecificGoal = "Target a specific goal (e.g., buying a home)";

    public String getHeader(){
        return getClickableElement(By.cssSelector("[class='vertical-offset-xs text-center small-header']")).getText();
    }

    public void selectGoal(String goal){
        getClickableElement(By.xpath("//span[normalize-space()='" + goal + "']")).click();
    }
}

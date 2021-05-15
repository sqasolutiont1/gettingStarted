package etrade.PageObjects.wizard;

import org.openqa.selenium.By;

public class GoalPO_First extends WizardBasePO {
    public static final String URL = "https://us.etrade.com/etx/wm/core-portfolios/rtq/1?neo.skin=mininav";
    public static String simplyBuildWealth = "Simply build wealth";
    public static String SaveforRetirement = "Save for retirement";
    public static String TargetSpecificGoal = "Target a specific goal (e.g., buying a home)";

    public String getHeader() {
        return getClickableElement(By.cssSelector("[class='vertical-offset-xs text-center small-header']")).getText();
    }

    public void selectGoal(String goal) {
        getClickableElement(By.xpath("//span[normalize-space()='" + goal + "']")).click();
    }

    public String getErrorNotificationMessage() {
        return getClickableElement(By.cssSelector("div[class='text-negative vertical-offset-xs']")).getText();
    }

    public String getSmallHEader() {
        return getClickableElement(By.cssSelector("[class='vertical-offset-xs text-center small-header']")).getText();
    }

    public Boolean checkIfContinueBtnIsPresent() {
        return waitForElementToBeDisplayed(WizardBasePO.continueBtn);
    }

    public Boolean checkIfImagesBeenLoadedOnGoalPage() {
        Boolean tmp = isAllImagesLoaded(getClickableElement(By.xpath("(//*[@role=\"img\"])[1]")));
        return tmp;
    }
}

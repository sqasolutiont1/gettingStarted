package etrade.tests.CoreComponents.pages.goalPage;

import etrade.PageObjects.wizard.GoalPO_First;
import etrade.tests.baseTestComponent.BaseTestComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_expectedBehavior extends BaseTestComponent {
    @Override
    @BeforeMethod
    public void navigateToThePage() {
        goal.navigateTo(GoalPO_First.URL);
    }

    @Test
    public void checkObjectsOnTheGoalPage() {
        Assert.assertEquals(goal.getSmallHEader(), "Do you have a goal in mind?", "Error messgae");
        Assert.assertTrue(goal.checkIfContinueBtnIsPresent(), "Continue Button is not on Goal Page");
        //Assert.assertTrue(goal.checkIfImagesBeenLoadedOnGoalPage(), "Not All images been loaded on Goal Page");
    }


}

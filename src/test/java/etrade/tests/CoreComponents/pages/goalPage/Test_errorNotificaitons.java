package etrade.tests.CoreComponents.pages.goalPage;

import etrade.PageObjects.wizard.GoalPO_First;
import etrade.tests.baseTestComponent.BaseTestComponent;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_errorNotificaitons extends BaseTestComponent {
    @Override
    @BeforeMethod
    public void navigateToThePage(){
        goal.navigateTo(GoalPO_First.URL);
    }
    @Test
    public void checkErroMassage(){
        goal.pressContinueBtn();
        Assert.assertEquals(goal.getErrorNotificationMessage(),"Please select an option",
                "Error notificaiton message is not what we are exapecting");
    }
}

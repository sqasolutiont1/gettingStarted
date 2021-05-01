package etrade.tests;

import etrade.PageObjects.wizard.GoalPO_First;
import etrade.tests.baseTestComponent.BaseTestComponent;

public class WorkFlowComponent extends BaseTestComponent {
    public void firstWFCorePortfolios(){
        accounts.pressOnCorePortfolios();
        goal.selectGoal(GoalPO_First.simplyBuildWealth);
    }
}

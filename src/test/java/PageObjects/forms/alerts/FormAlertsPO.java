package PageObjects.forms.alerts;

import PageObjects.BaseClasses.BasePageObject;

public class FormAlertsPO extends BasePageObject {

    public void navigateToAlertsPage(){
        webDriver.navigate().to(baseURL+ "/ui/alerts-notifications");
        waitForPageLoaded();
    }


}

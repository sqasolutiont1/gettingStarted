package StepDefs;

import PageObjects.forms.alerts.FormAlertsPO;
import io.cucumber.java.en.Given;

public class AlertsSD {
    FormAlertsPO formalerts = new FormAlertsPO();

    @Given("Form Alerts. I navigate to the Alerts page")
    public void formAlertsINavigateToTheAlertsPage() {
        formalerts.navigateToAlertsPage();

    }
}

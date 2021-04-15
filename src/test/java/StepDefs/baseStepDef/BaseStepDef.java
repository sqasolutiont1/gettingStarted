package StepDefs.baseStepDef;

import PageObjects.forms.wizard.FormWizardPO;
import io.cucumber.java.After;

public class BaseStepDef {
    public FormWizardPO formWizard = new FormWizardPO();

    @After
    public void closeDriver() {
        formWizard.closeDriver();
    }
}

package test;

import PageObjects.forms.wizard.FormWizardPO;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Wizard_with_dataProviders {
    FormWizardPO wizard = new FormWizardPO();

    @DataProvider(name = "wizard")
    public static Object[][] wizard() {
        return new Object[0][];
    }

    @BeforeMethod
    public void navigateToWizardPage() {
        wizard.navigateTo(FormWizardPO.baseURL);
    }

    @Test(dataProvider = "wizard")
    public void filloutAllForms() {
        wizard.fillInFirstName("");
    }
}

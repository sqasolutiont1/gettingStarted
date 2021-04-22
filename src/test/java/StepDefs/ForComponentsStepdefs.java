package StepDefs;

import PageObjects.forms.components.FormComponentsPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForComponentsStepdefs {
    /**
     * We are using instance of our Page Object ot get access to the methods of our page object
     */
    FormComponentsPO formComponents = new FormComponentsPO();

    @After
    public void closeDriver() {
        formComponents.closeDriver();
    }

    @Given("Form Components. I navigate to the Components page")
    public void formComponentsINavigateToTheComponentsPage() {
        formComponents.navigateToFormComponents();
    }

    @Then("Form Components. I fill in email with data: {string}")
    public void formComponentsIFillInEmailWithData(String value) {
        formComponents.fillInEmailAddress(value);
    }

    @And("Form Components. I wait for:{string} seconds")
    public void iWaitForSeconds(String seconds) throws InterruptedException {
        Thread.sleep(Integer.parseInt(seconds)* 1000L);
    }

    @And("Form Components. I fill in password with data: {string}")
    public void formComponentsIFillInPasswordWithData(String password) {
        formComponents.fillInPassword(password);
    }

    @And("Form Components. I press Submit button.")
    public void formComponentsIPressSubmitButton() {
        formComponents.pressSubmit();
    }

    @And("Form Components. I attach file: {string}")
    public void formComponentsIAttachFile(String fileName) {
        formComponents.attachFile(fileName);
    }

    @When("Form Components. I select the selector")
    public void formComponentsISelectTheSelector() {
        formComponents.selectSelectorInputLG();
    }

    @When("Form Components. I check the Check Box {string} if it is not checked")
    public void formComponentsICheckTheCheckBoxIfItIsNotChecked(String numberOfTheBox) {
        formComponents.checkTheCheckBoxNotThePage(numberOfTheBox);
    }
}

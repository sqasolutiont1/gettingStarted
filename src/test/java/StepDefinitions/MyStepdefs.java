package StepDefinitions;

import authenticgoods.Forms;
import io.cucumber.java.en.When;

public class MyStepdefs {
    Forms form = new Forms();

    @When("I fill in email: '(.*)'$")
    public void iFillInEmailEmail(String value) {
        form.setEmail(value);
    }
}

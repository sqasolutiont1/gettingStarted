package StepDefs;

import io.cucumber.java.en.When;

public class MyStepdefs {
    @When("I navigate to {string}")
    public void iNavigateTo(String arg0) {
        System.out.println("we did it: " + arg0);
    }
}

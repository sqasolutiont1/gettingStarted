package StepDefs;

import PageObjects.tables.BasicTables;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BasicTablesSD {
    BasicTables basicTables = new BasicTables();
    @When("Basic Tables. I navigate to basic Tables")
    public void basicTablesINavigateToBasicTables() {
        basicTables.navigateToBasicTablesPage();
    }

    @Then("Basic Tables. I read the Header of the Table")
    public void basicTablesIReadTheHeaderOfTheTable() {
        basicTables.readTheHeader();
    }
}

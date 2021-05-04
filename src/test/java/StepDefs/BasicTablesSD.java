package StepDefs;

import PageObjects.tables.BasicTables;
import io.cucumber.java.en.When;

public class BasicTablesSD {
    BasicTables basicTables = new BasicTables();
    @When("Basic Tables. I navigate to basic Tables")
    public void basicTablesINavigateToBasicTables() {
        basicTables.navigateToBasicTablesPage();
    }
}

package StepDefs;

import PageObjects.tables.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DataTableSD {
    DataTable dataTable = new DataTable();
    @Given("Data Table. I navigate to Data Table Page")
    public void dataTableINavigateToDataTablePage() {
        dataTable.navigateToDataTablePage();
    }

    @When("Data Table. I search for {string}")
    public void dataTableISearchFor(String arg0) {
        dataTable.searchForSomething(arg0);
    }

    @Then("Data Table. I see {string} rows")
    public void dataTableISeeRows(String arg0) {
        Assert.assertEquals(dataTable.getNumberOfRows(), arg0);
    }

    @And("Data Table. I see {string}")
    public void dataTableISee(String arg0) {
        Assert.assertEquals(dataTable.getDataFromRow(), arg0);
    }

    @When("Data Table. I check the default pagination: {string}")
    public void dataTableICheckTheDefaultPagination(String arg0) {
        Assert.assertEquals(dataTable.getCurrentPagination(),arg0);
    }
}

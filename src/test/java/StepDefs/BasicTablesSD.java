package StepDefs;

import PageObjects.tables.BasicTables;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.TestDataManipulation;

import java.io.IOException;

public class BasicTablesSD {
    BasicTables basicTables = new BasicTables();

    @When("Basic Tables. I navigate to basic Tables")
    public void basicTablesINavigateToBasicTables() {
        basicTables.navigateToBasicTablesPage();
    }

    @Then("Basic Tables. I read the Header of the Table")
    public void basicTablesIReadTheHeaderOfTheTable(DataTable dataTable) {
        Assert.assertEquals(basicTables.readTheHeader(), dataTable.asList());
    }

    @Then("Basic Tables. I check the values in the table")
    public void basicTablesICheckTheValuesInTheTable(DataTable dataTable) {
        Assert.assertEquals(basicTables.readValuesFromTheTable(), dataTable.asLists());
    }

    @And("Basic Tables. I check the whole table")
    public void basicTablesICheckTheWholeTable(DataTable dataTable) {
        System.out.println("This is what we are getting from out Scenario: " + dataTable.asMaps());
        Assert.assertEquals(dataTable.asMaps(), basicTables.readValuesFromTheWholeTable());
    }

    @And("Basic Tables. I check the whole table. Asserting from the File")
    public void basicTablesICheckTheWholeTableAssertingFromTheFile() throws IOException {
        /**
         * find the way to get test data for the assertion from the file
         *
         */
        TestDataManipulation testData = new TestDataManipulation();
        testData.createTestData(TestDataManipulation.testData);
        testData.readFromFile(TestDataManipulation.testData);
        //basicTables.readValuesFromTheWholeTable());
    }

    @Then("I wait for:{int} seconds")
    public void iWaitForSeconds(int arg0) {
        try {
            Thread.sleep(arg0*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

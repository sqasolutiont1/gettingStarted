package StepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DataDriven {
    @When("I have data")
    public void iHaveData(DataTable dataTable) {
        System.out.println(dataTable.asList());
    }
}

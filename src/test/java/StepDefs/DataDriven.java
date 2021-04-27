package StepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.List;

public class DataDriven {
    @When("I have data")
    public void iHaveData(DataTable dataTable) {
        System.out.println(dataTable.asList());
    }

    @When("I have more data")
    public void iHaveMoreData(DataTable dataTable) {
        /***
         * it creatred two maps:
         * Keys - data from the first row
         * Values - data from each other row
         */
        System.out.println(dataTable.asMaps());
        System.out.println(dataTable.asLists());
        List<List<String>> lists = dataTable.asLists();
        List<String> list = dataTable.asList();
        System.out.println(dataTable.asList());

    }
}

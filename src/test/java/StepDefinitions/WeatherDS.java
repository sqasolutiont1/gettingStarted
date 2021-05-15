package StepDefinitions;

import PageObjects.weather.HomePage;
import PageObjects.weather.WeatherPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import utils.FileManager;

import java.io.FileNotFoundException;
import java.io.IOException;

public class WeatherDS {
    HomePage homePage = new HomePage();
    WeatherPage weatherPag = new WeatherPage();
    @When("Weather. I navigate to {string}")
    public void weatherINavigateTo(String url) {
        homePage.navigateTo(url);
    }

    @Then("Weather. I see the main page")
    public void weatherISeeTheMainPage() {
        Assert.assertTrue(homePage.getLogo());
    }

    @And("Weather. I am clicking on :{string}")
    public void weatherIAmAbleToClickOn(String buttonName) {
        homePage.clickOnButtons(buttonName);
    }

    @Then("Weather. I search for: {string}")
    public void weatherISearchFor(String city) {
        homePage.searchForCity(city);
    }

    @Then("Weather. I read and save the values from the City's Names and Temperature")
    public void iReadAndSaveTheValuesFromTheCitySNamesAndTemperature() {
        FileManager.SaveDataToJsonFile(weatherPag.getCityName(),weatherPag.getCityTemperature(),
                weatherPag.getCityName()+"_weather");
    }

    @Then("Weather. I check if data in json file is exactly what I was expecting to see:")
    public void weatherICheckIfDataInJsonFileIsExactlyWhatIWasExpectingToSee(DataTable table) throws IOException, ParseException {
        System.out.println(table.asMap(String.class, String.class));
        System.out.println(FileManager.readDataFromJSON("Austin, TX Weather_weather"));
        //Assert.assertEquals(table.asList());
    }
}

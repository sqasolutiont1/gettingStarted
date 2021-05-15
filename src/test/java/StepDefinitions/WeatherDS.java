package StepDefinitions;

import PageObjects.weather.HomePage;
import PageObjects.weather.WeatherPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.FileManager;

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
}

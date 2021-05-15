package StepDefinitions;

import PageObjects.weather.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WeatherDS {
    HomePage homePage = new HomePage();
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
}

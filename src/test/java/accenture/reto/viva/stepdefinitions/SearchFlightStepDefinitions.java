package accenture.reto.viva.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Flight;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TheFlight;
import tasks.SearchFlight;
import tasks.SelectFlight;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchFlightStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^(.*) wants to search$")
    public void goToSearch(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url("https://vivaair.com"));
    }

    @When("^Manuel search$")
    public void search() {
        theActorInTheSpotlight().wasAbleTo(SearchFlight.with(new Flight("Medellin", "Bogota")));
        theActorInTheSpotlight().wasAbleTo(SelectFlight.with());
    }

    @Then("^Manuel should see the economic flight$")
    public void ShouldSeeTheEconomicFlight() {
        theActorInTheSpotlight().should(seeThat(TheFlight.isCheaper()));
    }
}

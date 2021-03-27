package accenture.reto.viva.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_flight.feature",
        glue = "accenture.reto.viva.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class SearchFlightRunner {
}

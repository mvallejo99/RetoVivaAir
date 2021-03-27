package tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.SelectFlightPage.*;
import static util.SearchEconomic.searchEconomic;

public class SelectFlight implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Target.the("Cheaper flight").locatedBy("//div[@class=\"from-price\"][text() = \""+searchEconomic(actor)+"\"]")),
                Click.on(CARD),
                JavaScriptClick.on(CONTINUAR)
        );
    }

    public static SelectFlight with() {
        return instrumented(SelectFlight.class);
    }
}

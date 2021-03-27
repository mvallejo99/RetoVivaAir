package tasks;

import model.Flight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.SearchFlightPage.*;

public class SearchFlight implements Task {

    private Flight flight;

    public SearchFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NOTIFICATION),
                Click.on(SOLOIDA),
                Enter.theValue(flight.getOrigen()).into(ORIGEN),
                Click.on(ORIGENAIR),
                Enter.theValue(flight.getDestino()).into(DESTINO),
                Click.on(DESTINOAIR),
                JavaScriptClick.on(Target.the("Fecha button").locatedBy("//button[@date=\""+flight.getFechaIda()+"\"]")),
                Click.on(BUSCAR)
        );
    }

    public static SearchFlight with(Flight flight){
        return instrumented(SearchFlight.class, flight);
    }
}

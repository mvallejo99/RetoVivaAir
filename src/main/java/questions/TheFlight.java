package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.SelectFlightPage;

import static net.serenitybdd.core.Serenity.getCurrentSession;
import static util.SearchEconomic.searchEconomic;

public class TheFlight implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        if(SelectFlightPage.MOSTCHEAPER.resolveFor(actor).getText().compareTo(searchEconomic(actor))==0){
            return true;
        }
        else
            return false;
    }

    @Override
    public String getSubject() {
        return "The flight is the cheaper";
    }

    public static Question<Boolean> isCheaper() {
        return new TheFlight();
    }
}

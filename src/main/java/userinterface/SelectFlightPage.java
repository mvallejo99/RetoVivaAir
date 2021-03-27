package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectFlightPage {

    public static final Target MOSTCHEAPER = Target.the("See the most cheaper flight").locatedBy("//*[@id=\"days-0\"]/button[4]/div[3]");
    public static final Target ECONOMICOS = Target.the("Search economic flight").locatedBy("//div[@class=\"from-price\"]");
    public static final Target CARD = Target.the("Select the cheaper plan").locatedBy("//div[@class=\"fare-footer bold viva fare-disabled\"]");
    public static final Target CONTINUAR = Target.the("Continuar button").locatedBy("//*[@id=\"flights-scroll-to\"]/div[2]");

}

package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchFlightPage {

    public static final Target NOTIFICATION = Target.the("Pop Up notification").located(By.id("onesignal-slidedown-cancel-button"));
    public static final Target SOLOIDA = Target.the(" Solo ida check box").locatedBy("//*[@id=\"criteria\"]/div/div[1]/label/span[1]");
    public static final Target ORIGEN = Target.the("Origen field").located(By.id("criteria-airport-select-departure-input"));
    public static final Target ORIGENAIR = Target.the("Airport origen label").located(By.id("criteria-airport-select-departure-station-MDE"));
    public static final Target DESTINO = Target.the("Destino field").located(By.id("criteria-airport-select-destination-input"));
    public static final Target DESTINOAIR = Target.the("Airport destino label").located(By.id("criteria-airport-select-destination-station-BOG"));
    public static final Target BUSCAR = Target.the("Buscar button").located(By.id("criteria-search-button-desktop"));
}

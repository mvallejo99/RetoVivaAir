package util;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;

import java.util.List;

import static userinterface.SelectFlightPage.ECONOMICOS;

public class SearchEconomic {

    public static String searchEconomic(Actor actor){
        List<WebElementFacade> listEconomic = ECONOMICOS.resolveAllFor(actor);
        String sEconomic = listEconomic.get(0).getText();
        for (int i = 0; i < listEconomic.size(); i++) {
            String temp = listEconomic.get(i).getText();
            if (sEconomic.compareTo(temp)== 0 || sEconomic.compareTo(temp)<0){
                sEconomic = sEconomic;
            }else{
                sEconomic = temp;
            }
        }
        Serenity.setSessionVariable("tempEconomic").to(sEconomic);
        return sEconomic;
    }
}

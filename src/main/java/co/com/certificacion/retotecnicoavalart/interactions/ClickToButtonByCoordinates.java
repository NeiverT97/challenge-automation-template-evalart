package co.com.certificacion.retotecnicoavalart.interactions;

import co.com.certificacion.retotecnicoavalart.utils.OwnWebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class ClickToButtonByCoordinates implements Interaction {
    private int x;
    private int y;

    public ClickToButtonByCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitHook.theSeconds(2000));
        OwnWebDriver.nuevo().clickElementByCoordinates(x,y);
    }

    public static ClickToButtonByCoordinates click(int x, int y){
        return Tasks.instrumented(ClickToButtonByCoordinates.class,x,y);
    }
}

package co.com.certificacion.retotecnicoavalart.interactions;

import co.com.certificacion.retotecnicoavalart.utils.OwnWebDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class AlertHandle implements Interaction {

    public AlertHandle() {}

    @Override
    public <T extends Actor> void performAs(T actor) {
        OwnWebDriver.nuevo().AlertHandle();
        actor.attemptsTo(
                WaitHook.theSeconds(1000)
        );
    }

    public static AlertHandle alert(){
        return Tasks.instrumented(AlertHandle.class);
    }
}

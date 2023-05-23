package co.com.certificacion.retotecnicoavalart.interactions;

import co.com.certificacion.retotecnicoavalart.userinterfaces.ModuleGeneral;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

public class ScrollTo implements Interaction {

    private String name;

    public ScrollTo(String name){
        this.name=name;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ModuleGeneral.BTN_MATRIZ.of(name).resolveFor(actor)));
    }

    public static ScrollTo Page(String name){
        return Tasks.instrumented(ScrollTo.class, name);
    }
}

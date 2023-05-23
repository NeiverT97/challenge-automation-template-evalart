package co.com.certificacion.retotecnicoavalart.tasks;

import co.com.certificacion.retotecnicoavalart.interactions.WaitHook;
import co.com.certificacion.retotecnicoavalart.models.ModuleGeneralStept;
import static co.com.certificacion.retotecnicoavalart.userinterfaces.ModuleGeneral.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class EnterValueToLogin implements Task {
    List<ModuleGeneralStept> personalInformation;

    public EnterValueToLogin(List<ModuleGeneralStept> personalInformation) {
        this.personalInformation = personalInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitHook.theSeconds(1000),
                Enter.keyValues(personalInformation.get(0).getUsername()).into(USERNAME),
                Enter.keyValues(personalInformation.get(0).getPassword()).into(PASSWORD),
                WaitHook.theSeconds(1000),
                Click.on(BUTTON_LOGIN));
    }

    public static EnterValueToLogin with(List<ModuleGeneralStept> steptList){
        return Tasks.instrumented(EnterValueToLogin.class,steptList);
    }

}

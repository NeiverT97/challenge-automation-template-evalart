package co.com.certificacion.retotecnicoavalart.tasks;


import co.com.certificacion.retotecnicoavalart.interactions.ScrollTo;
import co.com.certificacion.retotecnicoavalart.interactions.WaitHook;
import co.com.certificacion.retotecnicoavalart.models.MatrixInformation;
import static co.com.certificacion.retotecnicoavalart.userinterfaces.ModuleGeneral.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

public class ModuleGeneralStepDefinitions implements Task {
    private List<MatrixInformation> informationList;
    private int aux=0;
    public ModuleGeneralStepDefinitions(List<MatrixInformation> informationList) {
        this.informationList = informationList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        while (aux<=informationList.size()){
            actor.attemptsTo(
                    WaitHook.theSeconds(1000),
                    ScrollTo.Page(informationList.get(aux).getNumMatrix()),
                    WaitHook.theSeconds(1000),
                    Click.on(BTN_MATRIZ.of(informationList.get(aux).getNumMatrix()).resolveFor(actor)),
                    WaitHook.theSeconds(1000),
                    Enter.keyValues(informationList.get(aux).getSumNum()).into(INPUT_ALERT),
                    WaitHook.theSeconds(1000),
                    Click.on(BTN_ALERT),
                    WaitHook.theSeconds(1000)
            );
            aux++;
        }


    }

    public static ModuleGeneralStepDefinitions with(List<MatrixInformation> informationList){
        return Tasks.instrumented(ModuleGeneralStepDefinitions.class,informationList);
    }
}

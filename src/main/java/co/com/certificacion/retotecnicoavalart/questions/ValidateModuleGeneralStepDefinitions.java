package co.com.certificacion.retotecnicoavalart.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateModuleGeneralStepDefinitions implements Question {

    public ValidateModuleGeneralStepDefinitions() {
    }

    @Override
    public Object answeredBy(Actor actor) {
        return null;
    }

    public static ValidateModuleGeneralStepDefinitions answered(){
        return new ValidateModuleGeneralStepDefinitions();
    }
}

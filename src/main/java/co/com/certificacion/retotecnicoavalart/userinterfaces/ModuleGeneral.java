package co.com.certificacion.retotecnicoavalart.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ModuleGeneral {

    public static final Target COORDINATES = Target.the("Extract coordinate from web page")
            .locatedBy("//p[contains(text(),'Usa las siguientes coordenadas para hallar')]//following::p[1]");

    public static final Target USERNAME = Target.the("Input username")
            .locatedBy("//p[text()='Por favor escriba su usuario']//following::input[1]");

    public static final Target PASSWORD = Target.the("Input Password")
            .locatedBy("//p[text()='Por favor escriba su usuario']//following::input[2]");

    public static final Target BUTTON_LOGIN = Target.the("Input Password")
            .locatedBy("//button");

    public static final Target BTN_MATRIZ = Target.the("select a matrix number")
            .locatedBy("//button[contains(text(),'        {0}')]");

    public static final Target INPUT_ALERT = Target.the("Enter sum about number")
            .locatedBy("//h2[contains(text(),'Suma todos los numeros alrededor de la respuesta')]//following::input");

    public static final Target BTN_ALERT = Target.the("select a matrix number")
            .locatedBy("//h2[contains(text(),'Suma todos los numeros alrededor de la respuesta')]//following::button");




}

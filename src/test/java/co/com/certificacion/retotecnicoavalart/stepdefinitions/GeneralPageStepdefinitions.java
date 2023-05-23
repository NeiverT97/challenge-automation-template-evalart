package co.com.certificacion.retotecnicoavalart.stepdefinitions;

import co.com.certificacion.retotecnicoavalart.models.MatrixInformation;
import co.com.certificacion.retotecnicoavalart.models.ModuleGeneralStept;
import co.com.certificacion.retotecnicoavalart.tasks.EnterValueToLogin;
import co.com.certificacion.retotecnicoavalart.tasks.ModuleGeneralStepDefinitions;
import co.com.certificacion.retotecnicoavalart.utils.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class GeneralPageStepdefinitions {

    @Before
    public void init(){setTheStage(new Cast());}

    @Given("^the user open url application$")
    public void theUserOpenUrlApplication(){
        theActorCalled("actor").can(BrowseTheWeb.with(OwnWebDriver.nuevo().chrome("https://tasks.evalartapp.com/automatization/")));
    }

    @Given("^The user enter the page web and login$")
    public void TheUserEnterThePageWebAndLogin(List<ModuleGeneralStept> moduleGeneralStepts) {
       OnStage.theActorInTheSpotlight().attemptsTo(EnterValueToLogin.with(moduleGeneralStepts));
    }

    @When("^The user selected and clicked correct button$")
    public void theUserSelectedAndClickedCorrectButton(List<MatrixInformation> informationList) {
        OnStage.theActorInTheSpotlight().attemptsTo(ModuleGeneralStepDefinitions.with(informationList));
    }

}

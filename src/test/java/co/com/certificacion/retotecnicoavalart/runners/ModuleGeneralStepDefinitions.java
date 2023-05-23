package co.com.certificacion.retotecnicoavalart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/modulegeneralstepdefinitions.feature",
                glue = "co.com.certificacion.retotecnicoavalart.stepdefinitions",
                snippets = SnippetType.CAMELCASE)
public class ModuleGeneralStepDefinitions {
}

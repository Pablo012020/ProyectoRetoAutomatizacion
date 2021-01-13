package co.com.choucair.certification.proyectoreto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/reto_automatizacion.feature", tags = "@administrarCategoria",
        glue = "co.com.choucair.certification.proyectoreto.stepdefinitions", snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}

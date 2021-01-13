package co.com.choucair.certification.proyectoreto.stepdefinitions;

import co.com.choucair.certification.proyectoreto.questions.ValidarCategoria;
import co.com.choucair.certification.proyectoreto.questions.ValidarPost;
import co.com.choucair.certification.proyectoreto.tasks.CrearCategoria;
import co.com.choucair.certification.proyectoreto.tasks.CrearPost;
import co.com.choucair.certification.proyectoreto.tasks.Login;
import co.com.choucair.certification.proyectoreto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RetoAutomatizacionStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^que Pablo quiere realizar el reto de automatizacion$")
    public void quePabloQuiereRealizarElRetoDeAutomatizacion() throws Exception {
        OnStage.theActorCalled("Pablo").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^el crea y valida la creacion de una categoria (.*)$")
    public void elCreaYValidaLaCreacionDeUnaCategoria(String categoria) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearCategoria.the(categoria));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCategoria.toThe(categoria)));
    }

    @Then("^el crea y valida la creacion de un post (.*) con la nueva categoria (.*)$")
    public void elCreaYValidaLaCreacionDeUnPostConLaNuevaCategoria(String post, String categoria) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearPost.the(post,categoria));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPost.toThe(post)));
    }
}

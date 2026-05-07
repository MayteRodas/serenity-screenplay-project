package com.proyecto.stepdefinitions;

import com.proyecto.screenplay.questions.MensajeEnPantalla;
import com.proyecto.screenplay.tasks.IniciarSesion;
import com.proyecto.screenplay.tasks.NavegaALoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefinitions {

    @Before
    public void configurar() {
        // Serenity maneja el driver internamente usando serenity.conf
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void cerrar() {
        OnStage.drawTheCurtain();
    }

    @Given("que Juan esta en la pagina de login")
    public void juanEstaEnLaPaginaDeLogin() {
        Actor juan = OnStage.theActorCalled("Juan");
        juan.attemptsTo(
                NavegaALoginPage.enElSistema()
        );
    }

    @When("Juan ingresa el usuario {string} y la contrasena {string}")
    public void juanIngresaCredenciales(String usuario, String password) {
        Actor juan = OnStage.theActorInTheSpotlight();
        juan.attemptsTo(
                IniciarSesion.conUsuario(usuario, password)
        );
    }

    @Then("Juan deberia ver el mensaje {string}")
    public void juanDeberiaVerElMensaje(String mensajeEsperado) {
        Actor juan = OnStage.theActorInTheSpotlight();
        String mensajeActual = MensajeEnPantalla.deExito().answeredBy(juan);
        assertThat(mensajeActual)
                .containsIgnoringCase(mensajeEsperado);
    }

    @Then("Juan deberia ver el mensaje de error {string}")
    public void juanDeberiaVerMensajeDeError(String mensajeEsperado) {
        Actor juan = OnStage.theActorInTheSpotlight();
        String mensajeActual = MensajeEnPantalla.deError().answeredBy(juan);
        assertThat(mensajeActual)
                .containsIgnoringCase(mensajeEsperado);
    }
}
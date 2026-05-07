package com.proyecto.screenplay.questions;

import com.proyecto.screenplay.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeEnPantalla implements Question<String> {

    private final Target elemento;

    private MensajeEnPantalla(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(elemento).answeredBy(actor);
    }

    public static MensajeEnPantalla deExito() {
        return new MensajeEnPantalla(LoginPage.MENSAJE_EXITO);
    }

    public static MensajeEnPantalla deError() {
        return new MensajeEnPantalla(LoginPage.MENSAJE_ERROR);
    }
}
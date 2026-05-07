package com.proyecto.screenplay.tasks;

import com.proyecto.screenplay.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Tasks;

public class NavegaALoginPage implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(LoginPage.URL)
        );
    }

    public static NavegaALoginPage enElSistema() {
        return Tasks.instrumented(NavegaALoginPage.class);
    }
}
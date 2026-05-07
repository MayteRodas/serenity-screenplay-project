package com.proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class NavegaALoginPage implements Task {

    public static NavegaALoginPage enElSistema() {
        return new NavegaALoginPage();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        String url = variables.getProperty("app.url", "https://the-internet.herokuapp.com/login");
        actor.attemptsTo(Open.url(url));
    }
}
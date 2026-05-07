package com.proyecto.screenplay.tasks;

import com.proyecto.screenplay.pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

    private String usuario;
    private String password;

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario).into(LoginPage.CAMPO_USUARIO),
                Enter.theValue(password).into(LoginPage.CAMPO_PASSWORD),
                Click.on(LoginPage.BOTON_LOGIN)
        );
    }

    public static IniciarSesion conUsuario(String usuario, String password) {
        IniciarSesion task = new IniciarSesion();
        task.usuario = usuario;
        task.password = password;
        return task;
    }
}
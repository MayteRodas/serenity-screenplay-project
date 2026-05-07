package com.proyecto.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final String URL =
            "https://the-internet.herokuapp.com/login";

    public static final Target CAMPO_USUARIO =
            Target.the("campo de usuario")
                    .located(By.id("username"));

    public static final Target CAMPO_PASSWORD =
            Target.the("campo de contraseña")
                    .located(By.id("password"));

    public static final Target BOTON_LOGIN =
            Target.the("botón de login")
                    .located(By.cssSelector("button[type='submit']"));

    public static final Target MENSAJE_EXITO =
            Target.the("mensaje de éxito")
                    .located(By.cssSelector(".flash.success"));

    public static final Target MENSAJE_ERROR =
            Target.the("mensaje de error")
                    .located(By.cssSelector(".flash.error"));
}

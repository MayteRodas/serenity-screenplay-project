Feature: Autenticacion de usuarios
  Como usuario registrado
  Quiero iniciar sesion en la aplicacion
  Para acceder a las funcionalidades del sistema

  Scenario: Inicio de sesion exitoso con credenciales validas
    Given que Juan esta en la pagina de login
    When Juan ingresa el usuario "tomsmith" y la contrasena "SuperSecretPassword!"
    Then Juan deberia ver el mensaje "You logged into a secure area!"

  Scenario: Inicio de sesion fallido con credenciales invalidas
    Given que Juan esta en la pagina de login
    When Juan ingresa el usuario "usuarioMalo" y la contrasena "passwordMalo"
    Then Juan deberia ver el mensaje de error "Your username is invalid!"
Feature: Iniciar sesión en la aplicación

  Scenario Outline: Usuario inicia sesión exitosamente
    Given que el usuario abre la página principal
    When hace click en el botón Login
    And coloca el <usuario> y la <contrasena>
    And hace clic en el botón Login

    Examples:
    |usuario            |contrasena |
    |correo@hotmail.com |123456     |



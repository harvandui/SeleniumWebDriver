Feature: Iniciar sesión en la aplicación

  Scenario: Usuario inicia sesión exitosamente
    Given que el usuario abre la página principal
    When hace click en el botón Login
    And coloca el usuario y la contraseña
    And hace clic en el botón Login
    Then se muestra la página principal de la aplicación

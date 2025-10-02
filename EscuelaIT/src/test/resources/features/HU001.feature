Feature: Consultar la página de cursos de Escuela IT

  Scenario: Acceder a la sección de cursos
    Given que estoy en la página principal de Escuela IT
    When hago clic en el enlace Cursos
    Then se muestra la página de cursos con la lista disponible

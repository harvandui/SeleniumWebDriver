package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.PaginaPrincipal;

public class StepsHU001 {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    @Given("que el usuario abre la página principal")
    public void abrirTodoLy(){
        paginaPrincipal.abrirPagina();
    }

    @When("hace click en el botón Login")
    public void ClickEnLogin(){
        paginaPrincipal.abrirLogin();
    }

    @And("coloca el {word} y la {word}")
    public void ingresarCredenciales(String usuario, String contrasena){
        paginaPrincipal.ingresarCredenciales(usuario, contrasena);
    }

    @And("hace clic en el botón Login")
    public void ClickBotonLogin(){
        paginaPrincipal.clickBotonLogin();

    }
}

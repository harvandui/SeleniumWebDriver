package steps;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;


public class StepsHU001 {

    PaginaPrincipal paginaPrincipal = new PaginaPrincipal();

    @Given("que estoy en la página principal de Escuela IT")
    public void navigateToPrincipal() {
        paginaPrincipal.navigateEscuelaIt();
    }

    @When("hago clic en el enlace Cursos")
    public void clickOnCursos(){
        paginaPrincipal.clickNavigateBar();
    }


}

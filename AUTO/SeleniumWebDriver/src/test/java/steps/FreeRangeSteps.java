package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.PaginaCursos;
import pages.PaginaIntroTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

import java.util.Arrays;
import java.util.List;

public class FreeRangeSteps {
    PaginaPrincipal landingPAge = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroTesting introTest = new PaginaIntroTesting();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPAge.navigateToFreeRangeTesters();
    }

    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPAge.clickNavigationBar(section);
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPAge.clickOnElegirPlanButton();
    }

    @And("select Introducción al Testing")
    public void selectIntroTesting() {
        cursosPage.clickIntroTesting();
        introTest.clickComprar();
    }

    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans() {

        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 11 productos",
                "Academia: $176 / año • 11 productos", "Free: Gratis • 1 producto");
        Assert.assertEquals(listaEsperada, lista);
    }
}

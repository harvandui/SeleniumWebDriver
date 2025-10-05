package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaCursos;
import pages.PaginaIntroTesting;
import pages.PaginaPrincipal;

public class FreeRangeSteps {
    PaginaPrincipal landingPAge = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroTesting introTest = new PaginaIntroTesting();

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
    }
}

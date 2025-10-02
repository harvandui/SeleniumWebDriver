package pages;

public class PaginaPrincipal extends BasePage {

    private String url = "https://escuela.it/";
    private String locator = "//a[@id='nav_cursos']";

    public void navigateEscuelaIt() {
        navigate(url);
    }

    public void clickNavigateBar() {
        clickElement(locator);
    }
}

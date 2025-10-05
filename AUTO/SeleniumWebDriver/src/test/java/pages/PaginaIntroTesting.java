package pages;

public class PaginaIntroTesting extends BasePage {
    public String comprar = "//a[@class='sc-dJkDXt fodGEh']";

    public void clickComprar() {
        clickElement(comprar);
    }
}

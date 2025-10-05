package pages;

public class PaginaPrincipal extends BasePage {
    public String sectionLink = "//a[normalize-space()='%s' and @href]";
    public String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan']";

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com/");
    }

    public void clickNavigationBar(String section) {
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void clickOnElegirPlanButton() {
        clickElement(elegirUnPlanButton);
    }
}

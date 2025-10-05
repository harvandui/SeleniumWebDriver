package pages;

public class PaginaCursos extends BasePage {
    public String introTesting = "//a[normalize-space()='Introducción al Testing de Software' and @href]";

    public void clickIntroTesting() {
        clickElement(introTesting);
    }
}

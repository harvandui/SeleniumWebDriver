package pages;

public class PaginaPrincipal extends BasePage {

    private String url = "asdas";
    private String locatorUsuario = "asdasd";
    private String locatorPassword = "asdasd";
    private String locatorLogin = "asdasd";
    private String locatorBotonLogin = "asdasd";


    public void abrirPagina() {
        navigate(url);
    }

    public void abrirLogin() {
        clickElement(locatorLogin);
    }

    public void ingresarCredenciales(String user, String pass) {
        writeText(locatorUsuario, user);
        writeText(locatorPassword, pass);
    }

    public void clickBotonLogin() {
        clickElement(locatorBotonLogin);
    }


}

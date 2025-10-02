package pages;

public class PaginaPrincipal extends BasePage {

    private String url = "https://todo.ly/";
    private String locatorLogin = "//img[@src='/Images/design/pagelogin.png']";
    private String locatorUsuario = "//input[@id='ctl00_MainContent_LoginControl1_TextBoxEmail']";
    private String locatorPassword = "//input[@id='ctl00_MainContent_LoginControl1_TextBoxPassword']";
    private String locatorBotonLogin = "//input[@id='ctl00_MainContent_LoginControl1_ButtonLogin']";


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

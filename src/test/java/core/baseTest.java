package core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import page.*;

import static core.driverFactory.killDriver;

public class baseTest {

    public WebDriver driver;
    public DSL dsl;
    public falarComUnimedPage menu;
    public guiaMedicoPage guiaMedico;
    public acessoRapidoPage acessoRapido;
    public resultadoBuscaPage resultadoBusca;
    public homePage home;
    public canaisDeAtendimentoPage canaisAtendimento;
    public falarComUnimedPage falarComUnimed;

    public static WebDriver getDriver() {
        return driverFactory.getDriver();
    }

    @BeforeEach
    public void testInicializar() {
        dsl = new DSL();
        menu = new falarComUnimedPage();
        guiaMedico = new guiaMedicoPage();
        acessoRapido = new acessoRapidoPage();
        resultadoBusca = new resultadoBuscaPage();
        home = new homePage();
        canaisAtendimento = new canaisDeAtendimentoPage();
        falarComUnimed = new falarComUnimedPage();

        getDriver().get("https://www.unimed.coop.br/site/");
        home.aceitarCookies();

    }

    @AfterEach
    public void testFinalizar()  {
            if (propriedades.FECHAR_BROWSER) {
                killDriver();
            }
        }
}

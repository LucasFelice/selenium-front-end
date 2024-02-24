package core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import page.*;

import java.io.IOException;

public class baseTest extends driverFactory{

    private static final long DEFAULT_TIME_WAIT = 10;

    public static WebDriver getDriver() {
        return driverFactory.driver;
    }

    protected void openURL(String url) {
        getDriver().get(url);
    }

    public WebDriver driver;
    public DSL dsl;
    public falarComUnimedPage menu;
    public guiaMedicoPage guiaMedico;
    public acessoRapidoPage acessoRapido;
    public resultadoBuscaPage resultadoBusca;
    public homePage home;
    public canaisDeAtendimentoPage canaisAtendimento;
    public falarComUnimedPage falarComUnimed;


    @BeforeEach
    public void testInicializar() throws IOException {
        dsl = new DSL();
        menu = new falarComUnimedPage();
        guiaMedico = new guiaMedicoPage();
        acessoRapido = new acessoRapidoPage();
        resultadoBusca = new resultadoBuscaPage();
        home = new homePage();
        canaisAtendimento = new canaisDeAtendimentoPage();
        falarComUnimed = new falarComUnimedPage();

        driver = initDriver();
        driver.get(property.getProperty("url"));
        home.aceitarCookies();

    }

    @AfterEach
    public void tearDown()  {
            if (driver != null) {
                driver.quit();
            }
        }
}

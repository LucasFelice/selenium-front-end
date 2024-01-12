package core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import page.*;

import java.io.File;
import java.io.IOException;
import static core.driverFactory.getDriver;
import static core.driverFactory.killDriver;

public class baseTest {

    @Rule
    public TestName testName = new TestName();

    public WebDriver driver;
    public DSL dsl;
    public falarComUnimedPage menu;
    public guiaMedicoPage guiaMedico;
    public acessoRapidoPage acessoRapido;
    public resultadoBuscaPage resultadoBusca;
    public homePage home;
    public canaisDeAtendimentoPage canaisAtendimento;
    public falarComUnimedPage falarComUnimed;

    @Before
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

    @After
    public void testFinalizar() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo =ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target" + File.separator +
                "screenshot" + File.separator + testName.getMethodName() + ".jpg"));

        if(propriedades.FECHAR_BROWSER) {
            killDriver();
        }

    }












}

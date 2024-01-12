package page;

import core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static core.driverFactory.getDriver;

public class homePage extends basePage {

    public void encontreUmMedico() {
        dsl.clicarBotao(By.xpath(
                "//li[@class='nav-item menu-principal__nivel-2--nav-item']//span[.='ENCONTRE UM MÉDICO']"));
    }

    public void setFacaSuaBuscaAqui(String buscaAqui) {
        dsl.escrever(By.xpath("//*[@class='place-holder-pesquisa']"), buscaAqui);
    }

    public void aceitarCookies() {

        By cookiesLocator = By.xpath(("//button[@aria-label='Aceitar todos']"));

        WebElement cookiesElement = encontrarElemento(cookiesLocator);

        if (cookiesElement != null && cookiesElement.isDisplayed()) {
            dsl.clicarBotao(By.xpath("//button[@aria-label='Aceitar todos']"));
        }else {

        }
    }

    private WebElement encontrarElemento(By by) {
        try {
            return getDriver().findElement(by);
        } catch (org.openqa.selenium.NoSuchElementException
                 | org.openqa.selenium.StaleElementReferenceException e) {
            return null;
        }
    }

    public void acessoRapido() {
        dsl.clicarBotao(By.xpath("//a[@id='acesso-rapido-click']"));
    }

    public void canaisDeAtendimento() {
        dsl.clicarBotao(By.xpath("//a[@class='nav-link']"));
    }
}

package page;

import core.basePage;
import maps.guiaMedicoPageMaps;
import maps.homePageMaps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static core.driverFactory.getDriver;

public class homePage extends basePage {

    homePageMaps home = new homePageMaps();

    public void encontreUmMedico() {
        clicarBotao(home.btnEncontreUmMedico);
    }

    public void aceitarCookies() {

        By cookiesLocator = home.btnAceitarCookies;

        WebElement cookiesElement = encontrarElemento(cookiesLocator);

        if (cookiesElement != null && cookiesElement.isDisplayed()) {
            clicarBotao(home.btnAceitarCookies);
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
        clicarBotao(home.btnAcessoRapido);
    }

    public void canaisDeAtendimento() {
        clicarBotao(home.btnCanaisDeAtendimento);
    }
}

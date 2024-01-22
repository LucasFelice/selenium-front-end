package maps;

import org.openqa.selenium.By;

public class homePageMaps {

    public final By btnEncontreUmMedico = By.xpath(
            "(//li[@class='nav-item menu-principal__nivel-2--nav-item']//span)[1]");
    public final By btnAceitarCookies = By.xpath(
            "//button[@aria-label='Aceitar todos']");
    public final By btnAcessoRapido = By.xpath(
            "//a[@id='acesso-rapido-click']");
    public final By btnCanaisDeAtendimento = By.xpath(
            "//a[@class='nav-link']");
}

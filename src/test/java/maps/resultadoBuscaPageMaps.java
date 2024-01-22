package maps;

import org.openqa.selenium.By;

public class resultadoBuscaPageMaps {

    public final By btnPerfilDoPrestadorVisivel = By.xpath(
            "(//button[.='Perfil do Prestador'])[1]");
    public final By txtResultadoEncontradoDaSuaBusca = By.xpath(
            "//span[@class='Text TotalFoundProviders']");
    public final By txtResultadoEncontradoDaSuaBuscaRefinida = By.xpath(
            "//span[@class='Text TotalFoundProviders']");
    public final By btnEstado = By.xpath(
            "//div[@id='province-input']//div[@class=' css-1ihzl9v-singleValue']");
    public final By inputEstado = By.xpath(
            "(//div[@class='css-26uufv']//input)[2]");
    public final By seletorEstado = By.xpath(
            "//div[@id='province-input']");
    public final By btnCidade = By.xpath(
            "//div[@id='city-input']//div[@class=' css-1hwfws3']");
    public final By inputCidade = By.xpath(
            "(//div[@class='css-26uufv']//input)[3]");
    public final By seletorCidade = By.xpath(
            "//div[@id='city-input']");
    public final By btnFiltrar = By.xpath(
            "//button[.='Filtrar']");
}

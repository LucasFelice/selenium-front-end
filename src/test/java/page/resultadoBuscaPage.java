package page;

import core.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static core.driverFactory.getDriver;

public class resultadoBuscaPage extends basePage {

    public String resultadoPesquisa() {
        return dsl.obterTexto(By.xpath("(//div[@id='search-query-input']//div)[5]"));
    }

    public void perfilDoPrestadorVisivel() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
                "(//button[.='Perfil do Prestador'])[1]")));
    }

    public String resultadoEncontradoDaSuaBusca() throws InterruptedException{
        Thread.sleep(1000);
        return dsl.obterTexto(By.xpath(
                "//span[@class='Text TotalFoundProviders']"));
    }

    public String resultadoEncontradoDaSuaBuscaRefinida() throws InterruptedException{
        Thread.sleep(1000);
        return dsl.obterTexto(By.xpath(
                "//span[@class='Text TotalFoundProviders']"));
    }

    public void setEstado(String texto) {
        dsl.clicarBotao(By.xpath(
                "//div[@id='province-input']//div[@class=' css-1ihzl9v-singleValue']"));
        dsl.escrever(By.xpath(
                "(//div[@class='css-26uufv']//input)[2]"), texto);
        dsl.simularTeclaEnter(By.xpath(
                "//div[@id='province-input']"));
    }

    public void setCidade(String texto) {
        dsl.clicarBotao(By.xpath(
                "//div[@id='city-input']//div[@class=' css-1hwfws3']"));
        dsl.escrever(By.xpath(
                "(//div[@class='css-26uufv']//input)[3]"), texto);
        dsl.simularTeclaEnter(By.xpath(
                "//div[@id='city-input']"));
    }

    public void filtar() {
        dsl.clicarBotao(By.xpath("//button[.='Filtrar']"));
    }





















}

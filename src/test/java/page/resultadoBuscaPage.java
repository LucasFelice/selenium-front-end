package page;

import core.basePage;
import maps.resultadoBuscaPageMaps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static core.driverFactory.driver;

public class resultadoBuscaPage extends basePage {

    resultadoBuscaPageMaps resultadoBusca = new resultadoBuscaPageMaps();

    public void perfilDoPrestadorVisivel() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(
                resultadoBusca.btnPerfilDoPrestadorVisivel));
    }

    public String resultadoEncontradoDaSuaBusca() throws InterruptedException{
        Thread.sleep(2000);
        return obterTexto(resultadoBusca.txtResultadoEncontradoDaSuaBusca);
    }

    public String resultadoEncontradoDaSuaBuscaRefinida() throws InterruptedException{
        Thread.sleep(2000);
        return obterTexto(resultadoBusca.txtResultadoEncontradoDaSuaBuscaRefinida);
    }

    public void setEstado(String texto) {
        clicarBotao(resultadoBusca.btnEstado);
        escrever(resultadoBusca.inputEstado, texto);
        simularTeclaTab(resultadoBusca.seletorEstado);
    }

    public void setCidade(String texto) {
        clicarBotao(resultadoBusca.btnCidade);
        escrever(resultadoBusca.inputCidade, texto);
        simularTeclaTab(resultadoBusca.seletorCidade);
    }

    public void filtar() {
        clicarBotao(resultadoBusca.btnFiltrar);
    }
}
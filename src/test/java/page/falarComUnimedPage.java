package page;

import core.basePage;
import maps.falarComUnimedPageMaps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static core.driverFactory.driver;

public class falarComUnimedPage extends basePage {

    falarComUnimedPageMaps falarComUnimed = new falarComUnimedPageMaps();

    public String tituloQueroFalarComAUnimed() {
        return obterTexto(falarComUnimed.txtQueroFalarComAUnimed);
    }

    public void naoCliente() {
        clicarBotao(falarComUnimed.btnNaoCliente);
    }

    public void setNome(String nome) {
        escrever(falarComUnimed.inputNome, nome);
    }

    public void setEmail(String email) {
        escrever(falarComUnimed.inputEmail, email);
    }

    public void setTelefone(String telefone) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                falarComUnimed.txtUnimedQuePrestouServico));
        escrever(falarComUnimed.inputTelefone, telefone);
    }

    public void setMensagem(String mensagem) {
        escrever(falarComUnimed.inputMensagem, mensagem);
    }

    public void setEstado(String estado) throws InterruptedException{
        clicarBotao(falarComUnimed.btnEstado);
        escrever(falarComUnimed.inputEstado,
                estado);
        simularTeclaTab(falarComUnimed.enterNome);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(falarComUnimed.inputCidade));
    }

    public void setCidade(String cidade) throws InterruptedException{
        clicarBotao(falarComUnimed.btnCidade);
        escrever(falarComUnimed.inputCidade, cidade);
        simularTeclaTab(falarComUnimed.enterNome);
        //clicarBotao(falarComUnimed.inputTelefone);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(falarComUnimed.txtUnimedQuePrestouServico));
    }

    public void setManifestacao(String texto) {
        clicarBotao(falarComUnimed.btnManifestacao);
        escrever(falarComUnimed.inputManifestacao, texto);
        simularTeclaTab(falarComUnimed.enterNome);
    }

    public void setAssunto(String texto) {
        clicarBotao(falarComUnimed.btnAssunto);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement inputAssunto = wait.until(ExpectedConditions.elementToBeClickable(falarComUnimed.inputAssunto));
        escrever(falarComUnimed.inputAssunto, texto);
        simularTeclaTab(falarComUnimed.enterNome);
    }

    public void enviarMensagemHabilitado() {
        elementoHabilitado(falarComUnimed.btnenviarMensagem);
    }

    public void enviarMensagemDesabilitado() {
        elementoHabilitado(falarComUnimed.btnenviarMensagem);
    }

    public void campoObrigatorio() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(falarComUnimed.txtCampoObrigatorio));

        obterTexto(falarComUnimed.txtCampoObrigatorio);
        elementoHabilitado(falarComUnimed.txtCampoObrigatorio1);
        elementoHabilitado(falarComUnimed.txtCampoObrigatorio2);
        elementoHabilitado(falarComUnimed.txtCampoObrigatorio3);
        elementoHabilitado(falarComUnimed.txtCampoObrigatorio4);
    }

}
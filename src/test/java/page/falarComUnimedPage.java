package page;

import core.basePage;
import maps.falarComUnimedPageMaps;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static core.driverFactory.getDriver;

public class falarComUnimedPage extends basePage {

    falarComUnimedPageMaps falarComUnimed = new falarComUnimedPageMaps();

    public String tituloQueroFalarComAUnimed() {
        return obterTexto(falarComUnimed.txtQueroFalarComAUnimed);
    }

    public void sim() {
        clicarBotao(falarComUnimed.btnSim);
    }

    public void nao() {
        clicarBotao(falarComUnimed.btnNao);
    }

    public void setNumeroCartaoUnimed(String numeroCartaoUnimed) {
        escrever(falarComUnimed.inputNumeroCartaoUnimed, numeroCartaoUnimed);
    }

    public void setNome(String nome) {
        escrever(falarComUnimed.inputNome, nome);
    }

    public void setEmail(String email) {
        escrever(falarComUnimed.inputEmail, email);
    }

    public void setTelefone(String telefone) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
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
        simularTeclaEnter(falarComUnimed.enterNome);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(falarComUnimed.inputCidade));
    }

    public void setCidade() {
        clicarBotao(falarComUnimed.inputCidade);
        simularTeclaEnter(falarComUnimed.enterNome);
    }

    public void setManifestacao(String texto) {
        clicarBotao(falarComUnimed.btnManifestacao);
        escrever(falarComUnimed.inputManifestacao, texto);
        simularTeclaEnter(falarComUnimed.enterNome);
    }

    public void setAssunto(String texto) {
        clicarBotao(falarComUnimed.btnAssunto);
        escrever(falarComUnimed.inputEstado, texto);
        simularTeclaEnter(falarComUnimed.enterNome);
    }

    public void enviarMensagemHabilitado() {
        elementoHabilitado(falarComUnimed.btnenviarMensagem);
    }

    public void enviarMensagemDesabilitado() {
        elementoHabilitado(falarComUnimed.btnenviarMensagem);
    }

    public void campoObrigatorio() {
        obterTexto(falarComUnimed.txtCampoObrigatorio);
        elementoHabilitado(falarComUnimed.txtCampoObrigatorio1);
        elementoHabilitado(falarComUnimed.txtCampoObrigatorio2);
        elementoHabilitado(falarComUnimed.txtCampoObrigatorio3);
        elementoHabilitado(falarComUnimed.txtCampoObrigatorio4);
    }

}

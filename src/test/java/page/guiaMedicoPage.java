package page;

import core.basePage;
import maps.guiaMedicoPageMaps;
import org.openqa.selenium.By;

public class guiaMedicoPage extends basePage {

    guiaMedicoPageMaps guiaMedico = new guiaMedicoPageMaps();

    public String tituloGuiaMedico() {
        return obterTexto(guiaMedico.txtGuiaMedico);
    }

    public void pesquisar() {
        clicarBotao(guiaMedico.btnPesquisar);
    }

    public void buscaDetalhada() {
        clicarBotao(guiaMedico.btnBuscaDetalhada);
    }

    public void setDigiteAquiOQueProcura(String procurar) {
        escreverEObterTextoGuardandoEmVariavel(guiaMedico.inputDigiteAquiOQueProcura, procurar);
    }

    public void setCPFCliente(String CPF) {
        escrever(guiaMedico.inputCPFCliente, CPF);
    }

    public void alertaCampoBuscaPrecisaSerPreenchido() {
        elementoHabilitado(guiaMedico.alertCampoBuscaPrecisaSerPreenchido);
    }

    public void alertaCPFInvalido() {
        elementoHabilitado(guiaMedico.alertCPFInvalido);
    }

    public void pesquisarDesabilitado() {
        elementoHabilitado(guiaMedico.btnPesquisarDesabilitado);
    }

    public void scrollAteCampoDigiteSeuCPF() {
        rolagemAteCampo("client-input");
    }

    public void teleatendimento() {
        clicarCheckbox(guiaMedico.checkboxTeleAtendimento);
    }

    public void checkboxTeleatendimentoHabilitado() {
        elementoHabilitado(guiaMedico.checkboxTeleAtendimento);
    }

    public void checkboxTeleatendimentoDesabilitado() {
        elementoDesabilitado(guiaMedico.checkboxTeleAtendimento);
    }

    public void checkboxUrgenciaEEmergenciaHabilitado() {
        elementoHabilitado(guiaMedico.checkboxUrgenciaEEmergencia);
    }

    public void checkboxUrgenciaEEmergenciaDesabilitado() {
        elementoDesabilitado(guiaMedico.checkboxUrgenciaEEmergencia);
    }

    public void checkboxMudancaNaRedeHabilitado() {
        elementoHabilitado(guiaMedico.checkboxMudancaNaRede);
    }

    public void checkboxMudancaNaRedeDesabilitado() {
        elementoDesabilitado(guiaMedico.checkboxMudancaNaRede);
    }

    public void urgenciaEEmergencia() {
        clicarCheckbox(guiaMedico.checkboxUrgenciaEEmergencia);
    }

    public void mudancaNaRede() {
        clicarCheckbox(guiaMedico.checkboxMudancaNaRede);
    }

    public String guardarResultadoPesquisa(String texto) {
        return obterTexto(texto);
    }

    public void setEspecialidade(String texto) {
        clicarBotao(guiaMedico.btnEspecialidade);
        escrever(guiaMedico.inputEspecialidade, texto);
        simularTeclaEnter(guiaMedico.enterEspecialidade);
    }

    public void setEstado(String texto) {
        clicarBotao(guiaMedico.btnEstado);
        escrever(guiaMedico.inputEstado, texto);
        simularTeclaEnter(guiaMedico.enterEstado);
    }

    public void setCidade(String texto) {
        clicarBotao(guiaMedico.btnCidade);
        escrever(guiaMedico.inputCidade, texto);
        simularTeclaEnter(guiaMedico.enterCidade);
    }

}

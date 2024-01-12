package maps;

import org.openqa.selenium.By;

public class guiaMedicoPageMaps {

    public final By txtGuiaMedico = By.xpath(
            "//div[@class='text-center col']/h1[.='Guia Médico']");
    public final By btnPesquisar = By.xpath(
            "//button[@class='Button Button--block Button--featured Button--secondary']");
    public final By btnBuscaDetalhada = By.xpath("//li[.='Busca detalhada']");
    public final By inputDigiteAquiOQueProcura = By.xpath(
            "//input[@id='react-select-3-input']");
    public final By inputCPFCliente = By.id("client-input");
    public final By alertCampoBuscaPrecisaSerPreenchido = By.xpath(
            "//div[@class='Select--invalid-field-icon']");
    public final By alertCPFInvalido = By.xpath(
            "//div[@class='Input--indicators']");
    public final By btnPesquisarDesabilitado = By.xpath(
            "//button[@class='Button Button--block Button--featured Button--disabled Button--secondary']");
    public final By rolarScrollAteCPFCliente = By.xpath("//input[@id='client-input']");
    public final By checkboxTeleAtendimento = By.id("Switch-4");
    public final By checkboxUrgenciaEEmergencia = By.id("Switch-5");
    public final By checkboxMudancaNaRede = By.id("Switch-6");
    public final By btnEspecialidade = By.xpath(
            "//div[@class=' css-1xamc9y-placeholder' and text()='Especialidade']");
    public final By inputEspecialidade = By.xpath(
            "(//div[@class='css-26uufv']//input)[1]");
    public final By enterEspecialidade = By.xpath(
            "(//div[@class='css-26uufv']//input)[1]");
    public final By btnEstado = By.xpath(
            "//div[@class='Select--required-field css-1xamc9y-placeholder' and text()='Estado']");
    public final By inputEstado = By.xpath(
            "(//div[@class='css-26uufv']//input)[2]");
    public final By enterEstado = By.xpath(
            "(//div[@class='css-26uufv']//input)[2]");
    public final By btnCidade = By.xpath(
            "//div[@class=' css-1xamc9y-placeholder' and text()='Cidade']");
    public final By inputCidade = By.xpath(
            "(//div[@class='css-26uufv']//input)[3]");
    public final By enterCidade = By.xpath(
            "(//div[@class='css-26uufv']//input)[3]");

}

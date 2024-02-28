package maps;

import org.openqa.selenium.By;

public class falarComUnimedPageMaps {

    public final By txtQueroFalarComAUnimed = By.xpath(
            "//h2[.='Quero falar com a Unimed']");
    public final By btnNao = By.xpath("//button[@name='naoCliente']");
    public final By inputNome = By.xpath("//input[@name='nome']");
    public final By inputEmail = By.xpath("//input[@name='email']");
    public final By txtUnimedQuePrestouServico = By.xpath(
            "//div[@class='container container__480']/form/div[4]");
    public final By inputTelefone = By.xpath("//input[@id='telefone']");
    public final By inputMensagem = By.xpath("//textarea[@id='mensagem']");
    public final By btnEstado = By.xpath(
            "//div[@class='Select-placeholder' and text()='Estado']");
    public final By inputEstado = By.xpath("//input[@id='estado']");
    public final By enterNome = By.xpath("//input[@name='nome']");
    public final By btnCidade = By.xpath(
            "//div[@class='Select-placeholder' and text()='Cidade']");
    public final By inputCidade = By.xpath(
            "//input[@id='cidade']");
    public final By btnManifestacao = By.xpath(
            "(//div[@id='react-select-4--value']/div)[1]");
    public final By inputManifestacao = By.xpath(
            "//input[@id='manifestacao']");
    public final By btnAssunto = By.xpath(
            "//div[@class='Select-placeholder' and text()='Assunto']");
    public final By inputAssunto = By.xpath(
            "//input[@id='assunto']");
    public final By btnenviarMensagem = By.xpath("//a[.='Enviar Mensagem']");
    public final By txtCampoObrigatorio = By.xpath("//*[@class='invalid-feedback']");
    public final By txtCampoObrigatorio1 = By.xpath("(//*[@class='invalid-feedback'])[1]");
    public final By txtCampoObrigatorio2 = By.xpath("(//*[@class='invalid-feedback'])[2]");
    public final By txtCampoObrigatorio3 = By.xpath("(//*[@class='invalid-feedback'])[3]");
    public final By txtCampoObrigatorio4 = By.xpath("(//*[@class='invalid-feedback'])[4]");

}
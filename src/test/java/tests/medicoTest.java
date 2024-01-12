package tests;

import core.baseTest;
import org.junit.Assert;
import org.junit.Test;


import static core.driverFactory.getDriver;


public class medicoTest extends baseTest {


    //Neste CT eu valido o comportamento da tela ao tentar realizar uma busca sem informações no campo
    //"Digite aqui o que você procura".
    @Test
    public void testEncontreUmMedicoAlertaDigiteSuaBusca() {
        home.encontreUmMedico();
        Assert.assertEquals("Guia Médico", guiaMedico.tituloGuiaMedico());
        guiaMedico.scrollAteCampoDigiteSeuCPF();
        guiaMedico.pesquisar();
        guiaMedico.alertaCampoBuscaPrecisaSerPreenchido();
    }

    //Neste CT eu valido o se os checkbox's da página "Teleatendimento", "Urgência e Emergência" e "Mudança
    //na Rede" estão funcionando corretamente.
    @Test
    public void testEncontreUmMedicoComportamentoDosCheckboxs() {
        home.encontreUmMedico();
        Assert.assertEquals("Guia Médico", guiaMedico.tituloGuiaMedico());
        guiaMedico.teleatendimento();
        guiaMedico.urgenciaEEmergencia();
        guiaMedico.mudancaNaRede();
        guiaMedico.checkboxTeleatendimentoHabilitado();
        guiaMedico.checkboxUrgenciaEEmergenciaHabilitado();
        guiaMedico.checkboxMudancaNaRedeHabilitado();
        guiaMedico.teleatendimento();
        guiaMedico.urgenciaEEmergencia();
        guiaMedico.mudancaNaRede();
        guiaMedico.checkboxTeleatendimentoDesabilitado();
        guiaMedico.checkboxUrgenciaEEmergenciaDesabilitado();
        guiaMedico.checkboxMudancaNaRedeDesabilitado();
    }

    @Test
    public void testEncontreUmMedicoViaCampoDeBusca() throws InterruptedException{
        home.encontreUmMedico();
        Assert.assertEquals("Guia Médico", guiaMedico.tituloGuiaMedico());
        guiaMedico.setDigiteAquiOQueProcura("Pediatria");
        guiaMedico.pesquisar();
        Assert.assertTrue("Pediatria", getDriver().getPageSource().contains("Pediatria"));
        resultadoBusca.perfilDoPrestadorVisivel();
    }

    @Test
    public void testEncontreUmMedicoViaCPFClienteInvalido() {
        home.encontreUmMedico();
        Assert.assertEquals("Guia Médico", guiaMedico.tituloGuiaMedico());
        guiaMedico.setCPFCliente("000000");
        guiaMedico.alertaCPFInvalido();

    }

    @Test
    public void testEncontreUmMedicoViaBuscaDetalhadaComTresFiltros() throws InterruptedException{
        home.encontreUmMedico();
        Assert.assertEquals("Guia Médico", guiaMedico.tituloGuiaMedico());
        guiaMedico.buscaDetalhada();
        guiaMedico.setEspecialidade("Pediatria");
        guiaMedico.setEstado("Minas gerais");
        guiaMedico.setCidade("Juiz de Fora");
        guiaMedico.pesquisar();
        resultadoBusca.perfilDoPrestadorVisivel();
    }

    @Test
    public void testEncontreUmMedicoERefineSuaBusca() throws InterruptedException{
        home.encontreUmMedico();
        Assert.assertEquals("Guia Médico", guiaMedico.tituloGuiaMedico());
        guiaMedico.buscaDetalhada();
        guiaMedico.setEspecialidade("Pediatria");
        guiaMedico.setEstado("Minas gerais");
        guiaMedico.setCidade("Juiz de Fora");
        guiaMedico.pesquisar();
        resultadoBusca.perfilDoPrestadorVisivel();
        String resultadoPesquisa1 = resultadoBusca.resultadoEncontradoDaSuaBusca();
        resultadoBusca.setEstado("Rio de Janeiro");
        resultadoBusca.setCidade("Rio de Janeiro");
        resultadoBusca.filtar();
        String resultadoPesquisa2 = resultadoBusca.resultadoEncontradoDaSuaBuscaRefinida();
        System.out.println("Resultado 1: " + resultadoPesquisa1);
        System.out.println("Resultado 2: " + resultadoPesquisa2);
        Assert.assertNotEquals(resultadoPesquisa1,
                resultadoPesquisa2);
    }

    @Test
    public void testEncontreUmMedicoViaAcessoRapido() throws InterruptedException{
        home.acessoRapido();
        acessoRapido.encontreUmMedico();
        Assert.assertEquals("Guia Médico", guiaMedico.tituloGuiaMedico());
        guiaMedico.setDigiteAquiOQueProcura("Pediatria");
        guiaMedico.pesquisar();
        Assert.assertTrue("Pediatria", getDriver().getPageSource().contains("Pediatria"));
        resultadoBusca.perfilDoPrestadorVisivel();
    }

}

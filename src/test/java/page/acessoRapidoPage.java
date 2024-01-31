package page;

import core.basePage;
import maps.acessoRapidoPageMaps;


public class acessoRapidoPage extends basePage {

    acessoRapidoPageMaps acessoRapido = new acessoRapidoPageMaps();

    public void encontreUmMedico() throws InterruptedException{
        Thread.sleep(3000);
        clicarBotao(acessoRapido.btnEncontreUmMedico);
        trocarJanela();
    }
}

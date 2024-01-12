package page;

import core.basePage;

import maps.canaisDeAtendimentoPageMaps;

public class canaisDeAtendimentoPage extends basePage {

    canaisDeAtendimentoPageMaps canaisDeAtendimento = new canaisDeAtendimentoPageMaps();

    public String tituloComoPodemosTeAjudar() {
        return obterTexto(canaisDeAtendimento.txtComoPodemosTeAjudar);
    }

    public void queroFalarComAUnimed() {
        clicarBotao(canaisDeAtendimento.btnFalarComAUnimed);
    }

    public void queroContratarUmPlano() {
        clicarBotao(canaisDeAtendimento.btnQueroContratarUmPlano);
    }

}

package tests;

import core.baseTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import com.github.javafaker.Faker;
import java.util.Locale;

public class canaisDeAtendimentoTest extends baseTest {

    Faker faker = new Faker(new Locale("pt-BR"));

    String fakerFirstName = faker.name().firstName();
    String fakerLastName = faker.name().lastName();
    String fakerEmail = faker.internet().emailAddress(
            fakerFirstName + fakerLastName).toLowerCase();
    String fakerEstado = faker.address().state();
    String fakerTelefone = faker.phoneNumber().cellPhone();


    @Test
    public void queroFalarComAUnimedNaoCliente() throws InterruptedException{
        home.canaisDeAtendimento();
        Assertions.assertEquals(
                "Como podemos te ajudar? ", canaisAtendimento.tituloComoPodemosTeAjudar());
        canaisAtendimento.queroFalarComAUnimed();
        Assertions.assertEquals(
                "Quero falar com a Unimed", falarComUnimed.tituloQueroFalarComAUnimed());
        falarComUnimed.nao();
        falarComUnimed.setNome(fakerFirstName + " " +fakerLastName);
        falarComUnimed.setEmail(fakerEmail);
        falarComUnimed.setEstado(fakerEstado);
        falarComUnimed.setCidade();
        falarComUnimed.setTelefone(fakerTelefone);
        falarComUnimed.setManifestacao("Elogio");
        falarComUnimed.setAssunto("Operadora Unimed");
        falarComUnimed.setMensagem("Teste");
        falarComUnimed.enviarMensagemHabilitado();
    }

    @Test
    public void queroFalarComAUnimedNaoClienteVerificandoCamposObrigatorios() throws InterruptedException{
        home.canaisDeAtendimento();
        Assertions.assertEquals(
                "Como podemos te ajudar? ", canaisAtendimento.tituloComoPodemosTeAjudar());
        canaisAtendimento.queroFalarComAUnimed();
        Assertions.assertEquals(
                "Quero falar com a Unimed", falarComUnimed.tituloQueroFalarComAUnimed());
        falarComUnimed.nao();
        falarComUnimed.setNome("");
        falarComUnimed.setEmail("");
        falarComUnimed.setEstado("");
        falarComUnimed.setCidade();
        falarComUnimed.setTelefone("");
        falarComUnimed.setManifestacao("");
        falarComUnimed.setMensagem("");
        falarComUnimed.setTelefone("");
        falarComUnimed.campoObrigatorio();
        falarComUnimed.enviarMensagemDesabilitado();

    }

}

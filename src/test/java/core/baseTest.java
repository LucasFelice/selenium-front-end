package core;

import com.github.javafaker.Faker;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import page.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

public class baseTest extends driverFactory{

    private static final long DEFAULT_TIME_WAIT = 10;

    public static WebDriver getDriver() {
        return driverFactory.driver;
    }

    protected void openURL(String url) {
        getDriver().get(url);
    }

    public WebDriver driver;
    public DSL dsl;
    public falarComUnimedPage menu;
    public guiaMedicoPage guiaMedico;
    public acessoRapidoPage acessoRapido;
    public resultadoBuscaPage resultadoBusca;
    public homePage home;
    public canaisDeAtendimentoPage canaisAtendimento;
    public falarComUnimedPage falarComUnimed;


    @BeforeEach
    public void testInicializar() throws IOException {
        dsl = new DSL();
        menu = new falarComUnimedPage();
        guiaMedico = new guiaMedicoPage();
        acessoRapido = new acessoRapidoPage();
        resultadoBusca = new resultadoBuscaPage();
        home = new homePage();
        canaisAtendimento = new canaisDeAtendimentoPage();
        falarComUnimed = new falarComUnimedPage();

        driver = initDriver();
        driver.get(property.getProperty("url"));
        home.aceitarCookies();

    }

    @AfterEach
    public void tearDown()  {
            if (driver != null) {
                driver.quit();
            }
        }



    protected JSONObject getJsonDataObject(String jsonFileName, String dataGroup) {
        JSONParser parser = new JSONParser();

        jsonFileName = osAdaptFileName(jsonFileName);
        JSONObject jsonDataObject = null;
        try {
            Object jsonFileObject = parser.parse(new FileReader(System.getProperty("user.dir") + File.separator + "src" +
                    File.separator + "test" + File.separator + "java" + File.separator + "data" + File.separator + jsonFileName));
            jsonDataObject = (JSONObject) jsonFileObject;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assert jsonDataObject != null;
        return (JSONObject) jsonDataObject.get(dataGroup);
    }

    private String osAdaptFileName(String baseFileName) {
        if (System.getProperty("os.name").startsWith("Windows")) {
            baseFileName += ".json";
        }
        return baseFileName;
    }

    protected String getJsonDataProperty(JSONObject jsonData, String jsonProperty){
        return new String(jsonData.get(jsonProperty).
                toString().getBytes(Charset.forName("ISO-8859-1")), Charset.forName("UTF-8"));
    }

    ///// Configuração do Faker  /////

    Faker faker = new Faker(new Locale("pt-BR"));

    public String fakerFirstName = faker.name().firstName();
    public String fakerLastName = faker.name().lastName();
    public String fakerEmail = faker.internet().emailAddress(
            fakerFirstName + fakerLastName).toLowerCase();
    public String fakerEstado = faker.address().state();
    public String fakerTelefone = faker.phoneNumber().cellPhone();
}

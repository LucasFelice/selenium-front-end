package core;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;
import static core.driverFactory.driver;

public class DSL{


    /******** Botao ********/

    public void clicarBotao(By by) {
        driver.findElement(by).click();
    }

    public void clicarBotao(String id) {
        clicarBotao(By.id(id));
    }


    /******** Radio ********/

    public void clicarRadio(By by) {
        driver.findElement(by).click();
    }

    public void clicarRadio(String id) {
        clicarRadio((By.id(id)));
    }


    /******** Radio ********/

    public void clicarCheckbox(By by) {
        driver.findElement(by).click();
    }

    public void clicarCheckbox(String id) {
        clicarRadio((By.id(id)));
    }


    /******** Link ********/

    public void clicarLink(String Link) {
        driver.findElement(By.linkText(Link)).click();
    }


    /******** TextField & TextArea ********/

    public void escrever(By by, String texto){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(texto);
    }

    public void escrever(String id_campo, String texto){
        escrever(id_campo, texto);
    }


    public String escreverEObterTextoGuardandoEmVariavel(By by, String texto) {
        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(texto);
        String busca = element.getText();

        return busca;
    }


    public String validarCampoPreenchido(By by) {
        WebElement elemento = driver.findElement(by);
        String valorCampo = elemento.getAttribute("value");

        if (valorCampo != null && !valorCampo.isEmpty()) {
            return valorCampo;
        } else {
            return null;
        }
    }

    public String validarCampoPreenchido(String id) {
        return validarCampoPreenchido(By.id(id));
    }

    public String obterTexto(By by) {
        return driver.findElement(by).getText();
    }

    public String obterTexto(String id) {
        return obterTexto(By.id(id));
    }

    public void elementoHabilitado(By by) {
        WebElement element = driver.findElement(by);
        boolean isEnabled = element.isEnabled();
        if (isEnabled) {
            System.out.println("O elemento está habilitado.");
        } else {
            System.out.println("O elemento não está habilitado. Falha no teste!");
        }
    }


    public void elementoDesabilitado(By by) {
        WebElement element = driver.findElement(by);
        boolean isDisplayed = element.isDisplayed();
        if (isDisplayed) {
            System.out.println("O elemento está habilitado. Falha no teste!");
        } else {
            System.out.println("O elemento está desabilitado.");
        }
    }


    /******** Combo ********/

    public void selecionarCombo(By by, String valor) {
        WebElement element = driver.findElement(by);
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public void selecionarComboByValue(By by, String valor) {
        WebElement element = driver.findElement(by);
        Select combo = new Select(element);
        combo.selectByValue(valor);
    }

    public void selecionarCombo(String id, String valor) {
        By by = By.id(id);
        selecionarCombo(by, valor);
    }


    /******** Alerts ********/

    public String alertaObterTextoEAceita() {
        Alert alert = driver.switchTo().alert();
        String valor = alert.getText();
        alert.accept();
        return valor;
    }


    /******** Frames e Janelas ********/

    public void entrarFrame(String id) {
        driver.switchTo().frame(id);
    }

    public void sairFrame() {
        driver.switchTo().defaultContent();
    }

    public void trocarJanela() {
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            driver.switchTo().window(handle);
        }
    }


    /******** Scroll ********/

    public void rolagemAteCampo(String id ) {
        WebElement button = driver.findElement(By.id(id));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
    }

    /******** Simular aperto tecla ********/

    public void simularTeclaEnter(By by) {
        WebElement elemento = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(elemento).sendKeys("\n").build().perform();
    }

    public void simularTeclaTab(By by) {
        WebElement elemento = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(elemento).sendKeys(Keys.TAB).build().perform();
    }


















}

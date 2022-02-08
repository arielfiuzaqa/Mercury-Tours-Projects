package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages_dsl.DSL;

public class MercuryToursCadastroELoginTest {

    public WebDriver driver;
    private DSL dsl;

    @Before
    public void inicio(){ dsl = new DSL(driver); dsl.abrirChrome(); }

    @Test
    public void fazerCadastro(){
        dsl.vouParaSite();
        dsl.preencherInformacaoDeContato();
        dsl.preencherInformacoesDeCorrespondencia();
        dsl.preencherInformacoesDeUsuario();
        dsl.clickEnviar();
    }
    @Test
    public void fazerLogin() {
        dsl.vouParaSite();
        dsl.preencherLoginESenha();
        dsl.confirmarLogin();
    }
    @After
    public void fim(){
        dsl.fecharBrowser();
    }
}

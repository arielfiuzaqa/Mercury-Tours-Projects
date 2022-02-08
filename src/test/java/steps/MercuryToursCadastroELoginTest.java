package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages_dsl.DSL;
import pages_dsl.campoPage;

public class MercuryToursCadastroELoginTest {

    public WebDriver driver;
    private DSL dsl;
    private campoPage page;

    @Before
    public void inicio(){ dsl = new DSL(driver); page = new campoPage(driver); }

    @Test
    public void fazerCadastro(){
        page.irSite();
        page.execucaoCompletaCadastro();
    }
    @Test
    public void fazerLogin() {
        page.irSite();
        page.execucaoCompletaLogin();
    }
    @After
    public void fim(){ page.finalizar(); }
}

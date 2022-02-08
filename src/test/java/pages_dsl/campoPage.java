package pages_dsl;

import org.openqa.selenium.WebDriver;

public class campoPage {

    private DSL dsl;
    public campoPage(WebDriver driver) { dsl = new DSL(driver); }

    public void execucaoCompleta(){
        //dsl.vouParaSite();
        dsl.preencherInformacaoDeContato();
        dsl.preencherInformacoesDeCorrespondencia();
        dsl.preencherInformacoesDeUsuario();
        dsl.clickEnviar();

        dsl.vouParaSite();
        dsl.preencherLoginESenha();
        dsl.confirmarLogin();
    }
    public void vaiParaSite(){
        dsl.vouParaSite();
    }
}

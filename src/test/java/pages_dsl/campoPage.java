package pages_dsl;

import org.openqa.selenium.WebDriver;

public class campoPage {

    private DSL dsl;
    public campoPage(WebDriver driver) { dsl = new DSL(driver); }

    public void irSite() {
        dsl.abrirChrome();
    }
    public void execucaoCompletaCadastro() {
        dsl.vouParaSite("https://demo.guru99.com/test/newtours/");
        dsl.preencherInformacaoDeContato("Rick", "Philliphs", "69888886969", "zezim01@gmail.com");
        dsl.preencherInformacoesDeCorrespondencia("Rua Dos Sonhadores", "Céu", "Mil Maravilhas", "666-9669");
        dsl.preencherInformacoesDeUsuario("zezim01@gmail.com", "*8585916#AF669", "*8585916#AF669");
        dsl.clickEnviar();
    }
    public void execucaoCompletaLogin() {
            dsl.vouParaSite("https://demo.guru99.com/test/newtours/");
            dsl.preencherLoginESenha("zezim01@gmail.com", "*8585916#AF669");
            dsl.confirmarLogin();
        }
    public void vaiParaSite(){
        dsl.vouParaSite("https://demo.guru99.com/test/newtours/");
    }
    public void finalizar() {
        dsl.fecharBrowser();
    }
}

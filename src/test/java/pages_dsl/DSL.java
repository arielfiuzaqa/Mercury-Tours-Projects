package pages_dsl;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DSL {

    private WebDriver driver;
    public DSL(WebDriver driver) { this.driver = driver; }

    public void abrirChrome(){ System.setProperty("webdriver.chrome.driver", "C:/Program Files/JetBrains/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); }
    public void vouParaSite(String site){ driver.get(site); }
    public void preencherInformacaoDeContato(String name, String sobrenome, String fone, String email){
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(sobrenome);
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(fone);
        driver.findElement(By.id("userName")).sendKeys(email);
    }
    public void preencherInformacoesDeCorrespondencia(String rua, String city, String state, String postalCode){
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(rua);
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalCode);
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        country.click();
        country.findElement(By.xpath("//option[@value='BRAZIL']")).click();
    }
    public void preencherInformacoesDeUsuario(String usuario,String senha,String confirmeSenha){
        driver.findElement(By.id("email")).sendKeys(usuario);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(senha);
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmeSenha);
    }
    public void clickEnviar(){ driver.findElement(By.xpath("//input[@name='submit']")).click();
        List<WebElement> fonts = driver.findElements(By.tagName("font"));
        Assert.assertEquals("Note: Your user name is zezim01@gmail.com.", fonts.get(5).getText()); }
    public void preencherLoginESenha(String usuario, String senha){ driver.findElement(By.name("userName")).sendKeys(usuario);
        driver.findElement(By.name("password")).sendKeys(senha); driver.findElement(By.name("submit")).click(); }
    public void confirmarLogin(){ List<WebElement> fonts = driver.findElements(By.tagName("font"));
        Assert.assertEquals("Thank you for Loggin.", fonts.get(3).getText()); }
    public void fecharBrowser(){ driver.quit(); }
}

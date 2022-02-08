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
        driver.manage().window().maximize();
    }
    public void vouParaSite(){ driver.get("https://demo.guru99.com/test/newtours/"); }
    public void preencherInformacaoDeContato(){
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Pastels");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Rick");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("85999999999");
        driver.findElement(By.id("userName")).sendKeys("test.007@gmail.com.br");
    }
    public void preencherInformacoesDeCorrespondencia(){
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Rua Caralho Viado!");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Virgin");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Marte");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("666-6969");
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        country.click();
        country.findElement(By.xpath("//option[@value='BRAZIL']")).click();
    }
    public void preencherInformacoesDeUsuario(){
        driver.findElement(By.id("email")).sendKeys("test.007@gmail.com.br");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("#6969888A");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("#6969888A");
    }
    public void clickEnviar(){
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        List<WebElement> fonts = driver.findElements(By.tagName("font"));
        Assert.assertEquals("Note: Your user name is test.007@gmail.com.br.", fonts.get(5).getText());
    }
    public void preencherLoginESenha(){
        driver.findElement(By.name("userName")).sendKeys("test.007@gmail.com.br");
        driver.findElement(By.name("password")).sendKeys("#6969888A");
        driver.findElement(By.name("submit")).click();
    }
    public void confirmarLogin(){
        List<WebElement> fonts = driver.findElements(By.tagName("font"));
        Assert.assertEquals("Thank you for Loggin.", fonts.get(3).getText());
    }
    public void fecharBrowser(){ driver.quit(); }
}

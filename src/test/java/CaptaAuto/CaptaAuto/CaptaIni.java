package CaptaAuto.CaptaAuto;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptaIni {
	private WebDriver navegador;
	private Set<String> handle;

	@Before
	public void Acesso_capta() {
		// indicando aonde está salvo o driver para acesso
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\calfredo\\Desktop\\chromedriver_win32\\chromedriver.exe");
		// abertura do navegador
		navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		navegador.get("https://pedidoshml3.natura.net/captaweb/captaweb/index.html");
		navegador.manage().window().maximize(); // código serve para maximizar a tela do navegador
		handle = navegador.getWindowHandles();
	}

	@Test
	public void login() {

		navegador.findElement(By.id("username")).sendKeys("7089716");
		navegador.findElement(By.id("password")).sendKeys("senha123");
		navegador.findElement(By.id("botaoOK")).click();
		navegador.findElement(By.id("BuscaProduto0_textBoxCodigo")).sendKeys("13125"); // inserindo item
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click(); // inserindo
																											// quantidade
																											// do item
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.id("BuscaProduto0_buttonAdicionar")).click();
		navegador.findElement(By.id("pedido_continuarButton")).click();
		navegador.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/button")).click();
		// navegador.findElement(By.xpath("//*[@id=\"ItemResgatarPromocao0_quantidade\"]/button[2]")).click();
		//navegador.findElement(By.id("ItemResgatarPromocao0_quantidade"))
			//	.findElement(By.id("//*[@id=\"ItemResgatarPromocao0_quantidade\"]/button[2]")).click();
		//navegador.findElement(By.id("ItemResgatarPromocao0_alterarProdutoPedidoButton")).click();
		//navegador.findElement(By.id("breadCrumbValePontos_botoesPanel"))
			//	.findElement(By.id("breadCrumbValePontos_avancarButton")).click();
	}
}

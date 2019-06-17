package CaptaAuto.CaptaAuto;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capta_Fluxo_Normal {
	private WebDriver navegador;

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
		navegador.getWindowHandles();
	}

	@Test
	public void login() throws InterruptedException {
		// Login no capta
		navegador.findElement(By.id("username")).sendKeys("70771162");
		navegador.findElement(By.id("password")).sendKeys("senha123");
		navegador.findElement(By.id("botaoOK")).click();
		Thread.sleep(6000);
		navegador.findElement(By.id("BuscaProduto0_textBoxCodigo")).sendKeys("15334");
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		// captação na tela principal
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"BuscaProduto0_inputQuantidade\"]/button[2]")).click();
		navegador.findElement(By.id("BuscaProduto0_buttonAdicionar")).click();
		navegador.findElement(By.id("pedido_continuarButton")).click();
		// seguindo para a tela seguinte
		navegador.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/button")).click();
		navegador.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div/button")).click();
		// seleciona parcela do boleto
		navegador.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/nav/button[2]")).click();
		navegador.findElement(By.xpath("//*[@id=\"gwt-uid-7\"]")).click();
		// botão finalizar
		navegador.findElement(By.id("conferirPedidoPagamento_finalizarButton")).click();
		// tempo de espera para sair
		Thread.sleep(6000);
		// clicar no botão [Sair]
		JavascriptExecutor js = (JavascriptExecutor) navegador;
		js.executeScript("document.getElementById('main_buttonSair').click();");
		navegador.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/nav/button[2]")).click();

	}

	@After
	public void fecharNavegador() {
		navegador.quit();

	}
}

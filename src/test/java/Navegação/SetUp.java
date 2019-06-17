package Navegação;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\calfredo\\Desktop\\chromedriver_win32\\chromedriver.exe");
		abreNavegador();

	}

	private static WebDriver driver;

	@Before
	public static void abreNavegador() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://g1.globo.com/");

	}

	@Test
	public void acessaNoticia() {
		driver.findElement(By.className("post-previsao-do-tempo__header")).click();

	}

}

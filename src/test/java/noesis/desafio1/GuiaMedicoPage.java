package noesis.desafio1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GuiaMedicoPage extends GuiaMedicoElements {

	public static WebDriver driver;

	public void acessarUnimed() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.geolocation", 2);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.unimed.coop.br/");
		driver.manage().window().maximize();
	}

	public void acessarGuiaMedico() {
		driver.findElement(GUIA_MEDICO).click();
	}

	public void preencherPesquisa() {
		driver.findElement(CAMPO_PESQUISA).sendKeys(ALEXANDRE_RACHID_DE_SOUZA);
	}

	public void clicarPesquisar() {
		driver.findElement(BOTAO_PESQUISAR).click();
	}

	public void selecionarEstado() {
		driver.findElement(COMBO_ESTADO).sendKeys(RIO_DE_JANEIRO, Keys.ENTER);
	}

	public void selecionarCidade() {
		driver.findElement(COMBO_CIDADE).sendKeys(RIO_DE_JANEIRO, Keys.ENTER);
	}

	public void selecionarOpcao() {
		driver.findElement(RADIO_BUTTON_SELECIONAR_UNIMED).click();
	}

	public void clicarContinuar() {
		driver.findElement(BOTAO_CONTINUAR).click();
	}

	public void validacaoEspecialidade() {
		String especialidade = driver.findElement(ESPECIALIDADE).getText();
		assertEquals("Erro ao validar a especialidade:", ORTOPEDIA_E_TRAUMATOLOGIA, especialidade);
	}

	public void validarCidade() {
		boolean cidade = driver.findElement(LINHA_CIDADE_UM).getText().contains(RIO_DE_JANEIRO);
		assertTrue("Erro ao validar a cidade:", cidade);
	}

	public void validarPaginaUm() {
		StringBuilder paginaUm = new StringBuilder();
		paginaUm.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText());
		boolean isSaoPaulo = paginaUm.toString().contains(SAO_PAULO);
		assertFalse("Erro ao validar a página 1:", isSaoPaulo);
	}

	public void clicarPaginaDois() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(PAGINA_DOIS).click();
	}

	public void validarPaginaDois() {
		StringBuilder paginaDois = new StringBuilder();
		paginaDois.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText());
		boolean isSaoPaulo = paginaDois.toString().contains(SAO_PAULO);
		assertFalse("Erro ao validar a página 2:", isSaoPaulo);
	}

	public void clicarPaginaTres() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(PAGINA_TRES).click();
	}

	public void validarPaginaTres() {
		StringBuilder paginaTres = new StringBuilder();
		paginaTres.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_DOIS).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText())
				.append(driver.findElement(LINHA_CIDADE_TRES).getText())
				.append(driver.findElement(LINHA_CIDADE_UM).getText());
		boolean isSaoPaulo = paginaTres.toString().contains(SAO_PAULO);
		assertFalse("Erro ao validar a página 3:", isSaoPaulo);
	}

}

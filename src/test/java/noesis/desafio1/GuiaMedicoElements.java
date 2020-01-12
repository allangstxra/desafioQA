package noesis.desafio1;

import org.openqa.selenium.By;

public class GuiaMedicoElements {
	
	public static final By BOTAO_CONTINUAR = By.cssSelector("#app > div > div > div > div > div.margin-top.margin-bottom > button.btn.btn-success");
	public static final By BOTAO_PESQUISAR = By.id("btn_pesquisar");
	public static final By COMBO_CIDADE = By.id("react-select-3-input");
	public static final By CAMPO_PESQUISA = By.id("campo_pesquisa");
	public static final By COMBO_ESTADO = By.id("react-select-2-input");
	public static final By ESPECIALIDADE = By.cssSelector("#resultado0 > div.resultado-resumido.padding.relative > p > span:nth-child(2)");
	public static final By GUIA_MEDICO = By.cssSelector("#menuPrincipalItens > ul > li:nth-child(2) > a");
	public static final By LINHA_CIDADE_DOIS = By.cssSelector("#txt_endereco > p");
	public static final By LINHA_CIDADE_TRES = By.cssSelector("#txt_endereco > p:nth-child(1)");
	public static final By LINHA_CIDADE_UM = By.cssSelector("#txt_endereco > p:nth-child(2)");
	public static final By PAGINA_TRES = By.cssSelector("#app > div > div > div.fade-in > div.span12.pagination.text-center.no-margin-left > div > ul > li:nth-child(5) > a");
	public static final By PAGINA_DOIS = By.cssSelector("#app > div > div > div.fade-in > div.span12.pagination.text-center.no-margin-left > div > ul > li:nth-child(4) > a");
	public static final By RADIO_BUTTON_SELECIONAR_UNIMED = By.cssSelector("#app > div > div > div > div > div.span6.no-margin-left > form > label > div:nth-child(1) > input[type=radio]");
	public static final String ALEXANDRE_RACHID_DE_SOUZA = "Alexandre Rachid de Souza";
	public static final String ORTOPEDIA_E_TRAUMATOLOGIA = "Ortopedia e Traumatologia";
	public static final String RIO_DE_JANEIRO = "Rio de Janeiro";
	public static final String SAO_PAULO = "São Paulo";
	
}

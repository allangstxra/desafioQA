package noesis.desafio1;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class GuiaMedicoTest extends GuiaMedicoPage {

	GuiaMedicoPage guiaMedicoPage = new GuiaMedicoPage();

	@Dado("^que eu esteja no site da Unimed$")
	public void que_eu_esteja_no_site_da_Unimed() throws Throwable {
		guiaMedicoPage.acessarUnimed();
	}

	@Dado("^acesso o Guia Médico$")
	public void acesso_o_Guia_Médico() throws Throwable {
		guiaMedicoPage.acessarGuiaMedico();
	}

	@Dado("^pesquiso por um médico no Rio de Janeiro$")
	public void pesquiso_por_um_médico_no_Rio_de_Janeiro() throws Throwable {
		guiaMedicoPage.preencherPesquisa();
	}

	@Quando("^eu clico em Pesquisar$")
	public void eu_clico_em_Pesquisar() throws Throwable {
		guiaMedicoPage.clicarPesquisar();
	}

	@Quando("^no combo de estado e cidade eu seleciono Rio de Janeiro$")
	public void no_combo_de_estado_e_cidade_eu_seleciono_Rio_de_Janeiro() throws Throwable {
		guiaMedicoPage.selecionarEstado();
		guiaMedicoPage.selecionarCidade();
	}

	@Quando("^seleciono a opção UNIMED RIO$")
	public void seleciono_a_opção_UNIMED_RIO() throws Throwable {
		guiaMedicoPage.selecionarOpcao();
	}

	@Quando("^eu clico no botão Continuar$")
	public void eu_clico_no_botão_Continuar() throws Throwable {
		guiaMedicoPage.clicarContinuar();
	}

	@Então("^valido a especialidade e a cidade$")
	public void valido_a_especialidade_e_a_cidade() throws Throwable {
		guiaMedicoPage.validacaoEspecialidade();
		guiaMedicoPage.validarCidade();
		driver.close();
	}

	@Então("^valido a não apresentação de médicos de São Paulo nas páginas de um a três$")
	public void valido_a_não_apresentação_de_médicos_de_São_Paulo_nas_páginas_de_um_a_três() throws Throwable {
		guiaMedicoPage.validarPaginaUm();
		guiaMedicoPage.clicarPaginaDois();
		guiaMedicoPage.validarPaginaDois();
		guiaMedicoPage.clicarPaginaTres();
		guiaMedicoPage.validarPaginaTres();
		driver.close();

	}

}

package step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginSeuBarrigaPage;
import page.ContasSeuBarrigaPage;

public class ContasSeuBarrigaStep {
	ContasSeuBarrigaPage telacontas = new ContasSeuBarrigaPage();
	LoginSeuBarrigaPage login = new LoginSeuBarrigaPage();
	
	@Given("que o usuario esteja na tela inicial")
	public void que_o_usuario_esteja_na_tela_inicial() {
		login.acessarSite();
		login.preencherEmail();
		login.preencherSenha();
		login.btnEntrar();
		telacontas.validarTelaInicial();
	
	}

	@When("o usuario clicar na aba contas")
	public void o_usuario_clicar_na_aba_contas() {
		telacontas.clicarAbaContas();
	}

	@Then("sera exibida as opcoes de contas")
	public void sera_exibida_as_opcoes_de_contas() {
		telacontas.validarAbaContas();
	}

	@When("o usuario adicionar uma conta na aba de contas")
	public void o_usuario_adicionar_uma_conta_na_aba_de_contas() {
		telacontas.addContas();
	}

	@Then("sera exibida a mensagem de conta adicionada com sucesso")
	public void sera_exibida_a_mensagem_de_conta_adicionada_com_sucesso() {
		telacontas.validarAddContas();
	}

	@When("o usuario listar uma conta na aba de contas")
	public void o_usuario_listar_uma_conta_na_aba_de_contas() {
		telacontas.listarContas();
	}

	@Then("sera exibida a tela de listagem das contas existentes")
	public void sera_exibida_a_tela_de_listagem_das_contas_existentes() {
		telacontas.validarListarContas();
	}

	@When("o usuario adicionar uma conta com nome ja existente")
	public void o_usuario_adicionar_uma_conta_com_nome_ja_existente() {
		telacontas.addContas();
	}

	@Then("sera exibida uma mensagem de erro")
	public void sera_exibida_uma_mensagem_de_erro() {
		telacontas.validarContaJaAdd();
	}

	@When("o usuario remover uma conta existente na tela de listagem de contas")
	public void o_usuario_remover_uma_conta_existente_na_tela_de_listagem_de_contas() {
		telacontas.listarContas();
		telacontas.excluirContaAdd();
	}

	@Then("sera exibida mensagem de sucesso na exclusao da conta")
	public void sera_exibida_mensagem_de_sucesso_na_exclusao_da_conta() {
		telacontas.validarContaExcluida();
	}

	@When("o usuario editar uma conta existente")
	public void o_usuario_editar_uma_conta_existente() {
		telacontas.listarContas();
		telacontas.editarContaExistente();
	}

	@Then("sera exibida a tela de edicao daquela conta")
	public void sera_exibida_a_tela_de_edicao_daquela_conta() {
		telacontas.validarContaJaAdd();
	}

}


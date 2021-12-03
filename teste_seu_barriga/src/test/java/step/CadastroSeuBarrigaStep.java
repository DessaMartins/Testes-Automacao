package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CadastroSeuBarrigaPage;

public class CadastroSeuBarrigaStep {
	
	CadastroSeuBarrigaPage telacadastro = new CadastroSeuBarrigaPage();

	@Given("que o usuario esteja na tela de cadastro do site")
	public void que_o_usuario_esteja_na_tela_cadastro_do_site() {
		telacadastro.acessarSite();
	}

	@Then("a tela e validada com sucesso")
	public void a_tela_e_validada_com_sucesso() {
		telacadastro.validarTelaCadastro();
	}

	@When("o usuario se cadastrar apos preencher os campos solicitados")
	public void o_usuario_se_cadastrar_apos_preencher_os_campos_solicitados() {
		telacadastro.preencherNome();
		telacadastro.preencherEmail();
		telacadastro.preencherSenhaCorreta();
		telacadastro.clicarCadastrar();
	}

	@Then("sera exibido a mensagem de cadastro inserido com sucesso")
	public void sera_exibido_a_mensagem_de_cadastro_inserido_com_sucesso() {
		telacadastro.validarIconeUsuarioAdicionado();
	}

	@When("o usuario se cadastrar utilizando um email ja usado")
	public void o_usuario_se_cadastrar_utilizando_um_email_ja_usado() {
		telacadastro.cadastrarEmailUtilizado();
	}

	@Then("sera exibida a mensagem de erro de email ja utilizado")
	public void sera_exibida_a_mensagem_de_erro_de_email_ja_utilizado() {
		telacadastro.validarMensagemDeErro();
	}

	@When("o usuario se cadastrar sem preencher o campo de senha")
	public void o_usuario_se_cadastrar_sem_preencher_o_campo_de_senha() {
	}

	@Then("sera exibida a mensagem de erro do campo ser obrigatorio")
	public void sera_exibida_a_mensagem_de_erro_do_campo_ser_obrigatorio() {
	}

}

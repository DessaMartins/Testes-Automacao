package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginSeuBarrigaPage;

public class LoginSeuBarrigaStep {
	
	LoginSeuBarrigaPage telalogin = new LoginSeuBarrigaPage();
	
	@Given("que o usuario esteja na tela de login")
	public void que_o_usuario_esteja_na_tela_de_login() {
	    telalogin.acessarSite();
	}
	
	@Then ("a tela de login e validada com sucesso")
	public void a_tela_de_login_e_validada_com_sucesso() {
		telalogin.validarTelaLogin();
	}

	@When("o usuario entrar com seu email e senha preenchidos corretamente")
	public void o_usuario_entrar_com_seu_email_e_senha_preenchidos_corretamente() {
	    telalogin.preencherEmail();
	    telalogin.preencherSenha();
	    telalogin.btnEntrar();
	}

	@Then("sera exibido a tela inicial do site")
	public void sera_exibido_a_tela_inicial_do_site() {
	    telalogin.validarLogin();
	}

	@When("o usuario entrar com uma senha incorreta")
	public void o_usuario_entrar_com_uma_senha_incorreta() {
	   telalogin.preencherEmail();
	   telalogin.entrarSenhaIncorreta();
	   telalogin.btnEntrar();
	}

	@Then("sera exibida uma mensagem de erro de login")
	public void sera_exibida_uma_mensagem_de_erro_de_login() {
	   telalogin.validarMsgErroSenha();
	}

	@When("o usuaria entrar sem preencher o email")
	public void o_usuaria_entrar_sem_preencher_o_email() {
	    telalogin.preencherSenha();
	    telalogin.btnEntrar();
	}

	@Then("sera exibida uma mensagem de campo obrigatorio")
	public void sera_exibida_uma_mensagem_de_campo_obrigatorio() {
	    telalogin.validarMsgErroEmail();
	}

}

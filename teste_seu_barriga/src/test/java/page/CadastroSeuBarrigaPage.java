package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import map.CadastroSeuBarrigaMap;
import setup.Configur;

	public class CadastroSeuBarrigaPage extends CadastroSeuBarrigaMap {
		static WebDriver driver;
		
		private String nome = "Joana";
		private String email = "joanafernandes@gmail.com";
		private String senha = "123456";
		private String nomeIncorreto = "Joanna";
		private String emailIncorreto = "joanafernandess@gmail.com";
		private String senhaIncorreta = "12345";
		
		
	public CadastroSeuBarrigaPage () {
		PageFactory.initElements(Configur.getDriver(),this);
	}
	
	public void acessarSite() {
		Configur.getDriver().navigate().to("https://seubarriga.wcaquino.me/cadastro");
	}
	
	public void validarTelaCadastro() {
		btnCadastrar.isDisplayed();
	}
	
	public void preencherNome() {
		inputNome.sendKeys(nome);
	}
	
	public void preencherEmail() {
		inputEmail.sendKeys(email);
	}
	
	public void preencherSenhaCorreta() {
		inputSenha.sendKeys(senha);
	}
	
	public void clicarCadastrar() {
		btnCadastrar.click();
	}
	
	public void validarIconeUsuarioAdicionado() {
		iconUsuarioAdicionado.isDisplayed();
	}
	
	public void cadastrarEmailUtilizado() {
		inputNome.sendKeys(nomeIncorreto);
		inputEmail.sendKeys(emailIncorreto);
		inputSenha.sendKeys(senhaIncorreta);
		btnCadastrar.click();
	}
	
	public void validarMensagemDeErro() {
		iconEmailIncorreto.isDisplayed();
	}
}

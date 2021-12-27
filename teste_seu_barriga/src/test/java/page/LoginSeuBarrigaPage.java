package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import map.LoginSeuBarrigaMap;
import setup.Configur;

public class LoginSeuBarrigaPage extends LoginSeuBarrigaMap {
	static WebDriver driver;
	private String email = "joanafernandes12345@gmail.com";
	private String senha = "123456";
	private String senhaincorreta = "12345";
	
	public LoginSeuBarrigaPage () {
		PageFactory.initElements(Configur.getDriver(),this);
	}
	public void acessarSite() {
		Configur.getDriver().navigate().to("https://seubarriga.wcaquino.me/login");
	}
	public void validarTelaLogin() {
		btnEntrarLogin.isDisplayed();
	}
	public void preencherEmail() {
		inputEmailLogin.sendKeys(email);
	}
	public void preencherSenha() {
		inputSenhaLogin.sendKeys(senha);
	}
	public void btnEntrar() {
		btnEntrarLogin.click();
	}
	public void validarLogin() {
		validarPgInicialId.isDisplayed();
	}
	public void entrarSenhaIncorreta() {
		inputSenhaLogin.sendKeys(senhaincorreta);
	}
	public void validarMsgErroSenha() {
		iconSenhaIncorretaLogin.isDisplayed();
	}
	public void entrarSemEmail() {
		inputSenhaLogin.sendKeys(senha);
		btnEntrarLogin.click();
	}
	public void validarMsgErroEmail() {
		iconEmailObrigatorioLogin.isDisplayed();
	}
	
	
	
	
	
	
	
}

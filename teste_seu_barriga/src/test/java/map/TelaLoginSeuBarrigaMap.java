package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaLoginSeuBarrigaMap {
	@FindBy(xpath = "//button[contains(text(),'Entrar')]")
	protected WebElement btnEntrarLogin;
	@FindBy(xpath = "//input[@id='email']")
	protected WebElement inputEmailLogin;
	@FindBy(xpath = "//input[@id='senha']")
	protected WebElement inputSenhaLogin;
	@FindBy(xpath = "//table[@id='tabelaSaldo']")
	protected WebElement validarPgInicial;
	@FindBy(xpath = "//div[contains(text(),'Problemas com o login do usuário')]")
	protected WebElement iconSenhaIncorretaLogin;
	@FindBy(xpath = "//div[contains(text(),'Email é um campo obrigatório')]")
	protected WebElement iconEmailObrigatorioLogin;
	
}

package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSeuBarrigaMap {
	@FindBy(xpath = "//button[contains(text(),'Entrar')]")
	protected WebElement btnEntrarLogin;
	@FindBy(xpath = "//input[@id='email']")
	protected WebElement inputEmailLogin;
	@FindBy(xpath = "//input[@id='senha']")
	protected WebElement inputSenhaLogin;
	@FindBy(id = "tabelaSaldo")
	protected WebElement validarPgInicialId;
	@FindBy(xpath = "(//div)[4]")
	protected WebElement iconSenhaIncorretaLogin;
	@FindBy(xpath = "(//div)[4]")
	protected WebElement iconEmailObrigatorioLogin;
	
}

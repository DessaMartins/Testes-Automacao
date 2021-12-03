package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroSeuBarrigaMap {

	@FindBy(xpath = "(//input)[4]")
	protected WebElement btnCadastrar;
	@FindBy(xpath = "//input[@id='nome']")
	protected WebElement inputNome;
	@FindBy(xpath = "//input[@id='email']")
	protected WebElement inputEmail;
	@FindBy(xpath = "//input[@id='senha']")
	protected WebElement inputSenha;
	@FindBy(xpath = "//div[contains(text(),'Usuário inserido com sucesso')]")
	protected WebElement iconUsuarioAdicionado;
	@FindBy(xpath = "//div[contains(text(),'Endereço de email já utilizado')]")
	protected WebElement iconEmailIncorreto;
}

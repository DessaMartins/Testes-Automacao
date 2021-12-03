package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaContasSeuBarrigaMap {
	
	@FindBy(xpath = "//table[@id='tabelaSaldo']")
	protected WebElement validarPgInicial;
	@FindBy(xpath = "//a[contains(text(),'Contas ')]")
	protected WebElement btnAbaContas;
	@FindBy(xpath = "//a[contains(text(),'Contas ')]/following::ul")
	protected WebElement listaAbaContas;
	@FindBy(xpath = "//a[contains(text(),'Adicionar')]")
	protected WebElement btnAddContas;
	@FindBy(xpath = "//input[@id='nome']")
	protected WebElement inputNomeContas;
	@FindBy(xpath = "//button[contains(text(),'Salvar')]")
	protected WebElement btnSalvarContas;
	@FindBy(xpath = "//div[contains(text(),'Conta adicionada com sucesso!')]")
	protected WebElement iconSucessoContas;
}

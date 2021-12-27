package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CriarMovimentacaoMap {
	
	@FindBy(xpath="//input[@id='interessado']")
	protected WebElement inputInteressadoMovimentacao;
	
	@FindBy(xpath = "(//select[@id='tipo']/descendant::option)[1]")
	protected WebElement selectorTipoReceita;
	
	@FindBy(xpath = "//input[@id=\"data_transacao\"]")
	protected WebElement inputDataMovimentacao;
	
	@FindBy(xpath = "//input[@id=\"data_pagamento\"]")
	protected WebElement inputDataPagamento;
	
	@FindBy(xpath = "//input[@id=\"descricao\"]")
	protected WebElement inputDescricao;
	
	@FindBy(xpath = "//input[@id='valor']")
	protected WebElement inputValor;
	
	@FindBy(xpath = "(//select[@id='conta']/descendant::option)[1]")
	protected WebElement selectorTipoConta;
	
	@FindBy(xpath = "//input[@id='status_pendente']")
	protected WebElement inputPendente;
	
	@FindBy(xpath = "//button[contains(text(),'Salvar')]")
	protected WebElement btnSalvarMovimentacao;
	
	
}



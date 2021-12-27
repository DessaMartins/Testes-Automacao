package page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import map.ContasSeuBarrigaMap;
import setup.Configur;

public class ContasSeuBarrigaPage extends ContasSeuBarrigaMap {
	static WebDriver driver;
	private String nomecontas = "Joana Fernandes";
	private String nomeeditado = "Joana Silva Fernandes";
	
	
	public ContasSeuBarrigaPage () {
		PageFactory.initElements(Configur.getDriver(),this);
	}
	
	public void acessarSite() {
		Configur.getDriver().navigate().to("https://seubarriga.wcaquino.me/login");
	}
	
	public void validarTelaInicial() {
		validarPgInicial.isDisplayed();
	}
	
	public void clicarAbaContas() {
		btnAbaContas.click();
	}
	
	public void validarAbaContas() {
		listaAbaContas.isDisplayed();
	}
	
	public void addContas() {
		btnAbaContas.click();
		listaAbaContas.isDisplayed();
		btnAddContas.click();
		inputNomeContas.sendKeys(nomecontas);
		btnSalvarContas.click();
	}
	
	public void validarAddContas() {
		iconSucessoContas.isDisplayed();
	}
	
	public void validarContaJaAdd() {
		iconContaJaAdd.isDisplayed();
	}
	
	public void listarContas() {
		btnAbaContas.click();
		listaAbaContas.isDisplayed();
		btnListarContas.click();
	}
	
	public void validarListarContas() {
		tabelaContas.isDisplayed();
		assertEquals(nomecontas,nomecontas);
	}
	
	public void excluirContaAdd() {
		excluirConta.click();
	}
	
	public void validarContaExcluida() {
		iconContaJaAdd.isDisplayed();
	}
	
	public void editarContaExistente() {
		editarContas.click();
		inputNomeContas.sendKeys(nomeeditado);
		btnSalvarContas.click();
	}
}

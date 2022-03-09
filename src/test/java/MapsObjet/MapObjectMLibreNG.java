package MapsObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

public class MapObjectMLibreNG extends ClaseBase
{

	public MapObjectMLibreNG(WebDriver driver) {
					
		super(driver);
		this.driver=driver;
					
					
	}
	
	// ELEMENTOS PAGINA INICIAL
	// RUTA BUSCADOR
	protected By txtBusquedaML = By.cssSelector("#cb1-edit");
	// RUTA BOTÓN LUPA
	protected By btnBuscarML = By.xpath("//div[@aria-label='Buscar']");
	//SELECCIONAR MICROFONO
	protected By selecObjeto = By.xpath("//body/main[@id='root-app']/div[1]/div[1]/section[1]/ol[1]/li[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
	// CREAR TU CUENTA
	protected By crearCuentaML = By.xpath("//nav[@id='nav-header-menu']//a[contains(text(),'Crea tu cuenta')]");
	// VALIDAR DATOS
	protected By validarDatosML = By.xpath("//span[@class='andes-button__content']");
	// BTNVALIDAR EMAIL
	protected By btnvalidarEmailML = By.xpath("//span[@class='andes-button__text']");
	// INGRESAR MAIL
	protected By txtIngresarEmailML = By.xpath("//input[@name='email']");
	// BTN INGRESAR MAIL
	protected By btnIngresarEMailML = By.xpath("//span[@class='andes-button__content']");

	protected By CreaCuentas = By.xpath("//div[@class = 'andes-form-control__control']");
	
	
	
	// INGRESAR MAIL
		protected By txtIngresarEmailML1 = By.xpath("//input[@name='email']");
		// BTN INGRESAR MAIL
		protected By btnIngresarEMailML1 = By.xpath("//span[@class='andes-button__content']");
	
	
	
	
	
	
	
  @Test
  public void f() {
  }
}

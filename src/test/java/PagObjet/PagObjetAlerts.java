package PagObjet;

import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import MapsObjet.MapsObjetAlerts;



public class PagObjetAlerts extends MapsObjetAlerts
{
	// CREAR CONSTRUCTOR DE LA CLASE
	public PagObjetAlerts(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
	}
	
	//METODO INICIAL
	public void urlAcceso (String url)
	{
		driver.get(url);
	}
	
	public void busquedaAlert(String casilla,File rutaCarpeta,String generarEvidencia) throws Exception
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,100)");
		
		click(alertsframe, rutaCarpeta,generarEvidencia);
		tiempoEspera(2000);
		
		click(alerts, rutaCarpeta,generarEvidencia);
		tiempoEspera(1000);
		
		click(btnClic1, rutaCarpeta,generarEvidencia);
		driver.switchTo().alert().accept();
		tiempoEspera(1000);
		
		click(btnClic2, rutaCarpeta,generarEvidencia);
		driver.switchTo().alert().dismiss();
		tiempoEspera(6000);
		
		tiempoEspera(500);
		click(btnClic3, rutaCarpeta,generarEvidencia);
		tiempoEspera(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		tiempoEspera(500);
		click(btnClic3, rutaCarpeta,generarEvidencia);
		tiempoEspera(500);
		driver.switchTo().alert().dismiss();
		tiempoEspera(500);
		click(btnClic4, rutaCarpeta,generarEvidencia);
		
		driver.switchTo().alert().sendKeys(casilla);
		alert();
		tiempoEspera(5000);
		
	}

}

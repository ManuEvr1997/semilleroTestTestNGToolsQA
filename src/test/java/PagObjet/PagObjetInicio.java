package PagObjet;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapsObjet.MapsObjetInicio;

public class PagObjetInicio extends MapsObjetInicio {
	public String url2;

	// CREAR CONSTRUCTOR DE LA CLASE
	public PagObjetInicio(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public String getUrl2() {
		return url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

	// METODO INICIAL
	public void urlAcceso() {
		driver.get(url2);
	}

	public void busquedaI(String FirstName, File rutaCarpeta,String generarEvidencia) throws Exception {
		tiempoEspera(2000);
		click(btnregistrar, rutaCarpeta,generarEvidencia);

	}

}

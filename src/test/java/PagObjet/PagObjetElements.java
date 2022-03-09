package PagObjet;

import java.io.File;
import org.openqa.selenium.WebDriver;
import MapsObjet.MapsObjetElements;

public class PagObjetElements extends MapsObjetElements {
	
	public  String url ;	
	
	
	public PagObjetElements(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public void urlAcceso() {
		driver.get(url);
		// busquedaInicial();
	}
	
	

	public void Registro(String FirstName, String LastName, String Email, String Age, String Salary, String Department,
			File rutaCarpeta,String generarEvidencia) throws Exception {
		
		click(btnelements, rutaCarpeta,generarEvidencia);

		click(webtables, rutaCarpeta,generarEvidencia);

		click(add, rutaCarpeta,generarEvidencia);

		sendkey(FirstName, txtFN, rutaCarpeta,generarEvidencia);
		sendkey(LastName, txtLN, rutaCarpeta,generarEvidencia);
		sendkey(Email, txtEmail, rutaCarpeta,generarEvidencia);
		sendkey(Age, txtAge, rutaCarpeta,generarEvidencia);
		sendkey(Salary, txtSalary, rutaCarpeta,generarEvidencia);
		sendkey(Department, txtDepartment, rutaCarpeta,generarEvidencia);

		click(submit, rutaCarpeta,generarEvidencia);
		tiempoEspera(1000);

		click(delete, rutaCarpeta,generarEvidencia);
		tiempoEspera(1000);

	}

}

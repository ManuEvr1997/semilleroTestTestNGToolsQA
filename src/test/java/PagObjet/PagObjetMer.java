package PagObjet;

import java.io.File;

import org.openqa.selenium.WebDriver;
import MapsObjet.MapsObjetMer;

public class PagObjetMer  extends MapsObjetMer{
  
	public PagObjetMer(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void urlAcceso(String url2) 
	{
		driver.get(url2);
		//busquedaInicial();
	}
	
	public void Registro(String FirstName,String LastName,String Phone,String Email,String Address,
			String City,String StateProvince,String PostalCode,String Country,String UserName,String Password,
			String ConfirmPassword,File rutaCarpeta,String generarEvidencia) throws Exception
	{
		
		
		sendkey(FirstName, txtFN, rutaCarpeta,generarEvidencia);
		sendkey(LastName, txtLN, rutaCarpeta,generarEvidencia);
		sendkey(Phone, txtPhone, rutaCarpeta,generarEvidencia);
		sendkey(Email, txtEmail, rutaCarpeta,generarEvidencia);
		sendkey(Address, txtAd, rutaCarpeta,generarEvidencia);
		sendkey(City, txtCity, rutaCarpeta,generarEvidencia);
		sendkey(StateProvince, txtState, rutaCarpeta,generarEvidencia);
		sendkey(PostalCode, txtPC, rutaCarpeta,generarEvidencia);
		sendkey(Country, Pais, rutaCarpeta,generarEvidencia);
		sendkey(UserName, txtUN, rutaCarpeta,generarEvidencia);
		sendkey(Password, txtPswd, rutaCarpeta,generarEvidencia);
		tiempoEspera(1000);
		sendkey(ConfirmPassword, txtCPswd, rutaCarpeta,generarEvidencia);
		
		
	}
	
}

package MapsObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

public class MapsObjetMer extends ClaseBase{
  public MapsObjetMer(WebDriver driver) {
	  super(driver);
		this.driver=driver;
	}
  
  

    protected By txtFN= By.xpath("//input[@name='firstName']");
	protected By txtLN= By.xpath("//input[@name='lastName']");
	protected By txtPhone= By.xpath("//input[@name='phone']");
	protected By txtEmail= By.xpath("//input[@name='userName']");
	protected By txtAd= By.xpath("//input[@name='address1']");
	protected By txtCity= By.xpath("//input[@name='city']");
	protected By txtState= By.xpath("//input[@name='state']");
	protected By txtPC= By.xpath("//input[@name='postalCode']");
	protected By Pais= By.xpath("//select[@name='country']");
	protected By txtUN= By.xpath("//input[@name='email']");
	protected By txtPswd= By.xpath("//input[@name='password']");
	protected By txtCPswd= By.xpath("//input[@name='confirmPassword']");
	protected By enviar= By.xpath("//input[@name='submit']");
  
  
@Test
  public void f() {
  }
}

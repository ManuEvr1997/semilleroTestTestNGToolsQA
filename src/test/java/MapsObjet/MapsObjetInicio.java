package MapsObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

public class MapsObjetInicio extends ClaseBase{
  public MapsObjetInicio(WebDriver driver) {
		
	  super(driver);
		this.driver=driver;
	}
  
  protected By btnregistrar= By.xpath("//a[@href='register.php']");

@Test
  public void f() {
  }
}

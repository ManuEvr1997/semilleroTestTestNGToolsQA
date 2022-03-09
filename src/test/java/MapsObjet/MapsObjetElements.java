package MapsObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.testNG.ClaseBase;

public class MapsObjetElements extends ClaseBase {
	public MapsObjetElements(WebDriver driver) {

		super(driver);
		this.driver = driver;
	}

	protected By btnelements = By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]");
	protected By webtables = By.xpath("//span[contains(text(),'Web Tables')]");
	protected By add = By.xpath("//button[@id='addNewRecordButton']");
	protected By txtFN = By.xpath("//input[@id='firstName']");
	protected By txtLN = By.xpath("//input[@id='lastName']");
	protected By txtEmail = By.xpath("//input[@id='userEmail']");
	protected By txtAge = By.xpath("//input[@id='age']");
	protected By txtSalary = By.xpath("//input[@id='salary']");
	protected By txtDepartment = By.xpath("//input[@id='department']");
	protected By submit = By.xpath("//button[@id='submit']");

	protected By delete = By.xpath("//span[@id='delete-record-2']");

	@Test
	public void f() {
	}
}

package com.testNG;

import org.testng.annotations.Test;
import com.Utilidades.ExcelUtilidades;
import com.Utilidades.GenerarReportePdf;
import com.Utilidades.MyScreenRecorder;
import PagObjet.PagObjectMLibre;
import PagObjet.PagObjetAlerts;
import PagObjet.PagObjetElements;
import PagObjet.PagObjetInicio;
import PagObjet.PagObjetMer;
import PagObjet.PagObjetWidges;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class EjemploTestNG

{
	private WebDriver driver;

	PagObjetElements Guru;
	PagObjetWidges Widgets;
	PagObjetAlerts Alertas;
	PagObjetInicio pagObjetInicio;
	PagObjetMer Mercurio;
	PagObjectMLibre MercaLibre;
	ClaseBase claseBase;
	File rutaCarpeta = null;
	GenerarReportePdf generarReportepdf;

//comentario del primer commit	
	
	@BeforeClass
	@Parameters({ "url", "url2", "url3", "rutaImagenReporte", "rutaOutut" })

	public void beforeClass(@Optional("default") String url, @Optional("default") String url2,
			@Optional("default") String url3, @Optional("default") String rutaImagenReporte,
			@Optional("default") String rutaOutut) {

		driver = ClaseBase.chromeDriverConnection();

		claseBase = new ClaseBase(driver);

		generarReportepdf = new GenerarReportePdf();

		Widgets = new PagObjetWidges(driver);

		Alertas = new PagObjetAlerts(driver);

		Guru = new PagObjetElements(driver);

		pagObjetInicio = new PagObjetInicio(driver);

		Mercurio = new PagObjetMer(driver);

		MercaLibre = new PagObjectMLibre(driver);

		generarReportepdf.setRutaImagen(rutaImagenReporte);

		claseBase.setRutaOutut(rutaOutut);

		Guru.setUrl(url);
		
		pagObjetInicio.setUrl2(url2);
		
		MercaLibre.setUrl3(url3);
		
	}

	// TEST MERCURY TOOLS QA
	@Test(dataProvider = "BusquedaToolsQA")
	public void pruebaToolsQATestNG(String Ejecutar, String Evidencia, String FirstName, String LastName, String Email,
			String Age, String Salary, String Department, String Dia, String casilla, String Hour,
			String generarEvidencia) throws Exception {

		if (Ejecutar.equals("SI")) {

			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			File rutaCarpeta = claseBase.crearCarpeta(nomTest);

			// pagObjetInicio.busquedaI(FirstName, rutaCarpeta);
			Guru.urlAcceso();

			if (generarEvidencia.contains("SI")) {

				rutaCarpeta = claseBase.crearCarpeta(nomTest);

				MyScreenRecorder.startRecording(nomTest, rutaCarpeta);

				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);

				Guru.Registro(FirstName, LastName, Email, Age, Salary, Department, rutaCarpeta, generarEvidencia);

				Widgets.SeleccionarDate(Dia, rutaCarpeta, Hour, generarEvidencia);

				Alertas.busquedaAlert(casilla, rutaCarpeta, generarEvidencia);

				MyScreenRecorder.stopRecording();

				generarReportepdf.cerrarPlantilla();

			} else {

				Guru.Registro(FirstName, LastName, Email, Age, Salary, Department, rutaCarpeta, generarEvidencia);

				Widgets.SeleccionarDate(Dia, rutaCarpeta, Hour, generarEvidencia);

				Alertas.busquedaAlert(casilla, rutaCarpeta, generarEvidencia);
			}
		}
	}

	@DataProvider(name = "BusquedaToolsQA")
	public Object[][] datos() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja1");

		return arreglo;
	}

	@Test(dataProvider = "BusquedaGuru")
	public void pruebaGuruTestNG(String Evidencia1, String FirstName, String LastName, String Phone, String Email,
			String Address, String City, String StateProvince, String PostalCode, String Country, String UserName,
			String Password, String ConfirmPassword, String Ejecutar1, String generarEvidencia) throws Exception {
		if (Ejecutar1.equals("Si")) {

			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			File rutaCarpeta = claseBase.crearCarpeta(nomTest);

			pagObjetInicio.urlAcceso();

			if (generarEvidencia.contains("Si")) {

				rutaCarpeta = claseBase.crearCarpeta(nomTest);

				MyScreenRecorder.startRecording(nomTest, rutaCarpeta);

				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);

				pagObjetInicio.busquedaI(FirstName, rutaCarpeta, generarEvidencia);

				Mercurio.Registro(FirstName, LastName, Phone, Email, Address, City, StateProvince, PostalCode, Country,
						UserName, Password, ConfirmPassword, rutaCarpeta, generarEvidencia);

				MyScreenRecorder.stopRecording();

				generarReportepdf.cerrarPlantilla();
			} else {

				pagObjetInicio.busquedaI(FirstName, rutaCarpeta, generarEvidencia);
				
				Mercurio.Registro(FirstName, LastName, Phone, Email, Address, City, StateProvince, PostalCode, Country,
						UserName, Password, ConfirmPassword, rutaCarpeta, generarEvidencia);

			}
		}
	}

	@DataProvider(name = "BusquedaGuru")
	public Object[][] datos2() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja2");

		return arreglo;
	}

	@Test(dataProvider = "BusquedaMerLibe")
	public void PruebaMLibre(String Producto, String Correo, String Ejecutar2, String Evidencia2,
			String generarEvidencia) throws Exception {

		if (Ejecutar2.equals("Si")) {

			// pagObjetInicio.urlAcceso();

			String nomTest = Thread.currentThread().getStackTrace()[1].getMethodName();

			File rutaCarpeta = claseBase.crearCarpeta(nomTest);
			
			MercaLibre.urlAcceso();

			if (generarEvidencia.contains("Si")) {

				rutaCarpeta = claseBase.crearCarpeta(nomTest);

				MyScreenRecorder.startRecording(nomTest, rutaCarpeta);

				generarReportepdf.crearPlantilla(nomTest, rutaCarpeta);

				MercaLibre.buscarObjeto(Producto, Correo, rutaCarpeta, generarEvidencia);

				MyScreenRecorder.stopRecording();

				generarReportepdf.cerrarPlantilla();

			}

			else {

				MercaLibre.buscarObjeto(Producto, Correo, rutaCarpeta, generarEvidencia);

			}
		}
	}

	@DataProvider(name = "BusquedaMerLibe")
	public Object[][] datos3() throws Exception {
		Object[][] arreglo = ExcelUtilidades.getTableArray("./Data/buscar.xlsx", "Hoja3");

		return arreglo;
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}

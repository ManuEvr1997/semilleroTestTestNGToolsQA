package com.Utilidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.testNG.ClaseBase;

public class GenerarReportePdf 
{
	
	static String nombre= "prueba";
	static String fecha;
	static Document documento;
	static FileOutputStream archivo;
	static Paragraph titulo;
	String rutaImagen;
	String hora;
	
	public void setRutaImagen(String rutaImagen) 
	{
		this.rutaImagen = rutaImagen;
	}
	
	public void crearPlantilla(String nomTest,File rutaCarpeta) 
	{
		//INSTANCIAR EL DOCUMENTO
		documento = new Document();
		
		
		hora = ClaseBase.fechaHora(); //H Mayuscula
	
	try 
	{
		//CREAR LA RUTA Y NOMBRE DEL PDF
		archivo = new FileOutputStream(rutaCarpeta+"\\"+"Reporte-"+nomTest+"-"+hora+"pdf");
		PdfWriter.getInstance(documento,archivo);
		
		//INSERT IMAGEN
		//UBICACION
		Image header = Image.getInstance(rutaImagen);
		
		//TAMAÑO IMAGEN
		header.scaleToFit(250,1000);
		header.setAlignment(Chunk.ALIGN_RIGHT);
		
		
		//TITULO DEL PDF 
		titulo = new Paragraph(nomTest);
		titulo.setAlignment(1);
		
		//ABRIR DOCUMENTO
		
		documento.open();
		
		
		//INSERTA LA IMAGEN
		documento.add(header);
		documento.add(titulo);
		documento.add(Chunk.NEWLINE);
		
		
	}
	
	catch(FileNotFoundException e) 
	{
		System.err.println(e.getMessage());
	}
	catch(DocumentException e) 
	{
		System.err.println(e.getMessage());
	}
	
	catch(IOException e) 
	{
		System.err.println("Error al logo de periferia"+e.getMessage());
	}
	
	}
	
	public void crearbody(By locator,String rutaImagen)throws DocumentException,MalformedURLException,IOException 
	{
		
		//OBTENER EL NOMBRE DEL LOCALIZADOR 
		
		String locator1 = locator.toString();
		
		//DAR FORMATO A LA FUENTE
		
		Paragraph parrafo = new Paragraph();
		
		
		//DAR FORMATO A LA FUENTE
		parrafo.setAlignment(Chunk.ALIGN_LEFT);
		parrafo.setFont(FontFactory.getFont("Arial",10,Font.NORMAL));
		parrafo.add("Se realiza accion sobre el elemento " + locator1);
		
		//ADICIONAR MENSAJE AL PDF
		documento.add(parrafo);
		
		//INSERT IMAGEN
		//UBICACION DE LA IMAGEN
		Image imagen = Image.getInstance(rutaImagen);
		
		//TAMAÑO DE LA IMAGEN
		
		imagen.scaleToFit(650,1000);
		imagen.setAlignment(Chunk.ALIGN_LEFT);
		
		documento.add(imagen);
		
		
	}
	
	
	public void cerrarPlantilla() throws DocumentException
	{
		
		
		documento.add(Chunk.NEWLINE);
		
		Paragraph parrafo = new Paragraph();
		
		//DAR FORMATO A LA FUENTE
		parrafo.setAlignment(Chunk.ALIGN_RIGHT);
		parrafo.setFont(FontFactory.getFont("Arial",10,Font.BOLD));
		parrafo.add("Fecha inicio"+hora+"\n");
		
		//ADICIONAR MENSAJE AL PDG
		//documento.add(parrafo);
		
		hora= ClaseBase.fechaHora();
		
		parrafo.add("Fecha Fin" + hora);
		
		documento.add(parrafo);
		documento.close();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
  @Test
  public void f() {
  }
}

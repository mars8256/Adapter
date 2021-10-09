package edu.uspg;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uspg.model.Alumno;
import edu.uspg.model.ListaAlumnos;

@SpringBootApplication
public class AdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterApplication.class, args);
		
		ArrayList<Alumno> listaAlumno = new ArrayList();
		
		Alumno alumno = new Alumno(1,"Carlos","Rubio","crubio@uspg.edu.gt");
		Alumno alumno2 = new Alumno(2,"Estuardo","Itzep","eItzep@uspg.edu.gt");
		
		listaAlumno.add(alumno);
		listaAlumno.add(alumno2);
		
		ListaAlumnos listaAlumnos = new ListaAlumnos();
		
		listaAlumnos.setIdLista(1);
		listaAlumnos.setListaAlumno(listaAlumno);
		
		//objectToXML(alumno);
		listObjectTOXML(listaAlumnos);
		
	}
	
	
	public static void listObjectTOXML(ListaAlumnos listaAlumnos) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ListaAlumnos.class);
			
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			StringWriter sw = new StringWriter();
			
			jaxbMarshaller.marshal(listaAlumnos,sw);
			
			
			
			String xmlData = sw.toString();
			
			System.out.println(xmlData);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void objectToXML(Alumno alumno) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Alumno.class);
			
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			StringWriter sw = new StringWriter();
			
			jaxbMarshaller.marshal(alumno,sw);
			
			
			
			String xmlData = sw.toString();
			
			System.out.println(xmlData);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}

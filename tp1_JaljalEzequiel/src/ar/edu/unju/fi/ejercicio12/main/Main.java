package ar.edu.unju.fi.ejercicio12.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		String nombre;
		Date fecha = null;
		String fechaStr;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		nombre = sc.next();
		System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy): ");
		fechaStr = sc.next();
		try {
			fecha= sdf.parse(fechaStr);
		} catch (ParseException e) {
			System.out.println("Error en la fecha ingresada");
			e.printStackTrace();
		}
		Calendar fechaNac = Calendar.getInstance();
		fechaNac.setTime(fecha);
		
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setFechaNac(fechaNac);
		int edad = persona.calcularEdad(fechaNac);
		String signo = persona.calcularSigno(fechaNac);
		String estacion = persona.calcularEstacion(fechaNac);
		System.out.println("Nombre: "+persona.getNombre());
		int mes = persona.getFechaNac().get(Calendar.MONTH) + 1;
		System.out.println("Fecha nacimiento: "+persona.getFechaNac().get(Calendar.DAY_OF_MONTH)+"/"+mes+"/"+persona.getFechaNac().get(Calendar.YEAR));
		System.out.println("Edad: "+edad);
		System.out.println("Signo del zodiaco: "+signo);
		System.out.println("Estacion: "+estacion);
		sc.close();
	}

}

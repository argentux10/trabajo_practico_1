package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		 //Construccion de un objeto de tipo persona utilizando el constructor por defecto
		Persona persona = new Persona();
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese dni: ");
		int dni= sc.nextInt();
		System.out.println("Ingrese nombre: ");
		String nombre= sc.next();
		System.out.println("Ingrese fecha de nacimiento(yyyy/mm/dd): ");
		String fechaNacTexto= sc.next();
		LocalDate fechaNac= LocalDate.parse(fechaNacTexto);
		
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setFechaNacimiento(fechaNac);
		
		System.out.println(persona.toString());
		
		int edad= persona.calcularEdad(fechaNac);
		
		if(edad>=18) {
			System.out.println("Es mayor de edad, su edad es: "+edad);
		}else {
			System.out.println("No es mayor de edad, su edad es: "+edad);
		}
		//Construccion de un objeto de tipo Persona utilizando el contructor parametrizado completo.

		System.out.println("Ingrese dni: ");
		int dni2= sc.nextInt();
		System.out.println("Ingrese nombre: ");
		String nombre2= sc.next();
		System.out.println("Ingrese fecha de nacimiento(yyyy/mm/dd): ");
		String fechaNacTexto2= sc.next();
		LocalDate fechaNac2= LocalDate.parse(fechaNacTexto2);
		System.out.println("Ingrese provincia: ");
		String provincia= sc.next();
		Persona persona2 = new Persona(dni2, nombre2, fechaNac2, provincia);

		System.out.println(persona2.toString());
		int edad2= persona2.calcularEdad(persona2.getFechaNacimiento());
		
		if(edad2>=18) {
			System.out.println("Es mayor de edad, su edad es: "+edad2);
		}else {
			System.out.println("No es mayor de edad, su edad es: "+edad2);
		}
		
		
		//Construccion de un objeto de tipo Persona utilizando el contructor parametrizado sin la provincia.
		System.out.println("Ingrese dni: ");
		int dni3= sc.nextInt();
		System.out.println("Ingrese nombre: ");
		String nombre3= sc.next();
		System.out.println("Ingrese fecha de nacimiento(yyyy/mm/dd): ");
		String fechaNacTexto3= sc.next();
		LocalDate fechaNac3= LocalDate.parse(fechaNacTexto3);
		
		Persona persona3= new Persona(dni3, nombre3, fechaNac3);
		System.out.println(persona3.toString());
		int edad3= persona3.calcularEdad(persona3.getFechaNacimiento());
		
		if(edad3>=18) {
			System.out.println("Es mayor de edad, su edad es: "+edad3);
		}else {
			System.out.println("No es mayor de edad, su edad es: "+edad3);
		}
		sc.close();
	}

}

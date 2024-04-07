package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		String nombre= sc.next();
		System.out.println("Ingrese legajo: ");
		Integer legajo= sc.nextInt();
		System.out.println("Ingrese sueldo: ");
		double sueldo= sc.nextDouble();
		Empleado empleado = new Empleado(nombre, legajo, sueldo);
		empleado.mostrarDatos();
		empleado.aumentoSalario();
		empleado.mostrarDatos();
		sc.close();	

	}
}

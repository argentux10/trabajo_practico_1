package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		int num= sc.nextInt();
		
		CalculadoraEspecial calcu= new CalculadoraEspecial(num);
		
		System.out.println("La sumatoria del valor ingresado es: "+calcu.calcularSumatoria());
		System.out.println("La productoria del valor ingresado es: "+calcu.calcularProductoria());
		sc.close();
	}

}

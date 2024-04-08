package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=0;
		int diametro;
		boolean ingrEsp;
		do {
			System.out.println("Ingrese diametro de la pizza: ");
			diametro=sc.nextInt();
			System.out.println("Ingrese si tiene ingredientes especiales o no: true=si/false=no");
			ingrEsp=sc.nextBoolean();
			if(i==0) {
				Pizza pizza= new Pizza();
				pizza.setDiametro(diametro);
				pizza.setIngrEsp(ingrEsp);
				pizza.calcularPrecio();
				pizza.calcularArea();
				pizza.mostrarDatos(i);
			}
			if(i==1) {
				Pizza pizza2= new Pizza();
				pizza2.setDiametro(diametro);
				pizza2.setIngrEsp(ingrEsp);
				pizza2.calcularPrecio();
				pizza2.calcularArea();
				pizza2.mostrarDatos(i);
			}
			if(i==2) {
				Pizza pizza3= new Pizza();
				pizza3.setDiametro(diametro);
				pizza3.setIngrEsp(ingrEsp);
				pizza3.calcularPrecio();
				pizza3.calcularArea();
				pizza3.mostrarDatos(i);
			}
			i++;
		}while(i<=2);
		System.out.println("El programa ha finalizado");
		sc.close();
	}

}

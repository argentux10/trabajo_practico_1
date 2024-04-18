package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] enteros = new int[8];
		boolean band;
		for(int i=0; i<enteros.length;i++) {
			band=false;
			do {
				System.out.println("Ingrese un valor entero: ");
				enteros[i]= sc.nextInt();
				if(enteros[i]<0) {
					System.out.println("ERROR, Ingrese un valor entero positivo");
				}else {
					band=true;
				}
			}while(band==false);
		}
		System.out.println("El array ha sido llenado con exito! El array sera mostrado a continuacion");
		for(int i=0; i < enteros.length;i++)
			System.out.println("Posicion: ["+i+"]: "+enteros[i]);
		sc.close();	
	}

}

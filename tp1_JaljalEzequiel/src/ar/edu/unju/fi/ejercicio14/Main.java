package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Ingrese un valor entero entre 3 y 10: ");
			num=sc.nextInt();
		}while(num <3 || num >10);
		
		int[] entero= new int[num];		
		boolean band;
		for(int i=0; i<entero.length;i++) {
			band=false;
			do {
				System.out.println("Ingrese un valor entero: ");
				entero[i]= sc.nextInt();
				if(entero[i]<0) {
					System.out.println("ERROR, Ingrese un valor entero positivo");
				}else {
					band=true;
				}
			}while(band==false);
		}
		System.out.println("El array ha sido llenado con exito! El array sera mostrado a continuacion");
		int sumatoria=0;
		for(int i=0; i < entero.length;i++) {
			System.out.println("Posicion: ["+i+"]: "+entero[i]);
			sumatoria+=entero[i];
		}
		System.out.println("La sumatoria de los elementos dentro del arreglo es: "+sumatoria);
		sc.close();

	}

}

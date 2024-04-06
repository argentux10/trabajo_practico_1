package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, fact=1;
		char rta = 's';
		int control=1;
		Scanner teclado= new Scanner(System.in);
		
		do {
			
			if(control!=1) {
				System.out.println("Desea ingresar otro valor? s/n: ");
				rta= teclado.next().charAt(0);
				Character.toLowerCase(rta);//Transforma el caracter a minuscula para evitar errores en el progroma toUpperCase para mayuscula
			}
			
			control++;//Con esto controlo de que el programa haga que el usuario ingrese almenos 1 valor para calcular el factorial y a partir de ahi recien preguntarle si desea ingresar otro valor
			

			if(rta=='s') {
				do {
					System.out.println("Ingrese valor: ");
					num = teclado.nextInt();
					if(num>10 || num<0) {
						System.out.println("Error, debe ingresar un valor del 0 al 10");
					}
					fact=num;
				}while(num>10 || num < 0);
				
				num=num-1;
				
				while(num!=0) {
					fact=fact*num;
					num--;
				}
				
				System.out.println("El factorial es: "+fact);
			}else {
				System.out.println("El programa ha finalizado");
			}
		}while(rta!='n');
		teclado.close();	
	}
}

package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("Ingrese valor: ");
			num = sc.nextInt();
			if(num<1 || num>9) {
				System.out.println("Debe ingresar un valor entre 1 y 9");
			}
		}while(num<1 || num > 9);
		
		for(int i=0;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}

	}

}

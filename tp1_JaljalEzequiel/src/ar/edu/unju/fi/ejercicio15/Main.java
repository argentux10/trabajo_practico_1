package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Ingrese un valor entero entre 5 y 10: ");
			num=sc.nextInt();
		}while(num <5 || num >10);
		
		String[] str= new String[num];
		for(int i=0; i<str.length;i++) {
			System.out.println("Ingrese nombre: ");
			str[i]= sc.next();
		}
		System.out.println("El array ha sido llenado con exito! El array sera mostrado a continuacion desde la posicion 0");
		for(int i=0; i < str.length;i++) {
			System.out.println("Posicion: ["+i+"]: "+str[i]);
		}
		System.out.println("Se mostrara el arreglo en forma inversa, desde la ultima posicion");
		for(int i=str.length-1; i >= 0;i--) {
			System.out.println("Posicion: ["+i+"]: "+str[i]);
		}
		sc.close();
		
	}

}

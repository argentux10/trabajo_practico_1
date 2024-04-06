package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("Ingrese un valor positivo: ");
			num=sc.nextInt();
			if(num<=0) {
				System.out.println("Ingrese nuevamente");
			}
		}while(num<=0);
		if(num%2==0) {
			System.out.println(num*3);
		}else {
			System.out.println(num*2);
		}
		sc.close();
	}

}

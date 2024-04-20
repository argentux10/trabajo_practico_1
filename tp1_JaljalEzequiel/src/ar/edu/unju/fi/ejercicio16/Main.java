package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] str = new String[5];
		Scanner sc = new Scanner(System.in);
		int i;
		for(i=0;i<str.length;i++) {
			System.out.println("Ingrese nombre: ");
			str[i]=sc.next();
		}
		i=0;
		System.out.println("Los valores almacenados en el array son: ");
		while(i<str.length) {
			System.out.println("Posicion ["+i+"]: "+str[i]);
			i++;
		}
		System.out.println("El tamaño del array es: "+str.length);
		byte borrar;
		do {
			System.out.println("Ingrese indice a eliminar: ");
			borrar=sc.nextByte();
		}while(borrar<0 || borrar >4);
		int aux=borrar;
		if(borrar==4) {
			str[aux]="";
		}else {
			do {
				str[aux]=str[aux+1];
				aux++;
			}while(aux<str.length-1);
			str[4]="";
		}
		System.out.println("El valor en el indice ["+borrar+"] ha sido eliminado con exito, el array quedo de la siguiente manera: ");
		i=0;
		while(i<str.length) {
			System.out.println("Posicion ["+i+"]: "+str[i]);
			i++;
		}
		sc.close();
	}

}

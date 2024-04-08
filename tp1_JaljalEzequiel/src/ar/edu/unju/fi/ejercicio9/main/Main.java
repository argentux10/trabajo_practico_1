package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nombre;
		String codigo;
		float precio;
		int i=0;
		do {
			if(i==0)
				System.out.println("Presione cualquier tecla y luego presione enter");
			sc.nextLine();//Esta fue mi solucion al problema de que en la segunda iteracion el nextLine no me tomaba el nombre del producto y con esto a partir de la segunda iteracion omite esta linea
			System.out.println("Ingrese nombre del producto: ");
			nombre=sc.nextLine();
			System.out.println("Ingrese codigo: ");
			codigo=sc.next();
			System.out.println("Ingrese precio: ");
			precio=sc.nextFloat();
			if(i==0) {
				Producto producto= new Producto(nombre, codigo, precio);
				producto.toString();
				producto.calcularDescuento();
			}else {
				if(i==1) {
					Producto producto2= new Producto(nombre, codigo, precio);
					producto2.toString();
					producto2.calcularDescuento();
				}else {
					Producto producto3= new Producto(nombre, codigo, precio);
					producto3.toString();
					producto3.calcularDescuento();
				}
			}
			i++;
		}while(i<=2);
		System.out.println("El programa ha finalizado");
		sc.close();
	}

}

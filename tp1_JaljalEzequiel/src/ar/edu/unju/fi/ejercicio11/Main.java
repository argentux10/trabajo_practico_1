package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		int numero = 80;
		for (int i=2, j=40;j>0;i++,j--) {
			System.out.println(numero + " ");
			numero+=(j-i-1);
		}
	}

}

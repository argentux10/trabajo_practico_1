package ar.edu.unju.fi.ejercicio17.main;
import ar.edu.unju.fi.ejercicio17.model.Jugador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc=0;
		Scanner sc = new Scanner(System.in);
		List<Jugador> jugador = new ArrayList<>();

		do {
			System.out.println("*****************************************************");
			System.out.println("1) Alta de jugador");
			System.out.println("2) Mostrar los datos del jugador");
			System.out.println("3) Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4) Modificar los datos de un jugador");
			System.out.println("5) Eliminar un jugador");
			System.out.println("6) Mostrar la cantidad total de jugadores");
			System.out.println("7) Mostrar la cantidad de jugadores que pertenezcan a una nacionalidad");
			System.out.println("8) Salir");
			System.out.println("Ingrese una opcion: ");
			try {
				opc = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Valor invalido, ingrese un valor del 1 al 8");
			}
			boolean band = false;
			switch(opc) {
				case 1:	
							System.out.println("*** Alta de jugador ***");
							
							System.out.println("Ingrese nombre: ");
							String nombre = sc.next();
							
							System.out.println("Ingrese apellido: ");
							String apellido = sc.next();

							DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							String fechaStr;
							LocalDate fechaNac=null;
							do {
								System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy): ");
								fechaStr = sc.next();
								try {
									fechaNac = LocalDate.parse(fechaStr, dtf);
								}catch(DateTimeParseException e){
									System.out.println("ERROR, Ingrese nuevamente con el formato adecuado");
									band=true;
								}
								if(band==true) {
									band=false;
								}else {
									band=true;
								}
							}while(band==false);
							
							System.out.println("Ingrese nacionalidad: ");
							String nacionalidad = sc.next();
							
							System.out.println("Ingrese estatura: ");
							double estatura = sc.nextDouble();
							
							System.out.println("Ingrese peso: ");
							int peso = sc.nextInt();
							
							System.out.println("Ingrese posicion (arquero-defensa-medio-delantero): ");
							String posicion = sc.next();
							jugador.add(new Jugador(nombre,apellido,fechaNac,nacionalidad,estatura,peso,posicion));
							System.out.println("El jugador se ha registrado con exito! \n");
							break;
				case 2:	
							System.out.println("*** Mostrar datos de un jugador ***");
							System.out.println("Ingrese nombre del jugador: ");
							nombre = sc.next();
							System.out.println("Ingrese apellido del jugador: ");
							apellido = sc.next();
							band=false;
							for(int i=0; i < jugador.size() && band==false;i++) {
								if(jugador.get(i).getNombre().equals(nombre) && jugador.get(i).getApellido().equals(apellido)) {
									System.out.println(jugador.get(i).toString());
									band=true;
								}
							}
							if(band==false) {
								System.out.println("El jugador no se encuentra registrado \n");
							}else {
								System.out.println();
							}
							break;
				case 3:	
							System.out.println("*** Mostrar datos de los jugadores ordenado por apallido ***");
							jugador.sort(Comparator.comparing(Jugador::getApellido));
							for(Jugador jug:jugador) {
								System.out.println(jug.toString()+"\n");
								
							}
							if(jugador.isEmpty()) {
								System.out.println("No hay jugadores registrados, el array esta vacio \n");
							}else {
								System.out.println();
							}
							break;
				case 4:	
							System.out.println("*** Modificar datos de un jugador ***");
							System.out.println("Ingrese nombre del jugador: ");
							nombre = sc.next();
							System.out.println("Ingrese apellido del jugador: ");
							apellido = sc.next();
							band=false;
							for(int i=0; i < jugador.size() && band==false;i++) {
								if(jugador.get(i).getNombre().equals(nombre) && jugador.get(i).getApellido().equals(apellido)) {
									System.out.println("Modificando los datos del jugador: "+nombre+" "+apellido);
									System.out.println("Ingrese nombre: ");
									nombre = sc.next();
									
									System.out.println("Ingrese apellido: ");
									apellido = sc.next();
									
									dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
									fechaNac=null;
									do {
										System.out.println("Ingrese fecha de nacimiento (dd/mm/yyyy): ");
										fechaStr = sc.next();
										try {
											fechaNac = LocalDate.parse(fechaStr, dtf);
										}catch(DateTimeParseException e){
											System.out.println("ERROR, Ingrese nuevamente con el formato adecuado");
											band=true;
										}
										if(band==true) {
											band=false;
										}else {
											band=true;
										}
									}while(band==false);
									
									System.out.println("Ingrese nacionalidad: ");
									nacionalidad = sc.next();
									
									System.out.println("Ingrese estatura: ");
									estatura = sc.nextDouble();
									
									System.out.println("Ingrese peso: ");
									peso = sc.nextInt();
									
									System.out.println("Ingrese posicion (arquero-defensa-medio-delantero): ");
									posicion = sc.next();
									
									jugador.get(i).setNombre(nombre);
									jugador.get(i).setApellido(apellido);
									jugador.get(i).setFechaNac(fechaNac);
									jugador.get(i).setNacionalidad(nacionalidad);
									jugador.get(i).setEstatura(estatura);
									jugador.get(i).setPeso(peso);
									jugador.get(i).setPosicion(posicion);
									System.out.println("Los datos fueron modificados con exito! \n");
									band=true;
								}
							}
							if(band==false) {
								System.out.println("El jugador no se encuentra registrado \n");
							}else {
								System.out.println();
							}
							break;
				case 5:	
							System.out.println("*** Eliminar un jugador ***");
							System.out.println("Ingrese nombre del jugador: ");
							nombre = sc.next();
							System.out.println("Ingrese apellido del jugador: ");
							apellido = sc.next();
							band=false;
							Iterator<Jugador> iterator = jugador.iterator();
							while(iterator.hasNext()) {
								Jugador j= (Jugador)iterator.next();
								if(j.getNombre().equals(nombre) && j.getApellido().equals(apellido)) {
									iterator.remove();
									System.out.println("El jugador fue removido con exito! ");
									band=true;
								}
							}
							if(band==false) {
								System.out.println("El jugador no se encuentra registrado \n");
							}else {
								System.out.println();
							}
							break;
							
				case 6:	System.out.println("*** Eliminar un jugador ***");
							System.out.println("La cantidad total de jugadores es: "+jugador.size()+"\n");
							break;
				case 7:	
							System.out.println("*** Mostrar jugadores que pertenecen a una nacionalidad ***");
							System.out.println("Ingrese nacionalidad: ");
							nacionalidad = sc.next();
							band=false;
							for(int i=0;i<jugador.size() && band==false;i++) {
								if(jugador.get(i).getNacionalidad().equals(nacionalidad)) {
									System.out.println(jugador.get(i).toString());
									band=true;
								}
							}
							if(band==false) {
								System.out.println("No se registraron jugadores con la nacionalidad "+nacionalidad+"\n");
							}else {
								System.out.println();
							}
							break;
				case 8:	
							System.out.println("El programa ha finalizado");
							break;
			}
		}while(opc!=8);
		sc.close();
	}

}

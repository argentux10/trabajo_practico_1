package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc=0;
		
		String nombreCliente="", nombrePais="", codigoPais;
		double precio=0.00;
		int dias=1, codigoDestinoTuristico=0, aux=0;
		
		List<Pais> pais = new ArrayList<>();
		List<DestinoTuristico> destinoTuristico = new ArrayList<>();
		
		pais.add(new Pais("AAAA1","Argentina"));
		pais.add(new Pais("BBBB2","Dinamarca"));
		pais.add(new Pais("CCCC3","Noruega"));
		pais.add(new Pais("DDDD4","Brasil"));
		pais.add(new Pais("EEEE5","España"));

		do {
			System.out.println("************ Menu Principal ************");
			System.out.println("1) Alta de destino turistico");
			System.out.println("2) Mostrar todos los destinos turisticos");
			System.out.println("3) Modificar el pais de un destino turistico");
			System.out.println("4) Limpiar el ArrayList de destino turisticos");
			System.out.println("5) Eliminar un destino turistico");
			System.out.println("6) Mostrar los destinos turisticos ordenados por nombre");
			System.out.println("7) Mostrar todos los paises");
			System.out.println("8) Mostrar los destino turisticos que pertenecen a un pais");
			System.out.println("9) Salir");
				
			System.out.println("Ingrese opcion: ");
			try {
				opc = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Valor invalido, ingrese un valor del 1 al 9");
			}finally {
				boolean band=false;
					switch(opc) {
						case 1:
								do {
									System.out.println("Ingrese codigo pais: ");
									codigoPais=sc.next();
									for(int i=0;i < pais.size();i++) {
										if(pais.get(i).getCodigo().equals(codigoPais)) {
											nombrePais= pais.get(i).getNombre();
											band=true;
										}
									}
									if(band==false) {
										System.out.println("No existe el codigo");
										band=true;
									}else {
										codigoDestinoTuristico+=1;
										System.out.println("Ingrese nombre del cliente: ");
										nombreCliente=sc.next();
										System.out.println("Ingrese precio por dia del destino: ");
										precio=sc.nextDouble();
										System.out.println("Ingrese duracion del viaje (dias): ");
										dias=sc.nextInt();
										precio*=dias;
										destinoTuristico.add(new DestinoTuristico(codigoDestinoTuristico, nombreCliente, precio, new Pais(codigoPais, nombrePais), dias));
										System.out.println("Se realizo la carga con exito!");
									}
								}while(band==false);
								break;
						case 2:
								System.out.println("Mostrar destinos turisticos");
								if(codigoDestinoTuristico>=1) {
									for(DestinoTuristico destT: destinoTuristico) {
										System.out.println(destT.toString());
									}
								}else {
									System.out.println("No se han cargado destinos turisticos");
								}
								break;
						case 3:
								if(codigoDestinoTuristico>=1) {
									System.out.println("Modificar pais de un destino turistico");
									System.out.println("Ingrese codigo del destino turistico: ");
									aux = sc.nextInt();
									for(int i=0;i < destinoTuristico.size();i++) {
										if(destinoTuristico.get(i).getCodigo() == aux) {
											System.out.println("Ingrese pais: ");
											nombrePais=sc.next();
											destinoTuristico.get(i).setPais(new Pais(nombrePais));
											System.out.println("Se ha modificado con exito el pais del destino turistico");
											band=true;
										}
									}
									if(band==false) {
										System.out.println("El codigo ingresado no existe");
									}
								}else {
									System.out.println("No se han cargado destinos turisticos");
								}
								break;
						case 4:
								if(codigoDestinoTuristico>=1) {
									System.out.println("Limpiando ArrayList de destino turistico");
									destinoTuristico.clear();
									System.out.println("Se ha limpiado con exito");
									codigoDestinoTuristico=0;
								}else {
									System.out.println("El array ya esta limpio, no contiene elementos");
								}
								break;
						case 5:
								if(codigoDestinoTuristico>=1) {
									System.out.println("Eliminar un destino turistico");
									System.out.println("Ingrese codigo del destino turistico: ");
									aux=sc.nextInt();
									Iterator<DestinoTuristico> iterator = destinoTuristico.iterator();
									while(iterator.hasNext()) {
										DestinoTuristico dt= (DestinoTuristico)iterator.next();
										if(dt.getCodigo() == aux) {
											iterator.remove();
											System.out.println("El destino turistico fue removido con exito! ");
										}
									}
								}else {
									System.out.println("No se han cargado destinos turisticos");
								}
								break;
						case 6:
								if(codigoDestinoTuristico>=1) {
									System.out.println("Ordenando los destinos turisticos por nombre del cliente");
									destinoTuristico.sort(Comparator.comparing(DestinoTuristico::getNombre));
									System.out.println("Ordenado con exito!");
									for(DestinoTuristico destT: destinoTuristico) {
										System.out.println(destT.toString());
									}
								}else {
									System.out.println("No se han cargado destinos turisticos");
								}
								break;
						case 7:
								if(codigoDestinoTuristico>=1) {
									System.out.println("Mostrando todos los paises de los destinos turisticos");
									for(DestinoTuristico destT: destinoTuristico) {
										System.out.println(destT.getPais().getNombre());
									}
								}else {
									System.out.println("No se han cargado destinos turisticos");
								}
								break;
						case 8:
								if(codigoDestinoTuristico>=1) {
									System.out.println("Ingrese codigo pais: ");
									codigoPais=sc.next();
									for(DestinoTuristico destT: destinoTuristico) {
										if(destT.getPais().getCodigo().equals(codigoPais)) {
											System.out.println(destT.toString());
											band=true;
										}
									}
									if(band==false) {
										System.out.println("No se encontraron destinos registrados con pais ingresado");
									}
								}else {
									System.out.println("No se han cargado destinos turisticos");
								}
								break;
						case 9:
								System.out.println("FIN DEL PROGRAMA");
								break;
					}
			}
		}while(opc!=9);
		sc.close();
	}

}

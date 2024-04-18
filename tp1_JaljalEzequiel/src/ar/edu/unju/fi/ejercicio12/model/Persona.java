package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, Calendar fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int calcularEdad(Calendar fechaNac) {
		Calendar today = Calendar.getInstance();
		int difAnio = today.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
		int difMes = today.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
		int difDia = today.get(Calendar.DAY_OF_WEEK_IN_MONTH) - fechaNac.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		if(difMes < 0 || (difMes == 0 && difDia < 0)) {
			difAnio -= 1; 
		}
		return difAnio;
	}
	
	public String calcularSigno(Calendar fechaNac) {
		int mes = fechaNac.get(Calendar.MONTH);
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		String signoZodiaco="";
		switch(mes) {
		case 0:
				if(dia <= 20) {
					signoZodiaco= "Capricornio";
				}else {
					signoZodiaco= "Acuario";
				}
				break;
		case 1:
				if(dia <= 19) {
					signoZodiaco= "Acuario";
				}else {
					signoZodiaco= "Piscis";
				}
				break;
		case 2: 
				if(dia <= 20) {
					signoZodiaco= "Piscis";
				}else {
					signoZodiaco= "Aries";
				}
				break;
		case 3: 
				if(dia <= 20) {
					signoZodiaco= "Aries";
				}else {
					signoZodiaco= "Tauro";
				}
				break;
		case 4: 
				if(dia <= 20) {
					signoZodiaco= "Tauro";
				}else {
					signoZodiaco= "Geminis";
				}
				break;
		case 5: 
				if(dia <= 20) {
					signoZodiaco= "Geminis";
				}else {
					signoZodiaco= "Cancer";
				}
				break;
		case 6: 
				if(dia <= 22) {
					signoZodiaco= "Cancer";
				}else {
					signoZodiaco= "Leo";
				}
				break;
		case 7: 
				if(dia <= 23) {
					signoZodiaco= "Leo";
				}else {
					signoZodiaco= "Virgo";
				}
				break;
		case 8: 
				if(dia <= 22) {
					signoZodiaco= "Virgo";
				}else {
					signoZodiaco= "Libra";
				}
				break;
		case 9: 
				if(dia <= 23) {
					signoZodiaco= "Libra";
				}else {
					signoZodiaco= "Escorpio";
				}
				break;
		case 10:
				if(dia <= 22 ) {
					signoZodiaco= "Escorpio";
				}else {
					signoZodiaco= "Sagitario";
				}
				break;
		case 11:
				if(dia <= 21) {
					signoZodiaco= "Sagitario";
				}else {
					signoZodiaco= "Capricornio";
				}
				break;
		default:
				System.out.println("Error en la fecha ingresada");
					
		}
		return signoZodiaco;
	}
	
	public String calcularEstacion(Calendar fechaNac) {
		int mes = fechaNac.get(Calendar.MONTH);
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		String estacion="";
		switch(mes) {
		case 0:
				estacion="Verano";
				break;
		case 1:
				estacion="Verano";
				break;
		case 2: 
				if(dia <= 20) {
					estacion= "Verano";
				}else {
					estacion= "Otoño";
				}
				break;
		case 3: 
				estacion="Otoño";
				break;
		case 4: 
				estacion="Otoño";
				break;
		case 5: 
				if(dia <= 20) {
					estacion= "Otoño";
				}else {
					estacion= "Invierno";
				}
				break;
		case 6: 
				estacion= "Invierno";
				break;
		case 7: 
				estacion= "Invierno";
				break;
		case 8: 
				if(dia <= 20) {
					estacion= "Invierno";
				}else {
					estacion= "Primavera";
				}
				break;
		case 9: 
				estacion= "Primavera";
				break;
		case 10:
				estacion= "Primavera";
				break;
		case 11:
				if(dia <= 20) {
					estacion= "Primavera";
				}else {
					estacion= "Verano";
				}
				break;
		default:
				System.out.println("Error en la fecha ingresada");
					
		}
		return estacion;
	} 
	
}

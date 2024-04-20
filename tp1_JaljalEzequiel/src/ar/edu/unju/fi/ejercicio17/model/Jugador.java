package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String nombre;
	private String apellido;
	LocalDate fechaNac;
	private String nacionalidad;
	private double estatura;
	private int peso;
	private String posicion;
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Jugador(String nombre, String apellido, LocalDate fechaNac, String nacionalidad, double estatura, int peso,
			String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	
	
	
	@Override
	public String toString() {
		return "Jugador \n Nombre: " + nombre + "\n Apellido: " + apellido + "\n Fecha de nacimiento: " + fechaNac + "\n Nacionalidad: "
				+ nacionalidad + "\n Eestatura: " + estatura + "m \n Peso: " + peso + "kg \n Posicion: " + posicion;
	}

	public int calcularEdad(LocalDate fechaNac) {
		Period period= Period.between(fechaNac, LocalDate.now());
		return period.getYears();
	}
	
}

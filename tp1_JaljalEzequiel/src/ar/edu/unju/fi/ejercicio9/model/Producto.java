package ar.edu.unju.fi.ejercicio9.model;

import java.util.Random;

public class Producto {
	private String nombre;
	private String codigo;
	private float precio;
	private int descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public Producto(String nombre, String codigo, float precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", descuento=" + descuento
				+ "]";
	}

	public float calcularDescuento() {
		Random aleatorio = new Random();
		this.descuento= aleatorio.nextInt(50-0+1)+0;
		precio-=descuento*precio/100;
		System.out.println("El descuento es del: "+this.descuento+"%"+"\n"+"Precio con el descuento: "+precio);
		return precio;
	}
	
}

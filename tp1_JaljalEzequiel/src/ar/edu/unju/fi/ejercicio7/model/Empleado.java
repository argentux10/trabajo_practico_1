package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private double salario;
	private final double salarioMax=210000.00;
	private final double salarioMin=20000.00;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, Integer legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario>=salarioMin && salario<=salarioMax) {
			this.salario = salario;
		}else {
			if(salario<salarioMin) {
				this.salario= salarioMin;
			}else {
				this.salario=salarioMax;
			}
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario: $"+this.salario);
	}
	
	public void aumentoSalario() {
		final double aumento=10000.00;
		this.salario+=aumento;
		System.out.println("Se la ha aumentado el sueldo");
	}
	
}

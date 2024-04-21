package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private int codigo;
	private String nombre;
	private double precio;
	private Pais pais;
	private int dias;
	
	public DestinoTuristico() {
		// TODO Auto-generated constructor stub
	}

	public DestinoTuristico(int codigo, String nombre, double precio, Pais pais, int dias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.dias = dias;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	@Override
	public String toString() {
		return "Destino Turistico \n Codigo: " + codigo + "\n Nombre: " + nombre + "\n Precio: " + precio + "\n Pais: " + pais.getNombre()
				+ "\n Dias: " + dias + "\n";
	}
	
	
}

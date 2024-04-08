package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private int precio;
	private double area;
	private boolean ingrEsp;
	private final int PIZZAPEQ = 500;
	private final int PIZZAMED = 750;
	private final int PIZZAGRAN = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	

	public Pizza(int diametro, int precio, double area, boolean ingrEsp) {
		super();
		this.diametro = diametro;
		this.precio = precio;
		this.area = area;
		this.ingrEsp = ingrEsp;
	}


	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public boolean isIngrEsp() {
		return ingrEsp;
	}

	public void setIngrEsp(boolean ingrEsp) {
		this.ingrEsp = ingrEsp;
	}
	
	public int calcularPrecio() {
		if(this.diametro<=20 && this.ingrEsp==false) {
			this.precio=4500;
		}
		if(this.diametro<=20 && this.ingrEsp==true) {
			this.precio=4500+this.PIZZAPEQ;
		}
		
		if((this.diametro>20 && this.diametro<=30) && this.ingrEsp==false) {
			this.precio=4800;
		}
		if((this.diametro>20 && this.diametro<=30) && this.ingrEsp==true) {
			this.precio=4800+this.PIZZAMED;
		}
		
		if(this.diametro>30 && this.ingrEsp==false) {
			this.precio=5500;
		}
		if(this.diametro>30 && this.ingrEsp==true) {
			this.precio=5500+this.PIZZAGRAN;
		}
		return this.precio;
	}
	
	public void calcularArea() {
		final double PI=3.141592;
		double radio=this.diametro/2;
		this.area= Math.pow(radio, 2)*PI;
	}
	
	public void mostrarDatos(int i) {
		i+=1;
		System.out.println("*** Pizza "+i+" ***");
		System.out.println("Diametro = "+this.diametro);
		System.out.println("Ingredientes especiales = "+this.ingrEsp);
		System.out.println("Precio Pizza = "+this.precio+"$");
		System.out.println("Area de la pizza = "+this.area);
	}
}

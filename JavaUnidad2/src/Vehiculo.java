
public class Vehiculo {
	String modelo;
	int year;
	double precio;

	
	public Vehiculo(String modelo, int year, double precio) {
		this.modelo = modelo;
		this.year = year;
		this.precio = precio;
		
	}
	
	public void MostrarModelo() {
		System.out.println("El modelo es: " + this.modelo);
	}
	
	public int GetYear() {
		return this.year;
	}
	
	
}

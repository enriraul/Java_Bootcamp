package ClaseConcreta;

public class Coche {
	private String marca;
	private String modelo;
	private int año;
	//int entero, float flotante, double flotante, char 'a', String "hello world" Boolean true/false
	
	//Constructor
	public Coche(String marca, String modelo, int año) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}
	
	public void arrancar() {
		System.out.println("El coche "+  marca + " " + modelo + " está arrancando.");
	}
	
	public void detener() {
		System.out.println("El coche "+  marca + " " + modelo + " se ha detenido.");
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAño() {
		return año;
	}
	
	public void setAño(int año) {
		this.año = año;
	}
	
}




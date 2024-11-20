package ClaseFinal;

public final class Coche {
	private String marca;
	private String modelo;
	
	//Constructor
	public Coche (String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void arrancar() {
		System.out.println("El coche"+ marca + " " + modelo + " está arrancando");
	}
	public void detener() {
		System.out.println("El coche"+ marca + " " + modelo + " se ha detenido");
	}

}

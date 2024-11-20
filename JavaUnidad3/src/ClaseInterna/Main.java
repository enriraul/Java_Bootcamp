package ClaseInterna;

public class Main {
	public static void main(String [] args) {
		Coche coche = new Coche("Toyota");
		
		Coche.Motor motor = coche.new Motor(200);

		motor.mostrarDetalles();
	}
}

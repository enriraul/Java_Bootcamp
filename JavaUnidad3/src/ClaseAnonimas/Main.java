package ClaseAnonimas;

public class Main {
	public static void main(String [] args) {
		Coche coche = new Coche() {

			public void arrancar() {
				System.out.println("El coche está arrancando.");
			}			
			public void detener() {
				System.out.println("El coche se ha detenido.");
			}
		};
		
		coche.arrancar();
		coche.detener();
		
		
		Coche coche1 = new Coche() {

			public void arrancar() {
				System.out.println("El coche está prendido.");
			}			
			public void detener() {
				System.out.println("El coche se ha apagado.");
			}
		};
		coche1.arrancar();
		coche1.detener();
		
		// Clase objeto = new Clase(parámetros){especificar los métodos abstractos};
	}
}

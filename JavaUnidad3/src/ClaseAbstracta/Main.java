package ClaseAbstracta;

public class Main {
	public static void main(String[] args) {
		Perro perro = new Perro("Pulgoso",3);
		Gato gato = new Gato("Michi",6);
		
		gato.hacerSonido();
		perro.hacerSonido();
		gato.dormir();
		perro.dormir();
		
		
	}
}

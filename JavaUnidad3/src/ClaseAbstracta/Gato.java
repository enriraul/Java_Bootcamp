package ClaseAbstracta;

public class Gato extends Animal{
	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}
	
	public void hacerSonido() {
		System.out.println(nombre+" hace miau");
	}
}

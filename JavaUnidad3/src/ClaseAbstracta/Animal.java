package ClaseAbstracta;

abstract class Animal {
	String nombre;
	int edad;
	
	//Constructor
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Método abstracto (sin implementación)

	public abstract void hacerSonido();
	
	//Método concreto (Tiene implementación)
	public void dormir() {
		System.out.println(nombre +" está durmiendo.");
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

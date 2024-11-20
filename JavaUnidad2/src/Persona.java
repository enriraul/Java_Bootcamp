
public class Persona {
	
	String nombre;
	int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String GetNombre() {
		return this.nombre;
	}
	
	public int GetEdad() {
		return this.edad;
	}
}

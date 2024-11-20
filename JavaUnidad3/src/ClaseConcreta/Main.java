package ClaseConcreta;


public class Main{
	public static void main(String [] args) {
		Coche coche = new Coche("Toyota", "Corolla",2020);		
		Coche coche1 = new Coche("Chevrolete", "aveo", 2000);

		coche.arrancar(); 
		System.out.println("La marca es "+ coche.getMarca());
		System.out.println("El modelo es "+ coche.getModelo());
		coche.setMarca("Chevrolet");
		System.out.println("La marca es "+ coche.getMarca());
		coche.detener();
	}
}

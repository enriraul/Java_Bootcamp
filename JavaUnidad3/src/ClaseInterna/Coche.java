package ClaseInterna;

public class Coche {
	private String marca;
	
	//Constructor
	public Coche(String marca) {
		this.marca = marca;
	}
	
	public class Motor{
		private int potencia;
		
		//Constructor de la clase interna Motor
		public Motor(int potencia) {
			this.potencia = potencia;
		}
		
		public void mostrarDetalles() {
			System.out.println("Marca del coche "+marca); 
			//Clase interna accede a la variable de la clase externa
			System.out.println("Potencia del motor: "+potencia+" CV");
		}
		
	}
	/*
	public class TipoVehiculo{
		
		private String TipoCarro;
		
		public TipoVehiculo(String TipoCarro) {
			this.TipoCarro = TipoCarro;
		}
		
	}*/
}

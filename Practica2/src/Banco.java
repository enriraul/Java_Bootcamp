
public class Banco extends Usuario{
/*

i) Crear una clase Banco que herede los atributos de la clase Usuario

ii) Crear un constructor que tenga los siguientes atributos:

1) ID del usuario
2) Monto ingresado al Banco
3) Tipo de préstamo, las opciones son las siguientes 
(puede ser más de una):

a) Préstamo de efectivo
b) Préstamo hipotecario
c) Préstamo vehicular

4) Crear un método get para cada uno de los atributos, 
que permita mostrar la información del usuario.
5) En el caso del tipo de préstamo implementar diferentes 
métodos que lleven el mismo nombre (sobrecarga de métodos) 
que nos muestre el tipo de préstamo y el monto de la deuda.
 */
	private int ID;
	private double Monto;
	private int TipoPrestamo;  
	//0: Prestamos efectivo,
	//1: Prestamo hipotecario  
	//2: Prestamo vehicular 
	public Banco(int ID, double Monto, int TipoPrestamo,
			String NombreUsuario, String ApellidoPaterno,
			String ApellidoMaterno , String DNI, int Edad,
			String NumeroTelefono , double MontoDinero) {
		
		super(NombreUsuario,ApellidoPaterno,ApellidoMaterno,
				DNI, Edad, NumeroTelefono,MontoDinero);
		
		this.ID = ID;
		this.Monto= Monto;
		this.TipoPrestamo = TipoPrestamo;
	}
	
	public int getID() {
		return ID;
	}
	
	//Sobrecarga de métodos 
	public void getPrestamo(  ) {
		System.out.println("El prestamo es de tipo:" + "El monto en deuda es de :");
	}
	
	
}

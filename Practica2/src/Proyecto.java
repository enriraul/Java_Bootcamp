import java.util.ArrayList;
import java.util.Scanner;

public class Proyecto {
	
	
	public static void main(String[] args) {
		String NombreUsuario;
		String ApellidoPaterno;
		String ApellidoMaterno;
		String DNI;
		int Edad;
		String NumeroTelefono;
		double MontoDinero;
		int ID;
		double Monto;
		int TipoPrestamo;
		int seleccion;
		ArrayList<Usuario> usuarios= new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("1.- Insertar un usuario\n2.-Pagar\n 3.-Salir");
			seleccion = scanner.nextInt();
			
			if (seleccion == 1) {
				System.out.println("Seleccionaste ingresar usuario");

			}
			else if (seleccion == 2) {
				System.out.println("Seleccionaste realizar pago");

			}
			else if(seleccion ==3) {
				break;
			}
			else {
				System.out.println("Esa seleccion es incorrecta");
			}
		}
	}
	
	
	/*
	 * c)  Crear un archivo en java cuyo nombre sea 
	 * proyecto.java, este archivo tendrá la clase main, 
	 * la cual nos permitirá llamar a las anteriores clases 
	 * descritas y debe cumplir con los siguientes requisitos:
		i) Debe llamar a ambas clases: Usuario y Banco
		ii) Permitirá la inserción de la información 
		de más de un usuario así como también el desplegar 
		la información solicitada.
		iii) Crear un método que permita poder ingresar 
		saldo de un usuario a un préstamo para reducir 
		el monto a la deuda actual.
	 * 
	 * */
	
	
}

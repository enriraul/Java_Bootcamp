
public class Main {
	
	public static void main(String[] args) {
		/*
		Casa miCasa = new Casa();
		miCasa.color = "azul";
		miCasa.numeroDeHabitacion = 5;
		
		miCasa.encenderLuces();
		
		System.out.println("Mi casa es de color "+ miCasa.color);
		System.out.println("Mi casa tiene  "+ miCasa.numeroDeHabitacion + " de habitaciones");
		
		Casa miCasa2 = new Casa();
		miCasa2.color = "verde";
		miCasa2.numeroDeHabitacion = 4;
		System.out.println("Mi casa es de color "+ miCasa2.color);
		System.out.println("Mi casa tiene  "+ miCasa2.numeroDeHabitacion + " de habitaciones");
		*/
		
		//Vehiculo vehiculo = new Vehiculo("Nissan", 2014, 200000.00);
		
		/*
		 * vehiculo.MostrarModelo();
			System.out.println(vehiculo.GetYear());
		*/
		
		//Vehiculo vehiculo1 = new Vehiculo("Ford", 2020, 250000);
		//Vehiculo vehiculo2 = new Vehiculo("Kia", 2025, 300000);
		
		/*
		 * Clase Persona
		 * 
		 * nombre (String), edad (int)
		 * 
		 * Constructor (String nombre, int edad)
		 * 
		 * metodos
		 * 
		 *1.- regrese el valor nombre 
		 *2.- regrese el valor de edad
		 * 
		 * Persona persona = new Persona("Ana", 37);
		 * persona.
		 * */
		
		/*
		Persona persona = new Persona("Ana",37);
		Persona persona2 = new Persona("Antonio",25);
		
		if(persona.GetEdad() > persona2.GetEdad()) {
			System.out.println(persona.GetNombre() + " es mayor que " + persona2.GetNombre());
		}
		int i;
		for (i=0; i<10;i++) {
			System.out.println(persona.GetNombre());
		}
		
		persona.GetNombre();
		*/
		
		String nombre = "Pedro";
		String nombre_2 = "Ana";
		String hola = "Hola mundo";
		String mayusculas = "HOLA MUNDO";
		String nombre3 = "    Alberto";
		/*
		//El tamaño de la cadena
		System.out.println(nombre.length());
		//Nos indica la posición del segmento que estamos buscando
		System.out.println(nombre.indexOf("r"));
		//Podemos comparar dos cadenas
		System.out.println(nombre.equals(nombre));
		//Obtener una subcadena de una cadena
		System.out.println(hola.substring(2, 7));
		
		//hola.substring(4, hola.length()-1);
		//Cambiar de minusculas a mayusculas
		System.out.println(hola.toUpperCase());
		//Cambiar de mayusculas a minusculas
		System.out.println(mayusculas.toLowerCase());
		//Admin, admin, ADMIN, aDMin, 
		//Contains determina si una subcadena está contenida en la cadena
		System.out.println(hola.contains("mundo"));
		//Verifica si la cadena inicia con el segmento indicado
		System.out.println(hola.startsWith("mundo"));
		//Verifica si la cadena termina con el segmento indicado
		System.out.println(hola.startsWith("Hola"));
		System.out.println(nombre3);
		//Elimina espacios en blanco al inicio y también al final.
		System.out.println(nombre3.trim());
		//Reemplaza una cadena por otra
		System.out.println(hola.replace("Hola", "Buenas tardes,"));
		int numero = 25;
		String string_numero = String.valueOf(25);
		System.out.print(numero);
		System.out.println(string_numero);
		
		String numero_cad = "33";
		int numero_cad_int = Integer.parseInt(numero_cad);
		double numero_cad_double = Double.parseDouble(numero_cad);
		float numero_cad_float = Float.parseFloat(numero_cad);
		
		String vacio="";
		//System.out.println(Integer.parseInt(vacio));
		System.out.println(vacio.isEmpty());
		System.out.println("Comprobación: "+(vacio == null));
		String c1 = "Holaaa ";
		String c2 = "mundo";
		String c3 = c1 +c2; //Concatena dos cadenas
		System.out.println(c3);
		
		
		
		//System.out.println(hola.substring(4, hola.length()));
		Casa casa1 = new Casa();
		casa1.color = "azul";
		casa1.numeroDeHabitacion = 4;
		
		
		Casa casa2 = new Casa();
		casa2.color= "verde";
		casa2.numeroDeHabitacion= 6;
		Casa casa3 = new Casa();
		Casa casa4 = new Casa();
		System.out.println(Casa.Mensaje());
		System.out.println(Casa.instancias);
		*/
		
		SeccionStatic seccionStatic = new SeccionStatic();
		SeccionStatic seccionStatic1 = new SeccionStatic();
		SeccionStatic seccionStatic2 = new SeccionStatic();
		
		System.out.println(SeccionStatic.Mensaje());
		System.out.println(SeccionStatic.GetNumeroInstancia());
	}
}

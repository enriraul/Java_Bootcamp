
public class Sesion1 {
	
	public static void main(String[] args) {
		//int edad=10, ;
		//double altura = 1.70;
		//char character = 'a';
		//String cadena = "cadena";
		//Boolean variable = true;
		/*
		System.out.println(variable);
		System.out.print(cadena);
		System.out.println(altura);
		System.out.println(edad);
		System.out.println("Hola mundo");
		*/	
		
		/*
		 *    + - *  /
		 * 
		 * */
		/*
		int numero1, numero2;
		String cad1 = "Hola ", cad2 = "Mundo";
		
		numero1 = 10;
		numero2 = numero1;
		
		double numero3 = 10.0, numero4;
		numero4 = numero3/3;
		
		System.out.println(numero1/3.0);
		System.out.println(numero1+" "+numero2);
		System.out.println(numero3+" "+numero4);
		System.out.println(numero4 + numero1);
		
		System.out.println(numero1+numero2*numero3);
		System.out.println((numero1+numero2)*numero3);
		System.out.println(cad1+cad2);
		
		double n = 12.0;
		int m = 10;
		Boolean b1= true;
		String cad = "199";
		System.out.print(n-m);
		
		
		int a = 10;
		int b = 2;
		System.out.println(a);
		a++;
		System.out.println(a);
		int c = b*a;
		System.out.println(c);
		
		System.out.println(c>a);
		System.out.println(c<a);
		System.out.println(c==a);
		System.out.println(c!=a);
		
		Boolean b1 = true;
		Boolean b2 = false;
		
		System.out.println(b1&&b2); 
		// b1 y b2: Tanto b1 como b2 deben ser verdaderos
		//para obtener la premisa verdadera
		System.out.println(!b1);
		System.out.println( (c>a)&&(b1) );
		*/
		/*
		int a =10;
		int b = 5;
		 
		boolean c = false;
		// || OR
		// && AND
		// ! Negacion del valor boleano
		System.out.println(a*b -2);
		System.out.println((a+b)/2 == a-b);
		System.out.println( c||!c &&  a > b);
		System.out.println(a%b>0 && c);
		*/
		//java.lang libreria base de Java
		/*
		 * Aqui se encuentran todos los tipos 
		 * de datos empleados en java, y algunos
		 * metodos base */
		
		double a = 2.0;
		double operacion;
		operacion = Math.pow(a,2.0);
		//System.out.println(a);
		//System.out.println(operacion);
		operacion = Math.pow(a, (1/3.0));
		//System.out.println(1/3.0);
		//System.out.println(a);
		//System.out.println(operacion);
		operacion = Math.sqrt(a);
		
		double a1 = 4.3;
		//techo 4.6 -> 5
		//piso 4.6 -> 4
		//redondeo 4.6 -> 5 
		//System.out.println(a1);
		//System.out.println(Math.ceil(a1));
		//System.out.println(Math.floor(a1));
		//System.out.println(Math.round(a1));
		
		int a2 = 3;
		int a3 = 5;
		
		//System.out.println(Math.max(a2, a3));
		//System.out.println(Math.min(a2, a3));
		
		//System.out.println(Math.PI); valor de pi
		//System.out.println(Math.E); valor de euler
		
		int S = 100, I =1;
		int randInt = (int)(Math.random()*(S-I) + I);

		/*
		 * 
		 *  random 0-1  0-9  + 1   1-10
		 *  
		 *  2.44531  9.9994 10.993
		 *  2  9  10
		 * */
		
		System.out.println(randInt);
		
		System.out.println(Math.pow(Math.E,2.0));
		
	}	
}

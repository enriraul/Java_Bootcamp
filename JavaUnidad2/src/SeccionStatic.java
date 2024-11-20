
public class SeccionStatic {
	int numeroInstancia;
	public static int instancias = 0;
	
	public SeccionStatic(){
		instancias ++;
	}
	public static int GetNumeroInstancia() {
		return instancias;
	}
	public static String Mensaje() {
		return "Mensaje General";
	}
	
}


public class Usuario {

	//Declaración de atributos
	
	private String NombreUsuario;
	private String ApellidoPaterno;
	private String ApellidoMaterno;
	private String DNI;
	private int Edad;
	private String NumeroTelefono;
	private double MontoDinero;
	
	//Constructor
	
	public Usuario(String NombreUsuario, String ApellidoPaterno,
			String ApellidoMaterno , String DNI, int Edad,
			String NumeroTelefono , double MontoDinero ) {
			
		this.NombreUsuario = NombreUsuario;
		this.ApellidoPaterno = ApellidoPaterno;
		this.ApellidoMaterno = ApellidoMaterno;
		this.DNI = DNI;
		this.Edad = Edad;
		this.NumeroTelefono = NumeroTelefono;
		this.MontoDinero = MontoDinero;
		
	}
	
	public String getNombreUsuario() {
		return NombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.NombreUsuario = nombreUsuario;
	}
	
}

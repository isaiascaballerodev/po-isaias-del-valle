package biblioteca;
public abstract class Persona {
	private int cedula;
	private String nombreapellido;
	private String correo;
	private String telefono;
	//contructor
	public Persona() {
		super();
	}	
	public Persona(int cedula, String nombreapellido, String correo, String telefono) {
		super();
		this.cedula = cedula;
		this.nombreapellido = nombreapellido;
		this.correo = correo; this.telefono = telefono;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombreapellido() {
		return nombreapellido;
	}
	public void setNombreapellido(String nombreapellido) {
		this.nombreapellido = nombreapellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", "
				+ (nombreapellido != null ? "nombreapellido=" + nombreapellido + ", " : "")
				+ (correo != null ? "correo=" + correo + ", " : "") + (telefono != null ? "telefono=" + telefono : "")
				+ "]";
	}
}
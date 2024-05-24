package biblioteca;

public class RevistaCientifica extends Material {
	
private String areaCientifica; 

	
	public RevistaCientifica() {
	super();
}
	
	public RevistaCientifica(int codigo, String autor, String titlo, int anio, String estado, String areaCientifica) {
		super(codigo, autor, titlo, anio, estado);
		this.areaCientifica = areaCientifica;
	}

	public String RevistaCentifica() {
		return areaCientifica;
	}
	public void setAreaCientifica(String areaCientifica) {
		this.areaCientifica = areaCientifica;
	}
	@Override
	public String toString() {
		return "Revistacientifica [" + (areaCientifica != null ? "areaCientifica=" + areaCientifica : "") + "]";
	}
}

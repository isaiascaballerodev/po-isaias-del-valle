package biblioteca;

public abstract class Material {
	private int codigo;
	private String autor;
	private String titlo;
	private int anio;
	private String estado;
	//contructor

    public Material() {
	super();
}
	public Material(int codigo, String autor, String titlo, int anio, String estado) {
		super();
		this.codigo = codigo;
		this.autor = autor;
		this.titlo = titlo;
		this.anio = anio;
		this.estado = estado;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitlo() {
		return titlo;
	}
	public void setTitlo(String titlo) {
		this.titlo = titlo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Material [codigo=" + codigo + ", " + (autor != null ? "autor=" + autor + ", " : "")
				+ (titlo != null ? "titlo=" + titlo + ", " : "") + "anio=" + anio + ", "
				+ (estado != null ? "estado=" + estado : "") + "]";
	}
	
	
}



	


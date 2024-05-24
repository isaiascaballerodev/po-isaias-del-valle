package biblioteca;

public class Libro {
	private String editorial; 

	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return "Libro [" + (editorial != null ? "editorial=" + editorial : "") + "]";
	}
}

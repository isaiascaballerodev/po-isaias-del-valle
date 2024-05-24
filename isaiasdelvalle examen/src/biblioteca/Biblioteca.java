package biblioteca;

public class Biblioteca {
	String nombre, horario;
	int numero_prestamo =0;
	Material []material= null;
	Persona []persona= null;
	Prestamo []prestamo= null;
	
	public Biblioteca() {
		nombre="Superbiblio";
		horario= "LUNES A VIERNES DE 8:00 A 15:00 HORAS";
		material[0]= new Libro(123,"Julio Verne","Viaje Al Interior De La tierra",1970,"Disponible","96325");
		persona [0]= new Alumno(462, "Isaias","0961","isaias@.snpp.edu.py",1000);
		
		prestarMaterial(material[0],persona);
		verMaterialPrestado();
				
	}
	
	private void verMaterialPrestado() {
		System.out.println(prestamo[0].toString());
	
	}
	private void prestarMaterial(Material m, Persona p) {
		
		prestamo[numero_prestamo]= new Prestamo(m,p,"24/05/242","");                                                                                                                                     
		numero_prestamo++;
		
	}
	public static void mian (String[] args) {
		
		new Biblioteca();
	}
	
	
}

package biblioteca;

public class Profesor extends Persona {
private int especialidad;

public Profesor() {
	super();
}




public Profesor(int cedula, String nombreapellido, String correo, String telefono, int especialidad) {
	super(cedula, nombreapellido, correo, telefono);
	this.especialidad = especialidad;
}




public int getEspecialidad() {
	return especialidad;
}

public void setEspecialidad(int especialidad) {
	this.especialidad = especialidad;
}

@Override
public String toString() {
	return "Profesor [especialidad=" + especialidad + "]";
} 

}

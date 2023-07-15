
public class Estudiante {

	public String nombre;
	public String ci;
	public int edad;
	
	
	public Estudiante(){
		this.nombre = null;
		this.ci= null;
		this.edad = 0;
	}
		
	public Estudiante(String nombre , String ci, int edad){
		this.nombre=nombre;
		this.ci=ci;
		this.edad=edad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", ci=" + ci + ", edad=" + edad + "]";
	}
	
	
	
}

package Ejemplo_class_abstract;

public class Docente extends Persona implements Materia{
	
	private int salario;
	public Docente(String nombre,String ci,int salario){
		super(nombre,ci);
		this.salario=salario;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public void asignarMateria( String materia ){
		
	}
	
	
	
	public String toString(){
		return "Nombre : "+this.nombre+" ci "+this.ci+" salario : "+this.salario;
	}
	
}

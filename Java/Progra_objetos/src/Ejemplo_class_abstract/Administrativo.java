package Ejemplo_class_abstract;

public class Administrativo extends Empleado{
	
	private int salario;
	public Administrativo(String nombre, String ci, int Antiguedad,int salario) {
		super(nombre, ci, Antiguedad);
		this.salario=salario;
		  
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public String toString(){
		return "Nombre : "+this.nombre+" CI : "+this.ci+" Antiguedad : "+this.antiguedad+" Salario : "+this.salario;
	}

	
	
}

package Ejemplo_class_abstract;

public abstract class Empleado extends Persona{
	
	protected int antiguedad;
	
	public Empleado(String nombre,String ci,int Antiguedad){
		super(nombre, ci);
		this.antiguedad=Antiguedad;
	}
	

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public abstract String toString();

}

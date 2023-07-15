package Herenciaaaaaa;

public class Empleado extends Persona{

	private int antiguedad;
	
	public Empleado(String nombre , int ci , int antiguedad){
		super(nombre,ci);
		this.antiguedad = antiguedad;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString(){
		return "Nombre : "+nombre+" CI :"+ci+" Antiguedad : "+antiguedad;
	}
	
	
}

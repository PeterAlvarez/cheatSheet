package examen;

public class Persona {
	private String nombre;
	private String ap;
	private String am;

	public Persona( String nombre , String ap , String am ) {
		this.nombre = nombre;
		this.ap = ap;
		this.am = am;
	}
	


	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", ap=" + ap + ", am=" + am + "]";
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp() {
		return ap;
	}

	public void setAp(String ap) {
		this.ap = ap;
	}

	public String getAm() {
		return am;
	}

	public void setAm(String am) {
		this.am = am;
	}
	
	
}

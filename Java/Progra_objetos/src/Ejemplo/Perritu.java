package Ejemplo;

public class Perritu {

	private String nombre, raza;
	private int edad;

	public Perritu(String nombre, String raza, int edad ) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public String setraza() {
		return "De raza " + this.raza;
	}

	public boolean setnombre() {
		if (this.nombre.equals("peki")) {
			return true;
		} else {
			return false;
		}
	}

	public int setedad(){
		return this.edad;
	}
}

package Ejer_2;

public class Persona {

	private String nombre;
	private int edad;
	private String ci;
	private char sexo;
	private double peso;
	private double altura;

	public Persona() {

		this.nombre = "";
		this.edad = 0;
		this.ci="";
		this.sexo = ' ';
		this.peso = 0;
		this.altura = 0;
	}

	public Persona( String nombre, int edad, char sexo ) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona( String nombre, int edad, char sexo, double peso, double altura ) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void setNombre( String nombre ){
		this.nombre=nombre;
	}

	public void setEdad( int edad ) {
		this.edad = edad;
	}

	public void setSexo( char sexo ) {
		this.sexo = sexo;
	}
	public char getSexo(){
		return this.sexo;
	}

	public void setPeso( double peso ) {
		this.peso = peso;
	}

	public void setAltura( double altura ) {
		this.altura = altura;
	}
	
	public double getcalcularIMC() {
		double res = this.peso / ( this.altura * this.altura );
		if( res<20 ){
			return -1;
		}else if( res>=20 || res<=25 ){
			return 0;
		}else{
			return 1;
		}
	}
	
	
	public boolean esMayorDeEdad() {
		if ( this.edad >= 18 ) {
			return true;
		} else {
			return false;
		}
	}

	public boolean comprobarSexo() {
		if ( this.sexo=='M' || this.sexo=='H' ) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "nombre: " + this.nombre + " edad: " + this.edad + " sexo: " + this.sexo + " peso : " + this.peso
				+ " altura: " + this.altura;
	}

}

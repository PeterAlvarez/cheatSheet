package ejer_2;

public class Persona {

	private String nombre;
	private int edad,ci;
	private char sexo;
	private double peso , altura;

	public Persona() {
		this.ci = 0;
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
		this.peso = 0.0;
		this.altura = 0.0;

	}

	public Persona(String nombre, int edad, char sexo) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.ci = 0;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad,  char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ci = 0;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int calcularIMC() {
		int res = 0;
		double p;
		p = (this.peso) / (this.altura * this.altura);
		
		if (p < 20) {
				res = -1;
		} else if (p >= 20 && p <= 25) {
				res = 0;
		} else if (p > 25) {
				res = 1;
		}
		return res;
	}

	public boolean esMayorDeedad() {
		if(this.edad>=18){
			return true;
			
		}else{
			return false;
		}
	}
	
	public boolean comprovarsexo(char sexo1){
		if(sexo1=='F' || sexo1=='M'){
			return false;
		}else{
			return true;
			
		}
	}
	
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", ci=" + ci + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}

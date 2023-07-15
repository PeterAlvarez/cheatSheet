
public class Animal {
	
	public String nombre;
	public String tipo;
	public int edad;
		
	
	//constructor por defecto
	public Animal(){
		this.nombre = null;
		this.tipo = null;
		this.edad = 0;
	}
	//constructoe intanciado=llenar datos
	
	public Animal(String nombre , String tipo , int edad){
		this.nombre=nombre;
		this.tipo=tipo;
		this.edad=edad;
	}

	//source
	@Override
	//muestra datos de la clase  toString
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + "]";
	}
	
}

public class Persona implements Comparable<Persona>	{
	String nombre;
	int edad;
	char sexo;
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
        
	@Override
	 public String toString( ){            
	      return "nombre = "+this.nombre+" edad= "+this.edad+" sexo= "+this.sexo+"\n";
	   }
	   public int compareTo(Persona a){
		   return nombre.compareTo(a.nombre); 
//		   return a.edad - this.edad;	
		
		  
	   }


	


}
//A�ADIR SOPORTE DE COMPARACIONES SECUNDARIAS, EL USO DE COMPARATOR, REALIZAR DOS CRITERIOS DE COMPARACON SECUNDARIAS
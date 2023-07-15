
public class Persona {
String Nombre;
String Apaterno;
String Amaterno;
int edad;
String Fecha;
int telefono;

public Persona(){
	Nombre=null;
	Apaterno=null;
	Amaterno=null;
	edad=0;
	Fecha=null;
	telefono=0;
}
public Persona (String n, String ap, String am, int e, String fe, int te){
	Nombre=n;
	Apaterno=ap;
	Amaterno=am;
	edad=e;
	Fecha=fe;
	telefono=te;
}
public void mostrarPersona(){
	 System.out.println("Datos de la persona:"+Nombre+" "+Apaterno+" "+Amaterno+" "+edad+" "+Fecha+" "+telefono);
}
}

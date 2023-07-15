import java.awt.List;
import java.util.LinkedList;

public class Persona {
    private String Nombre;
    String Apaterno;
    String Amaterno;
    int edad;
    int telefono;
    public LinkedList ListaPersona;

    /*public Persona(){
        Nombre=null;
        Apaterno=null;
        Amaterno=null;
        edad=0;
        telefono=0;
    } */
    public Persona(String n, String ap, String am, int e, int te) {
        Nombre = n;
        Apaterno = ap;
        Amaterno = am;
        edad = e;
        telefono = te;
        ListaPersona = new LinkedList();
    }
    /*public void mostrarPersona(){
         System.out.println("Datos de la persona:"+Nombre+" "+Apaterno+" "+Amaterno+" "+edad+" "+telefono);
    }*/

    public String toString() {
        return this.Nombre + " " + this.Apaterno + " " + this.Amaterno + " " + this.edad " " + this.telefono;
    }

}




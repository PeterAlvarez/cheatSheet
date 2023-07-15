public class Persona {

    String nombre, ap;
    Integer edad;
    Persona antecesor;

    Persona() {
        Persona tecesor = null;
    }

    Persona(String nombre, String ap, Integer edad) {
        this.nombre = nombre;
        this.ap = ap;
        this.edad = edad;
        antecesor = new Persona();
    }

    public void mostrar(Persona persona) {
        if (persona.antecesor != null) {
            mostrar(persona.antecesor);
        }
    }

    public String toString() {
        StringBuffer cont = new StringBuffer("");
        cont.append(nombre);
        cont.append(" ");
        cont.append(ap);
        cont.append(" ");
        cont.append(edad);
        return cont.toString();

    }


}

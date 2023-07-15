import java.util.LinkedList;

public class Familia {


    String Abuelo;
    String Abuela;
    String Padre;
    String Madre;
    String Hijo;
    String Hija;
    String Esposa_del_hijo;
    String Esposo_de_la_hija;
    String Nieto;
    String Nieta;
    public List ListaPersona;


    //constructor por defecto
    public Familia() {
        Abuelo = null;
        Abuela = null;
        Padre = null;
        Madre = null;
        Hijo = null;
        Hija = null;
        Esposa_del_hijo = null;
        Esposo_de_la_hija = null;
        Nieto = null;
        Nieta = null;
        ListaPersona = new LinkedList();
    }


    public Familia(String Abuelo, String Abuela, String Padre, String Madre, String Hijo, String Hija, String Esposa_del_hijo, String Esposo_de_la_hija, String Nieto, String Nieta) {
        this.Abuelo = Abuelo;
        this.Abuela = Abuela;
        this.Padre = Padre;
        this.Hijo = Hijo;
        this.Hija = Hija;
        this.Esposa_del_hijo = Esposa_del_hijo;
        this.Esposo_de_la_hija = Esposo_de_la_hija;
        this.Nieto = Nieto;
        this.Nieta = Nieta;
        ListaPersona = new LinkedList();
    }

    public void setPersona(String p) {
        this.ListaPersona = p;
    }


    public String getPersona() {
        return this.ListaPersona;
    }


    public boolean agregarIntegrantesaFamilia(Persona per) {
        per.setPersona(persona);
        if (!this.ListaPersona.contains(per)) {
            this.ListaPersona.add(per);   //add= agregar
            return true;
        } else
            return false;
    }

    public String toString() {
        return this.Abuela + " " + this.Abuela + " " + this.ListaPersona.toString();
    }
}
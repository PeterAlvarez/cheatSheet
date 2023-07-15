import java.util.ArrayList;
import java.util.List;

public class Familia {

    private Persona abuelo;
    private Persona abuela;
    private Persona padre;
    private Persona madre;
    private Persona hija;
    List integrantes;
    publci Familia(){}

    public  Familia(Persona abuelo, Persona abuela, Persona padre, Persona madre, Persona hija){
        this.abuelo = abuelo;
        this.abuela = abuela;
        this.padre = padre;
        this.madre = madre;
        this.hija = hija;
        integrantes = new ArrayList<Persona>();
        integrantes.add(abuelo);
        integrantes.add(abuela);
        integrantes.add(padre);
        integrantes.add(madre);
        integrantes.add(hija);
    }

    public void agregarIntegrante( Persona integrante){
        integrantes.add(integrante);
    }
    public void agregarIntegrante(Persona i1,Persona i2){
        integrantes.add(i1);
        integrantes.add(i2);
    }




    public String mostrarFamilia(){
        String aux = "";
        for (Object i : integrantes){
            aux += (Persona)i +"\n ";
        }
        return aux;
    }
}

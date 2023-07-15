
import java.util.*;

//import java1.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);


        Persona p1 = new Persona("Mario", "Arenas", "Martinez", 17, 746282982);
        Persona p2 = new Persona("Jose", "Alvarez", "Daza", 64, 2587968);


        Familia Abuelo = new Familia("Abuelo", "Abuela", "Padre", "Madre", "Hijo", "Hija", "Esposa_del_hijo", "Esposo_de_la_hija", "Nieto", "Nieta");

        Abuelo.agregarIntegrantesaFamilia(p1);
        Abuelo.setPersona(" ");

        System.out.println(Abuelo.getPersona());
    }
}

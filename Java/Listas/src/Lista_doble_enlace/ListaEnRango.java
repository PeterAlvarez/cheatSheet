package Lista_doble_enlace;

import java.util.Random;
import java.io.*;
import java.util.Scanner;

//import listaDobleEnlace.*;
class ListaEnRango {
    public static void main(String[] ar) throws IOException {

        int d, x1, x2;
        final int M = 15; // número de elementos de la lista
        final int MX = 999;
        Scanner entrada = new Scanner(System.in);
        ListaDoble listaDb = new ListaDoble();
        Random r = new Random();

        for (int j = 1; j <= M; j++) {
d = r.nextInt(MX) + 1;
        listaDb.insertarCabezaLista(d);
        }

        System.out.println("Elementos de la lista original");
        listaDb.visualizar();

        // rango de valores
        System.out.println("\nRango que va a contener la lista");
        x1 = entrada.nextInt();
        x2 = entrada.nextInt();

        // crea iterador asociado a la lista

        IteradorLista iterador = new IteradorLista(listaDb);

        // recorre la lista con el iterador
        Nodo a = iterador.siguiente();
        while (a != null) {
            int w;
            w = a.getDato();
            if (!(w >= x1 && w <= x2)) // fuera de rango
                listaDb.eliminar(w);
            a = iterador.siguiente();
        }

        System.out.println("Elementos actuales de la lista");
        listaDb.visualizar();

    }
}

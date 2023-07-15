package Lista_Enlazada;

import java.util.Scanner;
public class ListaEnlazadaSimple {
 
    public static void main(String[] args) {

        ListaEnlazada<Integer> lista=new ListaEnlazada<>();
        Scanner S = new Scanner(System.in);
       
        System.out.println(lista.estaVacia());
        System.out.println(lista.toString());
        lista.insertarUltimo(1);
        lista.insertarUltimo(2);
        lista.insertarUltimo(3);
        lista.insertarUltimo(4);
        lista.insertarPrimero(0);
        lista.mostrar();
        lista.quitarPrimero();
        lista.mostrar();
        lista.quitarUltimo();
        lista.quitarUltimo();
        lista.quitarUltimo();
        lista.quitarUltimo();   
        lista.mostrar();
        System.out.println("ultimos "+lista.devolverUltimo());
        System.out.println("primero "+lista.devolverPrimero());
        
        
    }
}
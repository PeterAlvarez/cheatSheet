import java.util.Scanner;//teclado

public class Principal {

    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        Lista lista = new Lista();
        int op, pag;
        String title, autor;

        while (true) {
            System.out.println("1. Insertar libro");
            System.out.println("2. Mostrar Lista");
            System.out.println("3. Buscar Libro");
            System.out.println("4. Salir");

            op = P.nextInt();
            switch (op) {

                case 1:
                    Scanner S = new Scanner(System.in);/// teclado
                    System.out.println("Ingrese nombre del Libro");
                    title = S.nextLine();
                    System.out.println("Ingrese Autor");
                    autor = S.nextLine();
                    System.out.println("Ingrese nro_paginas");
                    pag = S.nextInt();
                    Libro book = new Libro(title, autor, pag);
                    lista.insertarFinal(book);
                    break;

                case 2:
                    System.out.println("Mostrar Libros");
                    lista.visualizar();
                    break;

                case 3:
                    Scanner K = new Scanner(System.in);
                    System.out.println("Ingrese Titulo del libro");
                    title = K.next();
                    Libro aux_lib = new Libro(title);
                    lista.buscarLibro(aux_lib);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}

package Mi_pila;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("tamanio de la pila");
        int max , op , dat;
        max = S.nextInt();
        Pila pila = new Pila(max);

        while(true){
            System.out.println("\n1. Ingresar dato.\n"
                    + "2. Elimindar dato.\n"
                    + "3. Mostrar pila.\n"
                    + "4. Vaciar pila.\n"
                    + "5. Mostrar cantidad de elementos.\n"
                    + "6. Tamanio de la pila.\n"
                    + "7. Salir. \n");
            System.out.println("***Ingrese su opcion***");
            op = S.nextInt();

            switch(op){
                case 1:
                    dat = S.nextInt();
                    pila.insertaDato(dat);
                    break;
                case 2:
                    pila.eliminaDato();
                    break;
                case 3:
                    pila.mostrarPila();
                    break;
                case 4:
                    pila.vaciarPila();
                    break;
                case 5:
                    System.out.println(pila.getCima());
                    break;
                case 6:
                    System.out.println(pila.getMax());
                    break;
                case 7:
                    System.out.println("PROGRAMA FINALIZADO");
                    System.exit(0);
                default:
                    System.out.println("ELIJA UNA OPCION VALIDA!!");
            }
        }
    }
}

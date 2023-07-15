import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public Principal() {
        // TODO Auto-generated constructor stub
    }

    public String[] obtenerLetras(String elementos[]) {

        int longitud = 0;

        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i].matches("[a-zA-Z]")) longitud ++;
        }

        String elementos_letra[] = new String[longitud];
        int posicion = 0;
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i].matches("[a-zA-Z]")) {
                elementos_letra[posicion] = elementos[i];
                posicion++;
            }
        }
        return elementos_letra;
    }

    public String[] obtenerNumeros(String elementos[]) {
        int longitud = 0;
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i].matches("[0-9]")) longitud ++;
        }
        String elementos_numero[] = new String[longitud];
        int posicion = 0;
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i].matches("[0-9]")) {
                elementos_numero[posicion] = elementos[i];
                posicion++;
            }
        }
        return elementos_numero;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);
        Combinatoria combinatoria = new Combinatoria();
        Principal principal = new Principal();
        long m,n,x;

        do{
            System.out.print("Ingrese el valor de m:");
            m = entrada.nextLong();
            System.out.print("Ingrese el valor de n:");
            n = entrada.nextLong();
            if(n >= m)
                System.out.println("El valor de 'n' no puede ser mayor o igual que 'm'");
        }while(n >= m);

        System.out.println("INGRESE LOS ELEMENTOS");

        String elementos[] = new String[(int)m];

        for (int i = 0; i < elementos.length; i++) {
            System.out.print("Elemento "+(i+1)+":");
            elementos[i] = entrada.next();
        }

        do {
            System.out.print("Ingrese el valor de x: ");
            x = entrada.nextLong();
            if(x >= n)
                System.out.println("El valor de 'x' no puede ser mayor o igual que 'n'");
        } while (x >= n);

        String elementos_numero[] = principal.obtenerNumeros(elementos);
        String elementos_letra[] = principal.obtenerLetras(elementos);

        long parte_1 = combinatoria.variacion(elementos_letra.length, x) ;
        long parte_2 = combinatoria.variacionConRepeticion(elementos_numero.length, (n-x)) ;

        long resultado = parte_1 * parte_2;

        System.out.println("Se pueden crear "+resultado+" codigos de usuario");

        combinatoria.generarVariacion(elementos_letra, elementos_letra.length, x, "");
        combinatoria.generarVariacionConRepeticion(elementos_numero, elementos_numero.length, (n-x), "");
        combinatoria.mostrarOrdeamiento();

    }

}

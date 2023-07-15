import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Combinatoria {

    Scanner entrada = new Scanner(System.in);
    Long num = 0L;
    List<String> ordenamiento_letras = new ArrayList<String>();
    List<String> ordenamiento_numeros = new ArrayList<String>();

    public Combinatoria() {
        // TODO Auto-generated constructor stub
        System.out.println("PROGRAMA INICIADO");
    }

    public long factorial(long n){
        if(n==1 || n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    public long potencia(long m, long n){
        if(n==0)
            return 1;
        else
            return m*potencia(m, n-1);
    }

    public long variacion(long m, long n){
        return factorial(m)/factorial(m-n);
    }

    public long variacionConRepeticion(long m, long n){
        return potencia(m,n);
    }


    public void generarVariacion(String elementos[], long m, long n, String cad){
        if(n == 0) {
            /*num++;
              System.out.println(num+".- "+cad);*/
            ordenamiento_letras.add(cad);
        }
        else
            for(int i = 0; i < m; i++){
                if(!cad.contains(elementos[i]))
                    generarVariacion(elementos, m, n-1, cad+elementos[i]+" ");
            }
    }
    public void generarVariacionConRepeticion(String elementos[], long m, long n,String cad){
        if(n == 0) {
            /*num++;
              System.out.println(num+".- "+cad);*/
            ordenamiento_numeros.add(cad);
        }
        else
            for(int i = 0; i < m; i++){
                generarVariacionConRepeticion(elementos, m, n-1, cad+elementos[i]+" ");
            }
    }

    public void mostrarOrdeamiento() {
        for (String letras : ordenamiento_letras) {
            for (String numeros : ordenamiento_numeros) {
                num++;
                System.out.println(num+".- "+letras+numeros);
            }
        }
    }

}

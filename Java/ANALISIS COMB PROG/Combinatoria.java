import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Combinatoria {

    Scanner entrada = new Scanner(System.in);
    Long num = 0L;
    List<String> lista = new ArrayList<String>();

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

    public long permutacion(long n){
        return factorial(n);
    }

    public void permutacionConRepeticion(long n){
        System.out.println("Ingrese la cantidad de elemenentos que se repiten, donde la suma de estos debe ser igual a "+n);
        long suma = 0, elementos_repetidos = entrada.nextInt();
        long res = 1, dato;
        for (int i = 1; i <= elementos_repetidos; i++) {
            System.out.print("Ingrese la cantidad de veces que se repite el elemento "+i+": ");
            dato = entrada.nextLong();
            res = res * factorial(dato);
            suma = suma + dato;
        }
        if(suma == n)
            System.out.println("El resultado de la permutacion con repeticion es: "+(factorial(n)/ res));
        else
            System.out.println("La suma de la cantidad de elementos que se repiten no es igual a "+n);
    }

    public long permutacionCircular(long n){
        return factorial(n-1);
    }

    public long combinacion(long m, long n){
        return factorial(m)/(factorial(n)*factorial(m-n));
    }
    public long combinacionConRepeticion(long m, long n){
        return factorial(m+n-1)/(factorial(n)*factorial(m-1));
    }

    public void generarVariacion(String elementos[], long m, long n, String cad){
        if(n == 0) {
            num++;
            System.out.println(num+".- "+cad);
        }
        else
            for(int i = 0; i < m; i++){
                if(!cad.contains(elementos[i]))
                    generarVariacion(elementos, m, n-1, cad+elementos[i]+" ");
            }
    }

    public void generarVariacionConRepeticion(String elementos[], long m, long n,String cad){
        if(n == 0) {
            num++;
            System.out.println(num+".- "+cad);
        }
        else
            for(int i = 0; i < m; i++){
                generarVariacionConRepeticion(elementos, m, n-1, cad+elementos[i]+" ");
            }
    }

    public void generarPermutacion(String elementos[], long m, long n, String cad){
        if(n == 0) {
            num++;
            System.out.println(num+".- "+cad);
        }
        else
            for(int i = 0; i < m; i++){
                if(!cad.contains(elementos[i]))
                    generarPermutacion(elementos, m, n-1, cad+elementos[i]+" ");
            }
    }


    public void generarPermutacionConRepeticion(String elementos[], long m, long n,String cad, String cad_elementos){
        if(n == 0){
            if(!lista.contains(cad)){
                if(cad_elementos.chars().sum() == cad.chars().sum()) {
                    lista.add(cad);
                    num++;
                    System.out.println(num+".- "+cad);
                }
            }
        }
        else
            for(int i = 0; i < m; i++){
                generarPermutacionConRepeticion(elementos, m, n-1, cad+elementos[i]+" ", cad_elementos);
            }
    }

    public void generarPermutacionCircular(String elementos[], long m, long n, String cad){
        if(n == 0) {
            num++;
            System.out.println(num+".- "+elementos[0]+" "+cad);
        }

        else
            for(int i = 1; i < m; i++){
                if(!cad.contains(elementos[i]))
                    generarPermutacionCircular(elementos, m, n-1, cad+elementos[i]+" ");
            }
    }
    public String ordenarCadena(String cad){
        StringTokenizer tokens = new StringTokenizer(cad, " ");
        String cadena[] = new String[tokens.countTokens()];
        for (int i = 0; i < cadena.length; i++) {
            cadena[i] = tokens.nextToken();
        }
        String aux;
        for (int i = 1; i <= cadena.length; i++) {
            for (int j = 0; j < cadena.length - i; j++) {
                if(cadena[j].compareTo(cadena[j+1]) > 0){
                    aux = cadena[j];
                    cadena[j] = cadena[j+1];
                    cadena[j+1] = aux;
                }
            }
        }
        aux = "";
        for (int i = 0; i < cadena.length; i++) {
            aux = aux + cadena[i]+" ";
        }
        return aux;
    }


    public void generarCombinacion(String elementos[], long m, long n, String cad){
        if(n == 0){
            String cad1 = ordenarCadena(cad);
            if(!lista.contains(cad1)){
                lista.add(cad1);
                num++;
                System.out.println(num+".- "+cad);
            }
        }
        else
            for(int i = 0; i < m; i++){
                if(!cad.contains(elementos[i]))
                    generarCombinacion(elementos, m, n-1, cad+elementos[i]+" ");
            }
    }

    public void generarCombinacionConRepeticion(String elementos[], long m, long n,String cad){
        if(n == 0){
            String cad1 = ordenarCadena(cad);
            if(!lista.contains(cad1)){
                lista.add(cad1);
                num++;
                System.out.println(num+".- "+cad);
            }
        }
        else
            for(int i = 0; i < m; i++){
                generarCombinacionConRepeticion(elementos, m, n-1, cad+elementos[i]+" ");
            }
    }

}

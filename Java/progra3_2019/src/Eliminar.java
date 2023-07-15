import java.util.Scanner;
import java.util.ArrayList;

public class Eliminar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ouput;
        String[] entrada;
        ArrayList<String> aux ;
        int i , j;
        boolean ban;

        while( sc.hasNext() ) {
            entrada = sc.nextLine().split(" ");
            aux = new ArrayList<>();
            ouput="";

            for( i=0 ; i<entrada.length ; i++ ) {
                ban = true;
                for ( j=0 ; j<aux.size() ; j++) {
                    if( aux.get(j).equals(entrada[i]))
                        ban=false;
                }

                if( ban ) {
                    aux.add(entrada[i]);
                    ouput = ouput.concat(entrada[i]+" ");
                }
            }
            System.out.println(ouput.trim());
            aux.clear();
        }
    }
}

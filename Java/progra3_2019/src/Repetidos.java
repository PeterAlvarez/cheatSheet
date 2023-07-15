import java.util.*;

public class Repetidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            Set<String> salida = new HashSet<>();
            String[] input = sc.nextLine().split("");

            for (int i=0 ; i<input.length ; i++) {
                for (int j=0 ; j<input.length ; j++) {
                    if( i!=j && input[i].equals(input[j])){
                        salida.add(input[i]);
                    }
                }
            }
            for ( String s :  salida)
                System.out.print(s);
        }
    }
}
import java.util.Scanner;
public class Paridad{
    public static void main(String[]args) {
        Scanner tec=new Scanner(System.in);
        long tamaño = 0;
        while(tec.hasNext()) {

            for(long i=tamaño ; i>=0 ; i=i+2) {
                tamaño=tec.nextLong();
                if(tamaño%2==0) {

                    System.out.println(tamaño+" par");
                }
                else{

                    System.out.println(tamaño+" impar");
                }
            }
        }
    }
}
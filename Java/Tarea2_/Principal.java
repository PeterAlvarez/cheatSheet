import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Combinatoria combinatoria = new Combinatoria();
        long n , res, m, res1, f;

        System.out.print("Ingrese valor de f: ");
        res = combinatoria.factorial( f=Sc.nextLong() );
        System.out.println( "El factorial de "+ f +" es: "+ res );

        System.out.print("Ingrese el valor de m y n: ");
        res1 = combinatoria.potencia( m=Sc.nextLong() , n=Sc.nextLong() );
        System.out.println( "La potencia de "+ m +" elevado a "+ n +" es: "+ res1 );

        //System.out.println(combinatoria.factorial(10));
        //System.out.println(combinatoria.potencia( 2, 5 ));


        //Para Variacion Simple
        System.out.println("\n** Ingrese (m, n) para Vm,n = m!/(m-n)! donde m>n");
        long vmn = combinatoria.factorial(m=Sc.nextLong())
                    /combinatoria.factorial(m-Sc.nextLong());
        System.out.println("La Variacion simple para m y n es : "+ vmn);

    }
}


//ANALISIS
//Vm,n = m!/(m-n)    n! = nx(n-1)!
//5! = 5x4x3x2x1       5! = 5x4!
//4! = 4x3x2x1         4! = 4x3!
//3! = 3x2x1           3! = 3x2!
//2! = 2x1             2! = 2x1!
//1! = 1               1! = 1
//0! = 1


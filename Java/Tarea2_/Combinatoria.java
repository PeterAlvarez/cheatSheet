
public class Combinatoria {

    public Combinatoria() {

    }

    public long factorial(long n) {
        if( n==0 || n==1 )
            return 1;
        else
            return n * factorial(n-1);
    }

    public long potencia( long m, long n ) {
        if( n==0 )
            return 1;
        else
            return m * potencia( m, n-1 );
    }
}

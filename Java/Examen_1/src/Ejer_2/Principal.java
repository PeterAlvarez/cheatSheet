package Ejer_2;
import java.util.Scanner;
import java.util.LinkedList;
public class Principal {
    public static void main( String[] args ) {

        Scanner in = new Scanner( System.in );

        String nombre = in.nextLine();
        int edad = Integer.parseInt( in.nextLine() );
        char sexo = in.nextLine().charAt( 0 );
        double peso = Double.parseDouble( in.nextLine() );
        double altura = Double.parseDouble( in.nextLine() );

        Persona per1 , per2 , per3;
        per1 = new Persona( nombre , edad , sexo , peso , altura );
        per2 = new Persona( nombre , edad , sexo );
        per3 = new Persona();

        per3.setNombre( nombre );
        per3.setEdad( edad );
        per3.setSexo( sexo );
        per3.setPeso( peso );
        per3.setAltura( altura );

        LinkedList< Persona > personas = new LinkedList<>();

        personas.add( per1 );
        personas.add( per2 );
        personas.add( per3 );

        int i=0;

        for(Persona p : personas){
            i++;
            System.out.println("\npersona "+i);

            edad( p );
            sexo( p );
            peso( p );
            System.out.println( p.toString() );

        }
    in.close();
    }

    public static void edad( Persona p ){
        if( p.esMayorDeEdad() ){
            System.out.println( "mayor de edad" );
        }else{
            System.out.println( "menor de edad" );
        }
    }

    public static void sexo( Persona p ){
        if( p.comprobarSexo() ){
            System.out.println( p.getSexo() );
        }else{
        p.setSexo( 'H' );
        }
    }

    public static void peso( Persona p ){
        if( p.getcalcularIMC()==-1 ){
            System.out.println( "peso ideal" );
        }else if( p.getcalcularIMC()==0 ){
            System.out.println( "debajo de su peso ideal" );
        }else{
            System.out.println( "sobre peso" );
        }
    }
}

package Ejemplo;

public class Principal {
public static void main(String[] args){

		Perritu perro = new Perritu( "Benji", "pequines", 5 );

		if( perro.setnombre() ){
			System.out.println("si es tu perro");
		}else{
			System.out.println("no es tu perro");
		}
		System.out.println(perro.setraza());
		System.out.println(perro.setedad());
	}
}
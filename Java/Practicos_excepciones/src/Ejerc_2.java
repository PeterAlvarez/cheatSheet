import java.util.Scanner;

public class Ejerc_2 {
	public static void main(String[] args){
		boolean correcto=true;
		while( correcto){
			try {
				Scanner S = new Scanner(System.in);
				double a = S.nextDouble();
				double b = S.nextDouble();				

				System.out.println(leer(a,b));
				correcto=false;
			}catch ( exception ex) {
				System.err.println(ex.getMessage());
				
			}catch( Exception exc){ 
	 	 	 	System.err.println ("No cometa errores!"); 
	 	 	}
		}
	}

	public static double leer( double a , double b ) throws exception {
		
		if(b==0){
			throw new exception("vuelva a ingresar datos");
		}
		
		return a/b;
	}

}

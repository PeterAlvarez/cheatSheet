
package NumerosStirling;

import javax.naming.PartialResultException;

public class NumStirlingNoOrdenados {
	public static void main(String[] args) {
		int tMatriz=20;
		long [][]NS = new long [tMatriz][tMatriz];

		String salida="";

//		Minimise un poco el codigo por que vi que se podia hacer la asignacion de 1
//		en el mismo for donde hacemos las operaciones y no use la funcion imprimir
//		para imprimirlo como string y pienso q salio bien
		for( int i=0 ; i<NS.length ; i++ ) {
			for( int j=0 ; j<=i ; j++ ) {
				NS[i][0] = 1; NS[i][i] = 1;
				if( j>0  &&  i!=j ) {
					NS[i][j] = NS[i-1][j-1] + ( NS[i-1][j] * (j+1) ) ;
				}
				salida += String.valueOf(NS[i][j]) + "  ";
			}
			salida +="\n";
		}
		System.out.println(salida);

		int k = 3;
		int n = 2;
		System.out.println("");
		System.out.println(" Cn,k = "+"C("+k+","+ n +") = "+NS[k][n]);

	}
}


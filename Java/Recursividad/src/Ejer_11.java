import java.util.Scanner;

//Programar un algoritmo recursivo que
//permita sumar los elementos de una matriz.

public class Ejer_11 {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	int[][] m = new int[2][2];
	int orden=1;
	int i=0 , j=0 ;
	for( i=0 ; i<2 ; i++ ){
		for( j=0 ; j<2 ; j++ ){
			m[i][j]=S.nextInt();
		}
	}
	
	for( i=0 ; i<2 ; i++ ){
		for( j=0 ; j<2 ; j++ ){
			System.out.print(m[i][j]+" ");
		}
		System.out.println();
	}
	
	S.close();
	System.out.println("tamaños "+i+" "+j+" ");
	System.out.println(suma(i-1,j-1,orden,m));
}


public static int suma (int i, int j, int orden , int mat [] [])
    {
	if (i == 0 && j == 0)
	    return mat [0] [0];
	else
	    if (j < 0)
		return suma (i - 1, orden, orden, mat);
	    else
		return mat [i] [j] + suma (i, j - 1, orden, mat);
    }
	
}



























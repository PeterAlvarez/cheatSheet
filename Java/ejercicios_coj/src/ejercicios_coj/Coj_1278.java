package ejercicios_coj;

	import java.util.Scanner;
	import java.util.Arrays;
	//import java.text.DecimalFormat;
	public class Coj_1278 {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		//DecimalFormat df = new DecimalFormat("0.0"); 
		while(S.hasNext()){
			double[] cad = new double[6];
			double sum=0;
			int aux=0;
			cad[0] = S.nextDouble();
			cad[1] = S.nextDouble();
			cad[2] = S.nextDouble();
			cad[3] = S.nextDouble();
			cad[4] = S.nextDouble();
			cad[5] = S.nextDouble();
			
			Arrays.sort(cad);
			for(int i=1;i<5;i++)
				sum +=cad[i];
			
			if(sum==0) break;
			aux=(int) sum/4;
			
			if(aux==sum/4){
				System.out.println(aux);
			}else{
				System.out.println(sum/4);
			}
		}
		S.close();
	}
	}

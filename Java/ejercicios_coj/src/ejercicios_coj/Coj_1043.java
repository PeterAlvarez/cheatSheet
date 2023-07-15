package ejercicios_coj;

	import java.util.Scanner;
	public class Coj_1043 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int caso=S.nextInt();
		while(caso>0){
			int[] cad = {1 , 2 , 4 , 8 , 16 , 32 , 64  , 128 , 256 , 512 , 1024 , 2048 , 4096 , 8192 , 16384 };
			
			int num = S.nextInt();
			for(int i=14 ; i>=0 ; i-- ){
				if(num-cad[i]>=0){
					num=num-cad[i];
				}else{
					cad[i] = 0;
				}	
			}
			for(int i=0 ; i<=14 ; i++){
				if(cad[i]!=0)
				System.out.print(i+" ");
			}
			System.out.println();
		caso--;	
		}	
		S.close();
	}
	}

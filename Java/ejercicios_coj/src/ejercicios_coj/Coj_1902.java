package ejercicios_coj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.StringTokenizer;
public class Coj_1902 {
public static void main(String[] args) throws Exception{
	
	BufferedReader S = new BufferedReader(new InputStreamReader(System.in));
	
	/*
	System.out.printf("%4d\n",1);  
	System.out.printf("%04d\n",11);  
	*/
	
	int caso =Integer.parseInt(S.readLine());
	
	while( caso-->0 ){
		int con=0;
		
		String fecha=S.readLine();
		
		StringTokenizer cad = new StringTokenizer( fecha );
			
		while(cad.hasMoreTokens()){
		
				con++;
				String x =	cad.nextToken();
					if(con==2){
						StringTokenizer cad2 = new StringTokenizer( x , "/");

						int[] vec=new int[3];
						int i = 0;
						while(cad2.hasMoreTokens()){
							String y=cad2.nextToken();
							vec[i] = Integer.parseInt(y);
							i++;
						}
						System.out.printf("-%04d",vec[2]);
						System.out.printf("-%02d",vec[1]);
						System.out.printf("-%02d",vec[0]);
						
					}else if(con==1){
						int y = Integer.parseInt(x);
						System.out.print(y);
					}else if(con==3 || con==5){
						int y = Integer.parseInt(x);
						System.out.printf("-%04d",y);
					}else{
						int y = Integer.parseInt(x);
						System.out.printf("-%03d",y);
					}
					
			}
			System.out.println();	
	}
	S.close();
}
}



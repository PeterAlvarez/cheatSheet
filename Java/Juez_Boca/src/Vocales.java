import java.util.Scanner;

public class Vocales {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	
	char[] vocal = { 'a' , 'e' , 'i' , 'o' , 'u'};
	
	int f=S.nextInt();
	int c=S.nextInt();
	
	int h=0 , coa=0 , coe=0 ;
	for(int i=0 ; i<f ; i++ ){
		for(int j=0 ; j<c ; j++ ){
			if(h>4) h=0;
			
			System.out.print(vocal[h]+" ");
			
			if(vocal[h]=='a')
				coa++;
			if(vocal[h]=='e')
				coe++;
			h++;

		}
		System.out.println();
	}
	System.out.println("a: "+coa);
	System.out.println("e: "+coe);
	
	S.close();
}
}

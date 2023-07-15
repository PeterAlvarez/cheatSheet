package ejercicios_Uri;

import java.util.Scanner;
public class Uri_1070 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	int num = S.nextInt();
	int con=0;
	for(int i=num;i<=num+11;i++)
		if(con==6)break;
		else if(i%2!=0){
			System.out.println(i);
			con++;
		}
	S.close();
}
}

package ejercicios_coj;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Coj_2633 {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	double res , aux=0 , pi = 3.14159 , r , h ;
	DecimalFormat df = new DecimalFormat("0.000");
	int casos = S.nextInt();
	while(casos>0){
		String cad=S.next();
		if(cad.equals("S")){ //Sphere: V = (4/3)PI*R^3
			r = S.nextDouble();
			res = (4*pi*r*r*r)/3;
	
		}else if(cad.equals("C")){ //Cone: V = (1/3)PI*R^2*H
			r = S.nextDouble();
			h = S.nextDouble();
			res = (pi*r*r*h)/3;

		}else{//Cylinder: V = PI*R^2*H
			r = S.nextDouble();
			h = S.nextDouble();
			res=pi*r*r*h;
	
		}
		
		if(res>aux)
			aux=res;
	
		casos--;
	}
	System.out.println(df.format(aux));
	S.close();	
}
}

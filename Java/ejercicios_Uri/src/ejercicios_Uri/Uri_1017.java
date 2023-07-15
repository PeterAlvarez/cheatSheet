package ejercicios_Uri;

import java.text.DecimalFormat;
import java.util.*;

public class Uri_1017 {
public static void main(String[] args){
	
	Scanner S = new Scanner(System.in);
	

	double  t , d ;
	t = S.nextInt();
	d = S.nextInt();
	DecimalFormat df = new DecimalFormat("0.000");
	
	d *= t;
	
	System.out.println(""+(df.format(d/12)));


}
}

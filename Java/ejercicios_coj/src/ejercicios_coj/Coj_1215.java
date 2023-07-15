package ejercicios_coj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coj_1215 {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
	String cad ;
	List<String> titles;
	Matcher matcher;
	int n=S.nextInt();
	for(int i=1 ; i<=n ; i++){

		cad = S.next();
		
		titles = new ArrayList<String>();
		
		matcher = Pattern.compile("\\(\\*?\\)").matcher( cad );
		
		while(matcher.find()){
		    titles.add(matcher.group(0));
		}
		
		String numero="";
		for( String s : titles  ){
			if(s.contains("*") ){
			numero=numero+"1";	
			}else{
			numero=numero+"0";
			}	
		}
		System.out.println("Case "+i+": "+Integer.parseInt(numero.substring(0, 2), 2)+Integer.parseInt(numero.substring(2, 6), 2)+":"+Integer.parseInt(numero.substring(6, 9), 2)+Integer.parseInt(numero.substring(9, 13), 2)+":"+Integer.parseInt(numero.substring(13, 16), 2)+Integer.parseInt(numero.substring(16, 20), 2));
	}
	}

}

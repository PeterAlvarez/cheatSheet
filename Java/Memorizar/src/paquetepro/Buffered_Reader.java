package paquetepro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffered_Reader {
	public static void main(String[] args)throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(in.readLine());
		String cad2 = in.readLine();
		double cad = Double.parseDouble(in.readLine());
		char car=in.readLine().charAt(0);
		
		System.out.println(num+10);
		System.out.println(cad2+" pario");
		System.out.println(cad+10.5);
		System.out.println(car+"qlp");
	}
}

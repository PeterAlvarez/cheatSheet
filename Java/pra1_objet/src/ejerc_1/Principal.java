package ejerc_1;


import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Router rou1 = new Router("");
		Router rou2 = new Router("");
		System.out.println(rou1.toString());
		System.out.println(rou2.toString());

		
		System.out.println("cambiar ip router 1");
		String ip = in.next();
		rou1.setIp(ip);
		
		System.out.println("ingrese Bytes_in y Bytes_in out router 1");
		int n1=in.nextInt();
		int n2=in.nextInt();
		rou1.setBytes_in(n1);
		rou1.setBytes_out(n2);

		
		System.out.println("cambiar ip router 2");
		ip = in.next();
		rou2.setIp(ip);
		
		System.out.println("ingrese Bytes_in y Bytes_in out router 2");
		n1=in.nextInt();
		n2=in.nextInt();
		rou2.setBytes_in(n1);
		rou2.setBytes_out(n2);

		
		
		
		
		in.close();
		System.out.println("ESTADOS FINALES");
		System.out.println(rou1.toString());
		System.out.println(rou2.toString());

	}
}
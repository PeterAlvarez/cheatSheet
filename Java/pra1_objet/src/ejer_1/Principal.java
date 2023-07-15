package ejer_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
//	private static final LinkedList<Cuenta> Cuentas = null;

	public static void main(String[] args){
		
		Scanner S = new Scanner(System.in);
		LinkedList<Cuenta> cuentas = new LinkedList<Cuenta>();
		Cuenta cuenta = new Cuenta("Jose Luis Navarro",2147.0);
		Cuenta cuenta1= new Cuenta("cinthia fernandez",13337.6);
		Cuenta cuenta2= new Cuenta("Marco Campos",540.80);
		
		cuentas.add(cuenta);
		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		
		menu( S , cuentas);
	}

	public static void menu(Scanner S,LinkedList<Cuenta> c) {
		
		System.out.println( "Ingrese nombre del titular" );
		String titular = S.nextLine() ;
		Cuenta cp = null;
		
		while( cp==null){
			for( Cuenta cx : c ){
				if( cx.getTitular().equals( titular  ) ){
					cp = cx;
					break;
				}
			}
			
			if(cp==null) 
			{
				System.out.println( "no existe la cuenta otro nombre"+"\nIngrese nombre del titular\n" );
				titular = S.nextLine() ;
				
			}
			
			
		}
		
		
		
		if( cp != null ){
			String text = String.format("\n1.- %s de Dinero\n"
					+ "2.- %s de Dinero\n"
					+ "3.- %s\n"
					+ "4.- %s\n", "Retiro", "Deposito","Saldo","Salir");
			//System.out.println( text );
			while ( true ) {
				System.out.println(text);
				int option = S.nextInt();
				if( option == 4 ) break;
				double amount;
				switch (option) {
					case 1:
						amount = S.nextDouble(); 
						cp.retirar(amount);
						break;
					case 2:
						amount = S.nextDouble();
						cp.depositar(amount);
						break;
					case 3:
						System.err.println( cp.getCantidad() );
						break ;
				}
			}
		}
		
		
		
	}
}

import java.util.Scanner;//teclado

public class Principal {

	public static void main(String[] args) {
		Lista lista=new Lista();
		Scanner S = new Scanner(System.in);/// teclado
		int op ,edad ;
		String nom , ci;
		
		while(true){
			System.out.println("1. Ingresse estudiante");
			System.out.println("2. Mostrar Lista");
			System.out.println("3. Visualiza mayores de 20");
			System.out.println("4. calcular promedio");
			System.out.println("5. mostrar al estudiante mayor");
			System.out.println("6. salir");
			
			//mete dato por teclado
			op = S.nextInt();
			switch(op){
			
				case 1:
					System.out.println("ingrese Nombre");
					nom=S.next();
					System.out.println("ingrese ci");
					ci=S.next();
					System.out.println("ingrese edad");
					edad=S.nextInt();
					Estudiante est = new Estudiante(nom,ci,edad);
					lista.insertarCabezaLista(est);
					break;
			
			case 2:
				  System.out.println("mostrar lista");
				  lista.visualizar();
				  break;
			case 3:
				 	System.out.println("existen mayores "+ lista.cantidad());
				 	break;
				
			case 4:
				   System.out.println("calcular promedio"+ lista.promedio ());
					break;
					
			case 5:
	System.out.println("mostrar al estudiante mayor"+lista.estudianteMayor( ));
				 break;
			case 6:
				System.exit(0);
						break;
					
			}	
			
			
		}
		
		
		
	}
}

// Lista lista = new Lista();
// Estudiante est1 = new Estudiante( "carlos" , "25567" , 25 );
// Estudiante est2 = new Estudiante( "daniel" , "255866" , 10 );
// Estudiante est3 = new Estudiante( "daniela" , "56896" , 56 );
// Estudiante est4 = new Estudiante( "jansel" , "25567" , 198 );
//
// Scanner S =new Scanner(System.in);
//
// lista.insertarCabezaLista(est1);
// lista.insertarCabezaLista(est2);
// lista.insertarCabezaLista(est3);
// lista.insertarCabezaLista(est4);
//
// lista.visualizar();

// Scanner S = new Scanner(System.in);
// Lista lista = new Lista();
// int op;
// while (true) {
// System.out.println("1. Ingresar alumno\n"
// + "2. Visualuzar cuantos estudiantes de la lista \n"
// + "3. Calcular el promedio de edad de los estudiantes de la lista\n"
// + "4. Visualizar cuantos estudiantes de la lista tienen mas de 20 años\n"
// + "5. Mostrar el estudiante con mayor edad de la lista\n"
// + "6. Salir\n");
// op = S.nextInt();
// switch (op) {
// case 1:
// System.out.println("Ingrese / nombre / Ci / edad1:\n");
// Estudiante estu1 = new Estudiante( S.next() , S.next() , S.nextInt() );
// lista.insertarCabezaLista(estu1);
// break;
// case 2:
//
//
// System.out.println("La lista de todos los estudiantes es\n");
// lista.visualizar();break;
// case 3:
// System.out.println("el promedio edad es : "+lista.promedio()+"\n");
// break;
// case 4:
//
// System.out.println("Hay "+ lista.cantidad() + " mayores a 20 años\n");
// break;
// case 5:
// System.out.println("El estudiante mayor de la lista es :
// \n"+lista.estudianteMayor());
// break;
// case 6:
// System.exit(0);
//
// }
//
// }
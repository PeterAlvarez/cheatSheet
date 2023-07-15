import java.util.Scanner;
public class Principal {
	public static void main(String[] args){
		Scanner tec=new Scanner(System.in);
		Persona pers1=new Persona();
		pers1=agregarPersona(pers1);
		Familia mifamilia=new Familia();
		int n=tec.nextInt();
		mifamilia.agregarintegrante(pers1, n);
		Persona pers2=new Persona();
		pers2=agregarPersona(pers2);
		int a=tec.nextInt();
		mifamilia.agregarintegrante(pers2,a);
		mifamilia.mostrararbolfamiliar();
		
}
	public static Persona agregarPersona(Persona x){
		Scanner tec=new Scanner(System.in);
		System.out.println("ingrese nombre");
		String n;
		n=tec.next();
		System.out.println("ingrese apellido parteno");
		String ap=tec.next();
		System.out.println("ingrese apellido marteno");
		String am=tec.next();
		System.out.println("ingrese edad");
		int e=tec.nextInt();
		System.out.println("ingrese fecha");
		String fe=tec.next();
		System.out.println("ingrese telefono");
		int te=tec.nextInt();
		x=new Persona(n,ap,am,e,fe,te);
		return x;
	}
	}

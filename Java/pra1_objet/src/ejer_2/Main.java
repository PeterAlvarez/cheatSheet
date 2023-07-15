package ejer_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombre = in.nextLine();
		int edad = Integer.parseInt(in.nextLine());
		char sexo = in.nextLine().charAt(0);
		double peso = Double.parseDouble(in.nextLine());
		double altura = Double.parseDouble(in.nextLine());
		Persona persona1,persona2,p3;
		persona1=new Persona(nombre, edad, sexo, peso, altura);
		persona2=new Persona(nombre, edad, sexo);

		comprobarPeso(persona1);
		comprobarPeso(persona2);

		siEsMayor(persona1);
		siEsMayor(persona2);

		System.out.println(persona1);
		System.out.println(persona2);

        String hola="";
	}

	public static void siEsMayor(Persona p){
		if(p.esMayorDeedad()){
			System.out.println("es mayor de es edad");

		}else{
			System.out.println("no es mayor de edad");
		}

	}

	public static void comprobarPeso(Persona p){
		if(p.calcularIMC()<0)
			System.out.println("Debajo de su Peso Ideal");
		else if( p.calcularIMC()==0)
			System.out.println("Peso Idea");
		else
			System.out.println("SobrePeso");
	}
}


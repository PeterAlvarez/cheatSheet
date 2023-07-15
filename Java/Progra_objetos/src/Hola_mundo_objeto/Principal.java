package Hola_mundo_objeto;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		Oficina oficina = new Oficina(); // creando mi clase de tipo oficina

		System.out.println("1. abrir puerta"); // false abrir
		System.out.println("2. cerrar puerta");// true cerrar
		System.out.println("3. abrir cerrojo");
		System.out.println("4. cerrar cerrojo");
		System.out.println("5. entrar persona");
		System.out.println("6. salir persona");
		System.out.println("7. cerrar programa");

		while (true) {
			int op = S.nextByte();

			switch (op) {
			case 1:
				oficina.setpuerta(false);
				break;
			case 2:
				oficina.setpuerta(true);
				break;
			case 3:
				oficina.setcerrojo(false);
				break;
			case 4:
				oficina.setcerrojo(true);
				break;
			case 5:
				oficina.setpersona(false);
				break;
			case 6:
				oficina.setpersona(true);
				break;
			case 7:
				if (oficina.getpuerta().equals("cerrado") && oficina.getcerrojo().equals("cerrado")
						&& oficina.getpersona().equals("afuera")) {
					System.out.println("PROGRAMA FINALIZADO");
					System.exit(0);

				} else {
					System.out.println("USTED NO PUEDE CERRAR EL PROGRAMA" + "POR QUE PARA FINALIZAR PROGRAMA LA PUERTA"
							+ "DEBE ESTAR CERRADA, EL CERROJO CERRADO Y " + "LA PERSONA DEBE ESTAR FUERA");
					break;
				}
			}
			System.out.println("puerta :" + oficina.getpuerta());
			System.out.println("cerrojo :" + oficina.getcerrojo());
			System.out.println("persona :" + oficina.getpersona());
		}
	}
}

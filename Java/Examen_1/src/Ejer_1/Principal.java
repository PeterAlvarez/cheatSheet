package Ejer_1;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Router rout1 = new Router("");
        Router rout2 = new Router("");
        Router r1 = new Router("");
        System.out.println(rout1.toString());
        System.out.println(rout2.toString());

        LinkedList<Router> routers = new LinkedList<>();

        routers.add(rout1);
        routers.add(rout2);
        System.out.println("hoa");

        int i = 0;
        for (Router r : routers) {
            i++;
            System.out.println("router :" + i);
            System.out.println("cambiar IP :");
            String ip = in.next();
            r.setIp(ip);
            System.out.println("añada bytes_in :");
            int num1 = in.nextInt();
            r.setBytes_in(num1);
            System.out.println("añada byter_out");
            int num2 = in.nextInt();
            r.setBytes_out(num2);
            r.setIn_out(num1, num2);
        }
        in.close();
        System.out.println("DATOS FINALES");
        System.out.println(rout1.toString());
        System.out.println(rout2.toString());
        System.out.println("hola".length());
    }
}

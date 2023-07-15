import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        while (S.hasNext()) {
            int a = S.nextInt();
            int b = S.nextInt();
            int c = S.nextInt();

            if (a == 0 && b == 0 && c == 0)
                break;

            if (a * a == b * b + c * c) {
                System.out.println("bien");
            } else if (b * b == a * a + c * c) {
                System.out.println("bien");
            } else if (c * c == a * a + b * b) {
                System.out.println("bien");
            } else
                System.out.println("mal");

        }
        S.close();
    }

}




import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num = (int) (Math.random() * 500) + 1;
        int c = 0, n;
        boolean band = false;
        System.out.println("--ADIVINA EL NUMERO--");
        do {
            try {

                System.out.println("Ingrese Numero: ");
                c++;
                n = read.nextInt();
                if (n < num) {
                    System.out.println("El numero a adivinar es mas grande!");
                } else if (n > num) {
                    System.out.println("El numero a adivinar es mas chico!");
                } else {
                    System.out.println("EXITO! numero acertado");
                    band = true;
                }
            } catch (InputMismatchException e) {
                /*System.out.println(e.getMessage());
                System.out.println(e.getClass().getSimpleName());*/
                read.next();
                System.out.println("ERROR! tipo incorrecto de dato");

            }
        } while (!band);
        System.out.printf("EL numero era %d y fue encontrado al %d intento \n", num, c - 1);
    }

}

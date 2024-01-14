import java.util.Locale;
import java.util.Scanner;

public class PontoReta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double x = scanner.nextDouble(); double y = scanner.nextDouble();

        double pertenceReta = (2 * x) + y;

        if (pertenceReta == 3) {
            System.out.print("Ponto ("+ x +", " + y +") pertence a reta 2x + y = 3.");
        } else {
            System.out.print("Ponto ("+ x + ", " + y +") nao pertence a reta 2x + y = 3.");
        }

        scanner.close();

    }
}

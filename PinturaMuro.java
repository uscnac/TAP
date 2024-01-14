import java.util.Locale;
import java.util.Scanner;

public class PinturaMuro {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    float m = scan.nextFloat();

    float valor = (36* m) + 100;

    System.out.printf("%.1f", valor);

    scan.close();
    }

}
    
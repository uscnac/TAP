import java.util.Locale;
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();          
        double n3 = scan.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("%.2f", media);

        scan.close();
    }
}

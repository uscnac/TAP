import java.util.Locale;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    double m = scan.nextFloat();

    if(m >= 200){
        double desc = m * 0.05;
        double novo = m - desc;

        System.out.printf("%.2f", novo);
    }
    else{
        System.out.printf("%.2f", m);
    }

    scan.close();
    }
}
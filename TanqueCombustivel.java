import java.util.Locale;
import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    double r = scan.nextFloat();
    double x = scan.nextFloat();
    int opcao = scan.nextInt();

    double pi = Math.PI;
    double raio = (4.0 / 3.0) * pi * Math.pow(r, 3);
    double area = (pi / 3.0) * Math.pow(x, 2)* (3 * r - x) ;

    double combus = raio - area;

    if(opcao == 1){

        System.out.printf("%.4f", area);
    }
    else if (opcao == 2){


        System.out.printf("%.4f", combus);
    }

    scan.close();
    }
}
import java.util.Locale;
import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    double n = scan.nextInt();

    double pi = Math.PI;

    double a = pi * Math.pow(n,2);
    double v = (4.0 / 3.0) * pi * Math.pow(n,3);

    System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\nUma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", n, a, n ,v);

    scan.close();
    }
}


























import java.util.Locale;
import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double v = scanner.nextDouble(); double a = scanner.nextDouble(); double d = scanner.nextDouble();
        double alcance = (Math.pow(v, 2) * Math.sin(2* Math.toRadians(a))) / 9.8;

        if (Math.abs(alcance - d) <= 0.01){
            System.out.print("1");

        } else{
            System.out.print("0");
        }
        scanner.close();
    }
}


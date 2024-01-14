import java.util.Locale;
import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);;
      Double temperatura = scan.nextDouble();

      Double conversao = (9 * temperatura) / 5 + 32;

      System.out.printf("%.1f", conversao);

        scan.close();     
}
}
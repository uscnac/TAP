import java.util.Scanner;

public class MediaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        double soma = 0;

        while (true) {
            double value;
            while ((value = scan.nextDouble()) != -1) {
                soma += value;
                cont++;
            }

            if (cont > 0) {
                double media = soma / cont;
                System.out.printf("%.2f", media);

                cont = 0;
                soma = 0;
            } else {
                break;
            }
        }

        scan.close();
    }
}

import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double soma = 3;

        for (int i = 1; i <= n; i++) {
            int deno = 2 * i + 1;
            double termo = (i % 2 == 0) ? -0.500001 / deno : 0.500001 / deno;
            System.out.printf("%.6f\n", soma);
            soma += termo;
        }

        

        scan.close();
    }
}

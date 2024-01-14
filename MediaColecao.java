import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int n = 0;
        n = scan.nextInt();
        
        int soma = 0;
        int quant = 0;
        
        do {
            n = scan.nextInt();

            if (n != -1) {
                soma += n;
                quant += 1;

            }
        } while (n != -1);

        double media = (double) soma / quant;
        System.out.printf("%.2f",media);

        scan.close();
    }
    }



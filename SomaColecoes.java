import java.util.Scanner;

public class SomaColecoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int somaTotal = 0;
        int somaColecao = 0;

        while (true) {
            int elemento = scan.nextInt();

            if (elemento == -1) {
                System.out.println(somaColecao);
                somaColecao = 0;

                elemento = scan.nextInt();
                if (elemento == -1) {
                    break;
                }
            }

            somaColecao += elemento;

        }

        

        scan.close();
    }
}   

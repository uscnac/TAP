import java.util.Scanner;

public class ValorExpoente {
    public int encontrarMenorExpoente(int limite) {
        int soma = 0;
        int expoente = 1;

        while (soma <= limite) {
            soma += Math.pow(2, expoente);
            expoente++;
        }

        return expoente - 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limite = scan.nextInt();
        ValorExpoente calculadora = new ValorExpoente();
        int resultado = calculadora.encontrarMenorExpoente(limite);

        System.out.printf("%d", resultado);

        scan.close(); 
    }
}

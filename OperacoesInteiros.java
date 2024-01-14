import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();

            int[] vetor = converterInputParaVetor(input);

            if (vetor.length == 0) {
                break;
            }

            exibirOperacoes(vetor);
        }

        scan.close();
    }

    public static int[] converterInputParaVetor(String input) {
        String[] partes = input.split(" ");

        int[] vetor = new int[partes.length];

        for (int i = 0; i < partes.length; i++) {
            vetor[i] = Integer.parseInt(partes[i]);

            if (vetor[i] == -1) {
                int[] novoVetor = new int[i];
                System.arraycopy(vetor, 0, novoVetor, 0, i);
                return novoVetor;
            }
        }

        return vetor;
    }

    public static void exibirOperacoes(int[] vetor) {
        int quantidadeElementos = vetor.length;
        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int somaTotal = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int elemento : vetor) {
            somaTotal += elemento;

            if (elemento % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }

            if (elemento > maior) {
                maior = elemento;
            }

            if (elemento < menor) {
                menor = elemento;
            }
        }

        double media = (double) somaTotal / quantidadeElementos;
        media = Math.round(media * 100.0) / 100.0;

        System.out.println(quantidadeElementos);
        System.out.println(quantidadePares);
        System.out.println(quantidadeImpares);
        System.out.println(somaTotal);
        System.out.printf("%.1f",media);
        System.out.println(maior);
        System.out.println(menor);
    }
}

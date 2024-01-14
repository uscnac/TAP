import java.util.Scanner;

public class FaltasTrabalho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] faltas = lerVetor(scan);

        calcularEExibirPercentual(faltas);

        scan.close();
    }

    public static int[] lerVetor(Scanner scan) {
        return lerVetorPrivado(scan);
    }

    public static int[] lerVetorPrivado(Scanner scan) {
        String input = scan.nextLine();
        String[] elementos = input.split(" ");
        int tamanho = elementos.length;

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Integer.parseInt(elementos[i]);

            if (vetor[i] == -1) {
                int[] novoVetor = new int[i];
                System.arraycopy(vetor, 0, novoVetor, 0, i);
                return novoVetor;
            }
        }

        return vetor;
    }

    public static void calcularEExibirPercentual(int[] faltas) {
        int totalFaltas = faltas.length;
        int[] contagemFaltasPorDia = new int[6];

        for (int falta : faltas) {
            if (falta >= 2 && falta <= 7) {
                contagemFaltasPorDia[falta - 2]++;
            }
        }

        for (int i = 0; i < 6; i++) {
            double percentual = (contagemFaltasPorDia[i] * 100.0) / totalFaltas;
            System.out.printf("%.1f ", percentual);
        }
    }
}

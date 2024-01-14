import java.util.NoSuchElementException;
import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] golsTime = lerVetor(scan);

        int[] golsAdversario = lerVetor(scan);

        int[] resultados = calcularResultados(golsTime, golsAdversario);
        exibirResultados(resultados);

        scan.close();
    }

    public static int[] lerVetor(Scanner scan) {
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

    public static int[] calcularResultados(int[] golsTime, int[] golsAdversario) {
        int tamanho = golsTime.length;
        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;

        for (int i = 0; i < tamanho; i++) {
            if (golsTime[i] > golsAdversario[i]) {
                vitorias++;
            } else if (golsTime[i] < golsAdversario[i]) {
                derrotas++;
            } else {
                empates++;
            }
        }

        return new int[]{vitorias, empates, derrotas};
    }

    public static void exibirResultados(int[] resultados) {
        System.out.println(resultados[0]);
        System.out.println(resultados[1]);
        System.out.println(resultados[2]);
    }
}

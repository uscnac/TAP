import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizHoras = lerMatriz(scanner);

        exibirDiasMaisTrabalhados(matrizHoras);

        scanner.close();
    }

    public static int[][] lerMatriz(Scanner scanner) {
        return lerMatrizPrivado(scanner);
    }

    private static int[][] lerMatrizPrivado(Scanner scanner) {
        int[][] matriz = new int[0][7];
        int linha = 0;

        while (true) {
            String input = scanner.nextLine().trim(); 
            String[] elementos = input.split(" ");

            if (elementos.length == 1 && Integer.parseInt(elementos[0]) == -1) {
                break;
            }

            matriz = redimensionarMatriz(matriz, linha + 1, 7);

            for (int coluna = 0; coluna < elementos.length; coluna++) {
                matriz[linha][coluna] = Integer.parseInt(elementos[coluna]);
            }

            linha++;
        }

        return matriz;
    }

    private static int[][] redimensionarMatriz(int[][] matriz, int novaLinha, int novaColuna) {
        int[][] novaMatriz = new int[novaLinha][novaColuna];

        for (int i = 0; i < matriz.length; i++) {
            System.arraycopy(matriz[i], 0, novaMatriz[i], 0, Math.min(matriz[i].length, novaColuna));
        }

        return novaMatriz;
    }


    public static void exibirDiasMaisTrabalhados(int[][] matrizHoras) {
        int[] totalHorasPorDia = new int[7];

        for (int i = 0; i < matrizHoras.length; i++) {
            for (int j = 0; j < 7; j++) {
                totalHorasPorDia[j] += matrizHoras[i][j];
            }
        }

        int maxHoras = -1;
        for (int i = 0; i < 7; i++) {
            if (totalHorasPorDia[i] > maxHoras) {
                maxHoras = totalHorasPorDia[i];
            }
        }

        for (int i = 0; i < 7; i++) {
            if (totalHorasPorDia[i] == maxHoras) {
                System.out.println(i + 1);
            }
        }
    }
}

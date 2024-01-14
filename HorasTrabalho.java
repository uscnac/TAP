
import java.util.Scanner;

public class HorasTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizHoras = lerMatriz(scanner);

        calcularEExibirHorasTrabalho(matrizHoras);

        scanner.close();
    }

    public static int[][] lerMatriz(Scanner scanner) {
        return lerMatrizPrivado(scanner);
    }

    private static int[][] lerMatrizPrivado(Scanner scanner) {
        int[][] matriz = new int[0][7];
        int linha = 0;
    
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] elementos = input.split(" ");
    
            if (elementos.length == 1 && Integer.parseInt(elementos[0]) == -1) {
                break;
            }
    
            matriz = redimensionarMatriz(matriz, linha + 1);
    
            for (int coluna = 0; coluna < 7; coluna++) {
                matriz[linha][coluna] = Integer.parseInt(elementos[coluna]);
            }
    
            linha++;
        }
    
        return matriz;
    }

    private static int[][] redimensionarMatriz(int[][] matriz, int novaLinha) {
        int[][] novaMatriz = new int[novaLinha][7];

        for (int i = 0; i < Math.min(matriz.length, novaLinha); i++) {
            System.arraycopy(matriz[i], 0, novaMatriz[i], 0, matriz[i].length);
        }

        return novaMatriz;
    }

    public static void calcularEExibirHorasTrabalho(int[][] matrizHoras) {
        for (int i = 0; i < matrizHoras.length; i++) {
            int totalHoras = 0;

            for (int j = 0; j < 7; j++) {
                totalHoras += matrizHoras[i][j];
            }

            System.out.println(totalHoras);
        }
    }
}




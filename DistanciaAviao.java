import java.util.Scanner;

public class DistanciaAviao {
    public static void main(String[] args) {
        int[][] temposViagem = {
                {0, 2, 11, 6, 15, 11, 1},
                {2, 0, 7, 12, 4, 2, 15},
                {11, 7, 0, 11, 8, 3, 13},
                {6, 12, 11, 0, 10, 2, 1},
                {15, 4, 8, 10, 0, 5, 13},
                {11, 2, 3, 2, 5, 0, 14},
                {1, 15, 13, 1, 13, 14, 0}
        };

        Scanner scanner = new Scanner(System.in);
        
        int cidadeAtual = scanner.nextInt();
        int tempoTotal = 0;

        while (cidadeAtual != -1) {
            int proximaCidade = scanner.nextInt();
            
            if (cidadeAtual >= 111 && cidadeAtual <= 777 &&
                proximaCidade >= 111 && proximaCidade <= 777) {
                tempoTotal += temposViagem[(cidadeAtual / 111) - 1][(proximaCidade / 111) - 1];
            } 
            cidadeAtual = proximaCidade;
        }

        System.out.println(tempoTotal);

        scanner.close();
    }
}

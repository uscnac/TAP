
import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double alturaTotal = scanner.nextDouble();
        double nivelCombustivel = scanner.nextDouble();
        double raioBojos = scanner.nextDouble();

        double volume = calcularVolume(alturaTotal, nivelCombustivel, raioBojos);

        System.out.printf("%.3f\n", volume);

        // Fechar o scanner
        scanner.close();
    }

    private static double calcularVolume(double alturaTotal, double nivelCombustivel, double raioBojos) {
        if (alturaTotal <= 0 || nivelCombustivel < 0 || nivelCombustivel > alturaTotal || raioBojos <= 0) {
            return -1.000;
        }

        double alturaCilindro = Math.max(nivelCombustivel - raioBojos, 0);
        double volumeCilindro = Math.PI * Math.pow(raioBojos, 2) * alturaCilindro;

        double volumeEsferaSuperior = calcularVolumeEsfera(raioBojos);
        double volumeEsferaInferior = calcularVolumeEsfera(raioBojos);

        return volumeCilindro + volumeEsferaSuperior + volumeEsferaInferior;
    }

    private static double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}

public class AreaPoligono {
    public static void main(String[] args) {
        double[] x = {4, 7, 9, 4};
        double[] y = {4, 7, 7, 4};

        double area = calcularAreaPoligono(x, y);

        System.out.printf("%.4f%n", area);
    }

    public static double calcularAreaPoligono(double[] x, double[] y) {
        int n = x.length;

        double soma = 0;
        for (int i = 0; i < n - 1; i++) {
            soma += x[i] * y[i + 1] - x[i + 1] * y[i];
        }

        soma += x[n - 1] * y[0] - x[0] * y[n - 1];

        double area = Math.abs(soma) / 2.0;

        return area;
    }
}

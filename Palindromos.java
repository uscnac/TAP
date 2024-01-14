import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sequencia = scan.nextLine();

        String textoLimpo = sequencia.replace(" ", "").toUpperCase();

        boolean resultado = ehPalindromo(textoLimpo);

        System.out.println(textoLimpo + " " + (resultado ? 1 : 0));

        scan.close();
    }

    public static boolean ehPalindromo(String texto) {
        int tamanho = texto.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (texto.charAt(i) != texto.charAt(tamanho - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

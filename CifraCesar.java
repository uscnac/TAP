import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int deslocamento = scanner.nextInt();
        String textoOriginal = scanner.nextLine();

        String textoCriptografado = cifraCesar(textoOriginal, deslocamento);

        System.out.println(textoCriptografado.toUpperCase().trim());

        scanner.close();
    }

    public static String cifraCesar(String textoOriginal, int deslocamento) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < textoOriginal.length(); i++) {
            char caractereOriginal = textoOriginal.charAt(i);

            if (Character.isLetter(caractereOriginal)) {
                char base = Character.isUpperCase(caractereOriginal) ? 'A' : 'a';
                char caractereCifrado = (char) ((caractereOriginal - base + deslocamento) % 26 + base);
                resultado.append(caractereCifrado);
            } else {
                resultado.append(caractereOriginal);
            }
        }

        return resultado.toString();
    }
}

import java.util.Scanner;

public class OperacoesString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String inputString = scan.nextLine();

        int quantidadeCaracteres = inputString.length();

        char primeiroCaractere = inputString.charAt(0);
        char ultimoCaractere = inputString.charAt(quantidadeCaracteres - 1);

        String maiusculas = inputString.toUpperCase();
        String minusculas = inputString.toLowerCase();

        String substituida = inputString.replace('a', 'e');

        StringBuilder caracteresPares = new StringBuilder();
        for (int i = 0; i < quantidadeCaracteres; i += 2) {
            caracteresPares.append(inputString.charAt(i));
        }

        int quantidadeVogais = contarVogais(inputString);

        // Saída
        System.out.println(quantidadeCaracteres);
        System.out.println(primeiroCaractere);
        System.out.println(ultimoCaractere);
        System.out.println(maiusculas); 
        System.out.println(minusculas);
        System.out.println(substituida);
        System.out.println(caracteresPares);
        System.out.println(quantidadeVogais);

        scan.close();
    }

    public static int contarVogais(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}

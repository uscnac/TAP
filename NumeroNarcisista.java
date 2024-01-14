import java.util.Scanner;

public class NumeroNarcisista {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    String numero = String.valueOf(n);
    int quant = numero.length();
    int soma = 0;

    for (int i = 0; i < quant; i++) {
        int digito = Character.getNumericValue(numero.charAt(i));
        soma += Math.pow(digito, quant);
    }

    if(soma == n){
        System.out.println("SIM");
    }
    else{
        System.out.println("NAO");
    }

    scan.close();   

}}
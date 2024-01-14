import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int valor = scan.nextInt();
      int n50 = 0;
      int n10 = 0;
      int n2 = 0;
    
    
        if (valor < 0 || valor % 2 != 0) {
            System.out.println("Valor Invalido");}

        else{

            while(valor >= 50){
                n50 += 1;
                valor -= 50;
            }
            while(valor >= 10){
                n10 += 1;
                valor -= 10;

            }
            while(valor >= 2){
                n2 += 1;
                valor -= 2;
            }


            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2", n50, n10, n2);

        }

        scan.close();     
}}
import java.util.Locale;
import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);;
      Double hora = scan.nextDouble();
      int quanthora = scan.nextInt();

      Double bruto = hora * quanthora;
      Double ir = bruto * 0.11;
      Double inss = bruto * 0.08;
      Double desconto = ir + inss;
      Double liquido = bruto - desconto;

      System.out.printf("Salario bruto: R$%.2f\n", bruto);
      System.out.printf("IR: R$%.2f\n", ir);
      System.out.printf("INSS: R$%.2f\n", inss);
      System.out.printf("Total de descontos: R$%.2f\n", desconto);
      System.out.printf("Salario liquido: R$%.2f", liquido);

        scan.close();     
}
}
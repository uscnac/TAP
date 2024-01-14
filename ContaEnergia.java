import java.util.Locale;
import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    double ener = scan.nextFloat();
    char tipo = scan.next().charAt(0);
    double conta = 0;

    if(tipo == 'R'){
        if(ener > 500){
            conta = ener * 0.65;
            System.out.printf("%.2f", conta);
        }

        else if ( ener > 0 ) {
            conta = ener * 0.40;
            System.out.printf("%.2f", conta);
        }
        else{
            System.out.printf("-1");
        }
    }

    else if (tipo == 'I'){
        if(ener > 5000){
            conta = ener * 0.60;
            System.out.printf("%.2f", conta);
        }

        else if ( ener > 0 ) {
            conta = ener * 0.55;
            System.out.printf("%.2f", conta);
        }

        else{
            System.out.printf("-1");
        }
        
    }

    else if (tipo == 'C'){

        if(ener > 1000){
            conta = ener * 0.60;
            System.out.printf("%.2f", conta);
        }

        else if ( ener > 0 ) {
            conta = ener * 0.55;
            System.out.printf("%.2f", conta);
        }
        else{
            System.out.printf("-1");
        }
    }

    else{
        System.out.printf("-1");
    }

    scan.close();
    }
}   
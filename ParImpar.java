import java.util.Scanner;
import java.util.ArrayList;

public class ParImpar {
    public static void main(String[] args) {

        ArrayList<String> vetor = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        int n = 0;
        
        do {
            n = scan.nextInt();

            if (n != -1) {
                if(n % 2 == 0){
                  vetor.add("PAR");
                 } else{
                     vetor.add("IMPAR"); 
                    }
            }
        } while (n != -1);

        for(String resultado : vetor){
            System.out.println(resultado);
        }

        scan.close();
    }
    }

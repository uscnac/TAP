import java.util.Scanner;

public class RaizDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = scan.nextDouble();

        for(int i = 1; i <= n; i++){

            System.out.printf("%.14f\n",1+f(i));

        }

    }

    public static double f(int valor) {
        if(valor == 0){
            return 1;
        }
        else{
            return 1/(2+f(valor-1));
        }

    }




}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

    public class AprovacaoDisciplina {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            ArrayList <Float> notas = new ArrayList<Float>();
            ArrayList <Integer> horas = new ArrayList<Integer>();
            float nn = 0.0f;
            int n = 0;
            int conta = 0;
            float media = 0;
            int car = 0;
            int soma = 0;
            int aprovado = 0;
            int reprovadon = 0;
            int reprovado = 0;

            do{
                nn = scan.nextFloat();
                if (nn != -1) {
                    notas.add(nn);
                    conta ++;
                }

            } while (nn != -1);

            for(int i = 0; i<conta; i++){
                soma += notas.get(i);
                
            }
            media = soma/conta;
            conta = 0;

            do {
                n = scan.nextInt();

                if (n != -1) {
                    horas.add(n);
                    conta ++;
                }
            } while (n != -1);

            
            car = scan.nextInt();
            double m = car * 0.25;
            
            for(int i = 0; i<conta; i++){


            if(media >= 5 && car - horas.get(i) <= m){
                aprovado += 1;    
            }
            else if(media <5 && car - horas.get(i) > m){
                reprovadon += 1;      
            }
            else if(media <5){
                reprovadon += 1;
            }
            else if(car - horas.get(i) > m){
                reprovado += 1;
            }
            }

            System.out.printf("%d %d %d", aprovado, reprovadon, reprovado);

            scan.close();
        }
        }
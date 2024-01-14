    import java.util.Scanner;

    public class DataExtenso {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String n = scan.nextLine();

            String sdia = n.substring(0, 2);
            String smes = n.substring(2, 4);
            String sano = n.substring(4, 8);

            int dia = Integer.parseInt(sdia);
            int mes = Integer.parseInt(smes);
            int ano = Integer.parseInt(sano);

            if(mes == 01){
                System.out.printf("%d de janeiro de %d", dia, ano);
            }
            else if(mes == 02){
                System.out.printf("%d de fevereiro de %d", dia, ano);
            }
            else if(mes == 03){
                System.out.printf("%d de março de %d", dia, ano);
            }
            else if(mes == 04){
                System.out.printf("%d de abril de %d", dia, ano);
            }
            else if(mes == 05){
                System.out.printf("%d de maio de %d", dia, ano);
            }
            else if(mes == 06){
                System.out.printf("%d de junho de %d", dia, ano);
            }
            else if(mes == 07){
                System.out.printf("%d de julho de %d", dia, ano);
            }
            else if(mes == 8){
                System.out.printf("%d de agosto de %d", dia, ano);
            }
            else if(mes == 9){
                System.out.printf("%d de setembro de %d", dia, ano);
            }
            else if(mes == 10){
                System.out.printf("%d de outubro de %d", dia, ano);
            }
            else if(mes == 11){
                System.out.printf("%d de novembro de %d", dia, ano);
            }
            else if(mes == 12){
                System.out.printf("%d de dezembro de %d", dia, ano);
            }
            scan.close();
        }
        }



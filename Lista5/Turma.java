import java.util.ArrayList;
import java.util.List;

public class Turma {
     String nome;
     String professor;
     int numAlunos;
     boolean acessivel;
     ArrayList<Integer> horarios = new ArrayList<>();

     public Turma(){

     }

    public Turma(String nome, String professor, int numAlunos, boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<>();
    }

    public void addHorario(int horario) {
        horarios.add(horario);
    }


    public String getHorariosString() {
        StringBuilder horarioS = new StringBuilder();

        int tamanho = horarios.size();
        for (int i = 0; i < tamanho; i++) {
            int horario = horarios.get(i);
            horarioS.append(Semanas(horario)).append(" ").append(Horas(horario)).append("hs");
            if (i < tamanho - 1) {
                horarioS.append(", ");
            }
        }
        return horarioS.toString();
    }

    private String Semanas(int horario) {
        if (horario == 1 || horario == 2 || horario == 3 || horario == 4 || horario == 5 || horario == 6 || horario == 7) {
            return "segunda";
        } else if (horario == 8 || horario == 9 || horario == 10 || horario == 11 || horario == 12 || horario == 13 || horario == 14) {
            return "terça";
        } else if (horario == 15 || horario == 16 || horario == 17 || horario == 18 || horario == 19 || horario == 20 || horario == 21) {
            return "quarta";
        } else if (horario == 22 || horario == 23 || horario == 24 || horario == 25 || horario == 26 || horario == 27 || horario == 28) {
            return "quinta";
        } else if (horario == 29 || horario == 30 || horario == 31 || horario == 32 || horario == 33 || horario == 34 || horario == 35) {
            return "sexta";
        } else {
            return "erro"; 
        }
    }

    private int Horas(int horario) {
        if (horario == 1 || horario == 8 || horario == 15 || horario == 22 || horario == 29) {
            return 8;
        } else if (horario == 2 || horario == 9 || horario == 16 || horario == 23 || horario == 30) {
            return 10;
        } else if (horario == 3 || horario == 10 || horario == 17 || horario == 24 || horario == 31) {
            return 12;
        } else if (horario == 4 || horario == 11 || horario == 18 || horario == 25 || horario == 32) {
            return 14;
        } else if (horario == 5 || horario == 12 || horario == 19 || horario == 26 || horario == 33) {
            return 16;
        } else if (horario == 6 || horario == 13 || horario == 20 || horario == 27 || horario == 34) {
            return 18;
        } else if (horario == 7 || horario == 14 || horario == 21 || horario == 28 || horario == 35) {
            return 20;
        } else {
            return 0; 
        }
    }
    

    public String getDescricao() {
        String acessivelStr = acessivel ? "sim" : "não";

        return "Turma: " + nome + "\n" +
                "Professor: " + professor + "\n" +
                "Número de Alunos: " + numAlunos + "\n" +
                "Horário: " + getHorariosString() + "\n" +
                "Acessível: " + acessivelStr;
    }

}
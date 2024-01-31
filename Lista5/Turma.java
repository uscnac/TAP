import java.util.*;

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

    void addHorario(int horario) {
        this.horarios.add(horario);
    }


    String getHorariosString() {
        String[][] tabela = {
            {"8hs segunda", "8hs terça", "8hs quarta", "8hs quinta", "8hs sexta"},
            {"10hs segunda", "10hs terça", "10hs quarta", "10hs quinta", "10hs sexta"},
            {"12hs segunda", "12hs terça", "12hs quarta", "12hs quinta", "12hs sexta"},
            {"14hs segunda", "14hs terça", "14hs quarta", "14hs quinta", "14hs sexta"},
            {"16hs segunda", "16hs terça", "16hs quarta", "16hs quinta", "16hs sexta"},
            {"18hs segunda", "18hs terça", "18hs quarta", "18hs quinta", "18hs sexta"},
            {"20hs segunda", "20hs terça", "20hs quarta", "20hs quinta", "20hs sexta"}};

        StringBuilder horariosString = new StringBuilder();
        for (Integer horario : horarios) {
            int linha = (horario - 1) / 5;
            int coluna = (horario - 1) % 5;
            horariosString.append(tabela[linha][coluna]).append(", ");
        }
        return horariosString.toString().replaceAll(", $", "");
    }
    

    String getDescricao() {
        String n = acessivel ? "acessível" : "não acessível";

        return String.format("Turma: %s\n", nome) +
                String.format("Professor: %s\n", professor) +
                String.format("Número de Alunos: %s\n", numAlunos) +
                String.format("Horário %s\n", getHorariosString()) +
                String.format("Acessível %s\n", n);
    }
}


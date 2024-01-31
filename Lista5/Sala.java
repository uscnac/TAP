public class Sala{
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    public Sala(){

    }

    Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    String getDescricao(){
        String n;
        if(acessivel){n = "acessível";}
        else n = "não acessível";

        return String.format("Bloco %d, Sala %d (%s lugares, %s)", bloco, sala, capacidade, n);
    }

}


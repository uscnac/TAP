class Mestre {

    String nome;
    int anoNascimento;
    String afiliacao;
    String posto;

    public Mestre(){

        this("",0,"","");
    }

    Mestre(String nome, int anoNascimento, String afiliacao, String posto){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.afiliacao = afiliacao;
        this.posto = posto;
    }


int getIdade(int anoReferencia){
    return Math.abs(anoNascimento - anoReferencia);

}

String getAnoNascimentoString() {
    String era = (anoNascimento >= 0) ? "DBY" : "ABY";
    return Math.abs(anoNascimento) + era;
    }


boolean possuiForca(){  
    return "Jedi".equals(posto) || "Sith".equals(posto);
}

String getDescricao(){
    return String.format("Mestre: nome=%s, anoNascimento=%s, afiliacao=%s, posto=%s, possuiForca=%b.", nome, getAnoNascimentoString(), afiliacao, posto, possuiForca());

}
}





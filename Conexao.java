class Conexao {
    
    String tipoPorta;
    int taxaTransmissao;
    int idProtocolo;

    public Conexao() {
        this("", 0, 0);
    }

    Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao) {
        this.tipoPorta = tipoPorta;
        this.idProtocolo = idProtocolo;
        this.taxaTransmissao = taxaTransmissao;
    }

    String getProtocoloString() {
        if (idProtocolo == 1) {
            return "Rotoscope";
        } else if (idProtocolo == 2) {
            return "Acustico";
        } else if (idProtocolo == 3) {
          
          return "Radio";
        } else {
            return "Outros";
        }
    }

    double getTaxaMBps() {
        return taxaTransmissao / 1024.0;        
    }

    String getDescricao() {
        return String.format("Conexao: tipoPorta=%s, protocolo=%s, taxaTransmissao=%.1fMBps.", tipoPorta, getProtocoloString(), getTaxaMBps());
    }
}


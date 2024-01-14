class Sensor{
    
    String cor;
    double resolucao;
    int framesPorSegundo;

    public Sensor(){
        this("",0.0,0);
    }

    Sensor(String cor, double resolucao, int framesPorSegundo){

        this.cor = cor;
        this.resolucao = resolucao;
        this.framesPorSegundo = framesPorSegundo;

    }

    double getMPixelsPorSegundo(){
        return resolucao * framesPorSegundo;

    }

    String getDescricao(){
        return String.format("Sensor: cor=%s, resolucao=%.1fMp, framesPorSegundo=%dfps, mPixelsPorSegundo=%.1fMpps.", cor, resolucao, framesPorSegundo, getMPixelsPorSegundo());

    }
}
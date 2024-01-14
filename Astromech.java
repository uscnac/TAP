class Astromech {

    String modelo;
    Mestre mestre;
    Sensor sensor;
    Conexao conexao;

    public Astromech(String modelo, Mestre mestre, Sensor sensor, Conexao conexao) {
        this.modelo = modelo;
        this.mestre = mestre;
        this.sensor = sensor;
        this.conexao = conexao;
    }

    String getDescricao() {
        String mestreDescricao = mestre.getDescricao();
        String sensorDescricao = sensor.getDescricao();
        String conexaoDescricao = conexao.getDescricao();

        return String.format("Astromech modelo %s. %s %s %s", modelo, mestreDescricao, sensorDescricao, conexaoDescricao);
    }
}


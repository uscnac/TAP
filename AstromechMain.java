public class AstromechMain {
    public static void main(String[] args) {
        Mestre mestre = new Mestre("Luke Skywalker", 19, "Alianca para Restauracao da Republica", "Jedi");
        Sensor sensor = new Sensor("Azul", 512.0, 240);
        Conexao conexao = new Conexao("SCOMP", 4000, 1);

        Astromech astromech = new Astromech("R2-D2", mestre, sensor, conexao);
        System.out.println(astromech.getDescricao());
    }
}   
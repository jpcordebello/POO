public class TesteJogador {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Leonardo Jardim", new Jogador [3]);

        Jogador j1 = new Jogador("Paqueta",30,"meia");
        Jogador j2 = new Jogador("Bruno Henrique",27,"atacante");
        Jogador j3 = new Jogador("Pedro",26,"atacante");

        time.adicionarJogador(j1);
        time.adicionarJogador(j2);
        time.adicionarJogador(j3);

        System.out.println(time.getNome());
        time.listarJogadores();
    }


}

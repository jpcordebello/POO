public class Maratona extends Object {
    protected String nome;
    protected String sexo;
    protected int idade;
    protected double altura;

    public Maratona(String nome, String sexo, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
    // -Atletas com idade maior que 18 ou altura maior ou igual a 1.80 poderão
    // participar da maratona como maratonista.
    // Deverá ser exibida a mensagem partiparáou não participará da competição

    public String verificarSituacao() {

        String mensagem = "";

        if (idade <= 18) {
            mensagem += "Idade insuficiente. ";
        }

        if (altura < 1.80) {
            mensagem += "Altura insuficiente. ";
        }

        if (mensagem.isEmpty()) {
            return "Participara da maratona";
        }

        return "Nao participara da maratona: " + mensagem;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + "\nSexo: " + sexo + "\nIdade: " + idade +
                "\nAltura: " + altura;
    }

}

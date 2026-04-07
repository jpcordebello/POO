public class AtletaAmador extends Maratona {
    private boolean atestado;

    public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
        super(nome, sexo, idade, altura);
        this.atestado = atestado;
    }

    public boolean isAtestado() {
        return atestado;
    }

    @Override
    public String toString(){        
        return super.toString()+ "\nAtestado: "+ atestado;
    }
    @Override
public String verificarSituacao() {

    String mensagem = "";

    if (!atestado) {
        mensagem += "Sem atestado. ";
    }

    String situacaoBase = super.verificarSituacao();

    if (situacaoBase.equals("Participara da maratona")) {
        if (mensagem.isEmpty()) {
            return "Participara da maratona";
        } else {
            return "Nao participara da maratona: " + mensagem;
        }
    }

    if (!mensagem.isEmpty()) {
        return situacaoBase + mensagem;
    }

    return situacaoBase;
}
}

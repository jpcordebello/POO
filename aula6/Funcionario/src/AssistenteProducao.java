public class AssistenteProducao extends Assistente{
    private String especialidade;

    public AssistenteProducao(int id, String nome, double salario, String tunro, Setor setor, double adicional,
            String especialidade) {
        super(id, nome, salario, tunro, setor, adicional);
        this.especialidade = especialidade;
    }

    

}

public class Medico {
    private int crm;
    private String nome;
    private double valorConsulta;
    private static int count = 0;


    public Medico(int crm, String nome, double valorConsulta){
        this.crm= crm;
        this.nome= nome;
        this.valorConsulta= valorConsulta;
        count++;
        
    }


    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }
    public static int getCount(){
    return count;
    }
}

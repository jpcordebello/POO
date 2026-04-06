import javax.swing.JOptionPane;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Joao", 3000);

        double inss = funcionario1.calcularInss();
        double vt = funcionario1.calcularValeTransporte();
        double salarioLiquido = funcionario1.getSalario() - inss - vt;

        JOptionPane.showMessageDialog(null, 
            "Nome: " + funcionario1.getNome() +
            "\nSalário: " + funcionario1.getSalario()+
            "\nInss: "+ funcionario1.calcularInss()+
            "\nVale transporte: " + funcionario1.calcularValeTransporte() +
            "\n Salário Liquido: " + String.format("%.2f",salarioLiquido));

    }

}

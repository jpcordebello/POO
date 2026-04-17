import javax.swing.JOptionPane;

public class ExemploJoption {

    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Entre com 1º num.:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Entre com 2º num.:"));

            JOptionPane.showMessageDialog(null, calcular(a, b));

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Divisão por zero", "Erro", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!");
        }
    }

    public static int calcular(int a, int b) {
        return a / b;
    }
}
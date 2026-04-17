public class Exemplo {
    public static void main(String[] args) {
        calcular(10, 5);

        try{
            System.out.println("Resultado: " + calcular(10, 30));
            System.out.println("Fim de Programa! ");
        } catch (ArithmeticException e){
            System.err.println("Erro! Divisao por zero!");
        }finally{
            System.out.println("Fim de Programa no finally");
        }
    }

    public static int calcular(int a, int b){
            //if (b==0) {
                //throw new ArithmeticException("Erro! Divisao por zero!"); 
            return a/b;
    }
}
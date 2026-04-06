public class Pessoa {
    private int codigo;
    private String nome;
    private double peso, altura;

        

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >0 && peso < 300 ){
            this.peso = peso;

        } else{
            this.peso=0;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double calcularIMC(){
        return peso/(altura*altura);
    }

    public String resultado(){
        if(calcularIMC()<18.5){
            return "abaixo do peso";
        } else if(calcularIMC()<=24.9){
            return "peso normal";
        } else {
            return "acima do peso";
        }

    }

}

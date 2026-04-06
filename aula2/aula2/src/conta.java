public class conta {
 //atributos 

    int numero;
    String titular;
    double saldo;


    public void depositar(double valor){
        if (valor>0){
            saldo+=valor;
            System.out.println("Transacao efetuada com sucesso!");
        } else {
            System.out.println("Deposito nao efetuado");
        }
    }    

    //metodo saque
    public boolean saque( double valor){
        if (valor <=saldo) {
        saldo-=valor;
        return true;
            
        }
        return false;

    }



}

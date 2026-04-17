package br.com.serratec.conexao;
import br.com.serratec.model.Cliente;
import br.com.serratec.persistencia.ClienteDao;

public class TesteListar {
    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();
        for (Cliente cliente : dao.listar()) {
            System.out.println(cliente);
        }
    }
}
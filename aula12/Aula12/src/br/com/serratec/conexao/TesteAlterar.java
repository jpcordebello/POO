package br.com.serratec.conexao;

import java.util.Scanner;

import br.com.serratec.model.Cliente;
import br.com.serratec.persistencia.ClienteDao;

public class TesteAlterar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteDao dao = new ClienteDao();

        System.out.println("Digite o id do cliente que deseja alterar:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o novo nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o novo email:");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(id, nome, email);

        boolean alterou = dao.alterar(cliente);

        if (alterou) {
            System.out.println("Cliente alterado com sucesso!");
        } else {
            System.out.println("Falha ao alterar cliente!");
        }

        sc.close();
    }
}
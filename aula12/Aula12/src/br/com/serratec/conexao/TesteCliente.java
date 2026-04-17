package br.com.serratec.conexao;

import java.util.Scanner;

import br.com.serratec.model.Cliente;
import br.com.serratec.persistencia.ClienteDao;

public class TesteCliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ClienteDao dao = new ClienteDao();

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o email do cliente:");
        String email = sc.nextLine();

        boolean inseriu = dao.inserir(new Cliente(null, nome, email));

        if (inseriu) {
            System.out.println("Cliente inserido com sucesso!");
        } else {
            System.out.println("Falha ao inserir cliente!");
        }

        sc.close();
    }
}
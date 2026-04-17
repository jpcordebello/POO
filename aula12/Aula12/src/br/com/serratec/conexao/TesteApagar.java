package br.com.serratec.conexao;

import java.util.Scanner;

import br.com.serratec.persistencia.ClienteDao;

public class TesteApagar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClienteDao dao = new ClienteDao();

        System.out.println("Digite o id do cliente que deseja apagar:");
        int id = sc.nextInt();

        boolean apagou = dao.apagar(id);

        if (apagou) {
            System.out.println("Cliente removido com sucesso!");
        } else {
            System.out.println("Falha ao remover cliente!");
        }

        sc.close();
    }
}
package br.com.serratec.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.serratec.conexao.Conexao;
import br.com.serratec.model.Cliente;

public class ClienteDao {
    private Connection connection;

    public ClienteDao() {
        connection = new Conexao().getConnection();
    }

    public boolean inserir(Cliente cliente) {
        String sql = "insert into cliente(nome, email) values (?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());

            int linhas = stmt.executeUpdate();

            stmt.close();
            connection.close();

            return linhas > 0;

        } catch (SQLException e) {
            System.err.println("Cliente não inserido!");
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(Cliente cliente) {
        String sql = "update cliente set nome = ?, email = ? where id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setInt(3, cliente.getId());

            int linhas = stmt.executeUpdate();

            stmt.close();
            connection.close();

            return linhas > 0;

        } catch (SQLException e) {
            System.err.println("Cliente não alterado!");
            e.printStackTrace();
            return false;
        }
    }

    public boolean apagar(int codigo) {
        String sql = "delete from cliente where id = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo);

            int linhas = stmt.executeUpdate();

            stmt.close();
            connection.close();

            return linhas > 0;

        } catch (SQLException e) {
            System.err.println("Cliente não removido!");
            e.printStackTrace();
            return false;
        }
    }

    public List<Cliente> listar() {

    String sql = "select * from cliente";
    List<Cliente> clientes = new ArrayList<>();

    try {

        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            Cliente cliente = new Cliente(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("email")
            );

            clientes.add(cliente);
        }

        rs.close();
        stmt.close();
        connection.close();

    } catch (SQLException e) {
        System.err.println("Problemas ao listar os clientes");
        e.printStackTrace();
    }

    return clientes;
}


    
}
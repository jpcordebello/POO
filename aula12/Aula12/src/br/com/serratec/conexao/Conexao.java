package br.com.serratec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String url = "jdbc:postgresql://localhost:5432/Turma";
    private String username = "postgres";
    private String senha = "Post123##";

    private Connection connection;

    public Connection getConnection() {

        System.out.println("Conectando no banco de dados...");

        try {

            connection = DriverManager.getConnection(url, username, senha);

            if (connection != null) {
                System.out.println("Conectado com sucesso!");
            } else {
                System.out.println("Não foi possível conectar!");
            }

        } catch (SQLException e) {
            System.out.println("Problemas no Driver ou senha incorreta do banco");
            e.printStackTrace();
        }

        return connection;
    }
}
package br.com.serratec.model;

public class Cliente {
    private Integer id;
    private String nome ;
    private String  email;
    public Cliente(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    @Override
    public String toString() {
        return id + " - " + nome + " - " + email ;
    }
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    
}

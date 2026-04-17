public class Equipamentos {
    private int codigo;
    private String descricao;
    private Marca marca;
    
    
    public Equipamentos(int codigo, String descricao, Marca marca) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "Equipamentos [codigo=" + codigo + ", descricao=" + descricao + ", marca=" + marca + "]";
    }

    
}

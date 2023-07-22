public class Produto{
    private int codigo;
    private String descricao;
    private double preco;
    //Construtor padrão
    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    //PENDENTE DE IMPLEMENTAÇÃO NO MAIN
    //retornar o código do produto
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    //PENDENTE DE IMPLEMENTAÇÃO NO MAIN
    //retornar o preço do produto
    public double getPreco() {
        return preco;
    }


}
public class PetShop {
    private String nome;
    private String endereco;
    private Estoque estoque;
    //Construtor padrão
    public PetShop(String nome, String endereco, Estoque estoque) {
        this.nome = nome;
        this.endereco = endereco;
        this.estoque = estoque;
    }

    public void adicionarProduto(Produto produto){
        estoque.adicionarProduto(produto);
    }

    //Necessário implementar o código para calcular o faturamento
    public double calcularFaturamento() {
        return 0.0; // Retorno temporário
    }

    public Estoque getEstoque() {
        return estoque;
    }

    /*public Produto getProdutos() {



            for (Produto produto : produtos) {
                System.out.println();
            }


        return null;
    }*/

    //public void cadastrarProduto(Produto produto) {
    //  produtos.add(produto);
    //}

    //public void realizarVenda(Venda venda) {

    //}
}
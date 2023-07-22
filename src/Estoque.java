import java.util.Map;
import java.util.HashMap;


public class Estoque {
    //Map de produtos diponíveis no estoque
    private Map<Integer, Produto> produtos;

    //Construtor padrão
    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        //No map de produtos, adiciona o produto
        //E usa o código do produto como indice para o MAP.
        produtos.put(produto.getCodigo(), produto);
    }
    //Implementar o código para remover a um produto da lista
    public void removerProduto(Produto produto) {
        //Remove o produto por meio do seu indice
        produtos.remove(produto.getCodigo());
    }

    public void listarProdutos() {
        for (Produto produto : produtos.values()) {
            System.out.println(produto.getDescricao());
        }
    }

    //Listagem dos produtos por meio do map
    public Map<Integer, Produto> getProdutos() {
        return produtos;
    }

}

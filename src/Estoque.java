import java.util.ArrayList;
import java.util.List;

public class Estoque extends PetShop {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getDescricao());
        }
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}

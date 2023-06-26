import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criação do estoque do Petshop.
        Estoque estoquePetchoopp = new Estoque();

        //Criação de diversos produtos do PetShop.
        Produto produtos1 = new Produto(5998, "Ração para cachorro - KG", 25.75);
        Produto produtos2 = new Produto(4725, "Ração para gato - KG", 20.15);
        Produto produtos3 = new Produto(1932, "Brinquedo para cachorro", 30.50);
        Produto produtos4 = new Produto(4986, "Areia para gato", 22.60);
        Produto produtos5 = new Produto(7986, "Vacina para cachorro", 12.60);
        Produto produtos6 = new Produto(9652, "Vacina para gato", 11.60);

        //Incersao dos produtos no estoque
        estoquePetchoopp.adicionarProduto(produtos1);
        estoquePetchoopp.adicionarProduto(produtos2);
        estoquePetchoopp.adicionarProduto(produtos3);
        estoquePetchoopp.adicionarProduto(produtos4);
        estoquePetchoopp.adicionarProduto(produtos5);
        estoquePetchoopp.adicionarProduto(produtos6);

        //Criação do objeto Petshop com o nome "PetChopp"
        PetShop PetChopp = new PetShop("PetChopp", "Av. Nevaldo Rocha, 3775", estoquePetchoopp);

        //Exibição do menu do PetShop:
        System.out.println("================================================");
        System.out.println("Bem vindo ao sistema");
        System.out.println("================================================");

        System.out.println("Selecione uma opção");
        System.out.println("1 - Listar produtos");
        System.out.println("2 - Adicionar Produto");

        Scanner in = new Scanner(System.in);
        int escolha = Integer.parseInt(in.next());

        while (escolha != 0){
            System.out.println("Selecione uma opção");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Adicionar Produto");

            if(escolha == 1) {
                estoquePetchoopp.listarProdutos();
            }
        }

        PetChopp.adicionarProduto(new Produto(3581, "Brinquedo para gato", 13.25));




        /*
        //Cadastramento dos produtos no Petshop
            //O laço FOR percorre a quantidade de produtos e adiciona ao método cadastrarProduto
            //que contém um arraylist
        for(Produto produto : Produto){
            petchopp.cadastrarProduto(produto);
        }*/



    }
}
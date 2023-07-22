import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.*;

public class MainGUI extends JFrame {
    private PetShop petShop;
    private JTextArea outputArea;

    public MainGUI() {
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

        Cachorro cachorro = new Cachorro("Bethoveen", 5);
        Gato gato = new Gato("Garfield", 4);

        //Criação do objeto Petshop com o nome "PetChopp"
        //O último parametro é a inserção do estoque no PetShop
        PetShop PetChopp = new PetShop("PetChopp", "Av. Nevaldo Rocha, 3775", estoquePetchoopp);

        // Configuração da janela do menu do PetShop
        setTitle("PetShop Menu");
        setSize(400, 300); //A função recebe a largura e altura
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel para exibição de produtos e outras informações
        // Usando a classe outPutArea que recebe a quantidade de linhas e colunas
        // Ref. https://stackoverflow.com/questions/1870630/java-jtextarea-adding-a-newline
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Painel para os botões do menu
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());

        // Texto dos botões do menu
        JButton botaoListarProdutos = new JButton("Listar produtos");
        JButton botaoAdicionarProdutos = new JButton("Adicionar produto");
        JButton botaoSomAnimais = new JButton("Emitir som dos animais");

        // Adicionando ações aos botões
        botaoListarProdutos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estoquePetchoopp.listarProdutos();
            }
        });

        //Necessário adicionar as funções dos outros botões
        //botaoAdicionarProdutos
        //botaoSomAnimais

        // Adicionando botões ao painel do menu
        buttonPanel.add(botaoListarProdutos, BorderLayout.NORTH);
        buttonPanel.add(botaoAdicionarProdutos, BorderLayout.CENTER);
        buttonPanel.add(botaoSomAnimais, BorderLayout.SOUTH);

        // Adicionando componentes à janela
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);
    }

}
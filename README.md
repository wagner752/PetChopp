
Projeto de Linguagem de Programação II - PetShop
Este é um projeto desenvolvido como parte da disciplina de Linguagem de Programação II, ministrada pelo professor Francimar Carlos de Macedo na Universidade Federal do Rio Grande do Norte.

Descrição do Projeto
O projeto é um sistema básico de controle de um PetShop, onde é possível listar os produtos disponíveis no estoque, adicionar novos produtos ao estoque, e emitir sons de cachorro e gato.

O código foi implementado em Java, utilizando as bibliotecas java.awt e javax.swing para criar uma interface gráfica simples para interação com o usuário.

Funcionalidades
Listar produtos do estoque (Em implementação)
Adicionar novo produto ao estoque (Em implementação)
Emitir som de cachorro e gato (Em implementação)
Estrutura do Projeto (Em implementação)

O projeto é composto pelas seguintes classes:

Main: Classe principal contendo o método main, responsável por iniciar a aplicação e exibir o menu de interação com o usuário.
MainGUI: Classe que representa a interface gráfica da aplicação, exibindo os botões de interação e a lista de produtos.
PetShop: Classe que representa o PetShop, contendo informações como nome, endereço e estoque.
Estoque: Classe que representa o estoque do PetShop, contendo um Map para mapear os produtos por código.
Produto: Classe que representa um produto do PetShop, contendo código, descrição e preço.
Animal: Classe abstrata que representa um animal, com atributos compartilhados por Cachorro e Gato.
Cachorro: Classe que herda de Animal e representa um cachorro, com o método emitirSom() que exibe "Au au!".
Gato: Classe que herda de Animal e representa um gato, com o método emitirSom() que exibe "Miau!".
Executando o Projeto
Para executar o projeto, é necessário ter o ambiente de desenvolvimento Java instalado. O projeto foi desenvolvido utilizando o IntelliJ IDEA.

Clone o repositório para sua máquina local.
Abra o projeto no IntelliJ ou em sua IDE de preferência.
Execute a classe Main para iniciar a aplicação.
A interface gráfica será exibida, e você poderá interagir com os botões para listar produtos, adicionar produtos e emitir sons de cachorro e gato.
Contribuições

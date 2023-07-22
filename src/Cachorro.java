//Cachorro que herda os atributos de Animal
public class Cachorro extends Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    //Metodo emitir o som usado no main
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

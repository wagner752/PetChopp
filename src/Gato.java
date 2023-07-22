//Gato herda as informações de um Animal
public class Gato extends Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }
    //Metodo emitir som usado no main
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

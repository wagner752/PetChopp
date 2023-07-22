//Clase abstrata de Animal em que Cachorro e Gato herdam seus atributos
public abstract class Animal {
    private String nome;
    private  int idade;

    //Construtor padrão do animal, que onde cachorro e gato herdará
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

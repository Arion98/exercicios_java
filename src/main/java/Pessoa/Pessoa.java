package Pessoa;

public class Pessoa {
    String nome;

    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void saudacao() {
        System.out.println("Olá, " + nome + " você tem "+ idade +"anos" + "!");
    }
}

package Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa:");
        String nome = leia.nextLine();
        System.out.println("Digite a idade da pessoa:");
        int idade = leia.nextInt();
        Pessoa pessoa = new Pessoa(nome, idade);
        pessoa.saudacao();
    }
}

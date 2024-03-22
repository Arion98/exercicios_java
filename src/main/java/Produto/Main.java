package Produto;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Produto produto = new Produto("Celular", 1500.00, 5);
        double valorTotal = produto.calcularValorTotalEmEstoque();
        System.out.println("Valor total em estoque do produto " + produto.getNome() + ": R$" + valorTotal);
    }
}

package Retangulo;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        Retangulo retangulo = new Retangulo();
        Scanner leia = new Scanner(System.in);
        System.out.println("digite a altura");
        double altura = leia.nextDouble();
        System.out.println("digite a largura");
        double largura = leia.nextDouble();
        retangulo.calcularAreaRetangulo(altura, largura);
    }
}
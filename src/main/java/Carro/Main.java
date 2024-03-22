package Carro;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Carro carro = new Carro();
        Scanner leia = new Scanner(System.in);
        System.out.println("digite a marca do seu carro:");
        String marca = leia.nextLine();
        System.out.println("digite o modelo do seu veiculo:");
        String modelo = leia.nextLine();
        System.out.println("digite o ano do seu veiculo:");
        int ano = leia.nextInt();
        carro.infoModelCar(marca, modelo, ano);
    }
}

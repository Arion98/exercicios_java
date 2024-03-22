package ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta bancária para teste
        ContaBancaria conta = new ContaBancaria("jesli");

        // Depositando dinheiro na conta
        conta.depositar(1000);

        // Sacando dinheiro da conta
        conta.sacar(500);

        // Exibindo as informações da conta
        conta.exibirInformacoes();
    }
}


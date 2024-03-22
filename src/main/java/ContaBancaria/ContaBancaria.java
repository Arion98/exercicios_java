package ContaBancaria;

public class ContaBancaria {
    String titular;

    double saldo;

public  ContaBancaria( String titular){
    this.titular = titular;
    this.saldo = 0;
}

public void depositar (double valor){
    if (valor > 0 ){
        saldo += valor;
        System.out.println("Depósito de "+ valor +"realizado com sucesso");
    }else {
        System.out.println("valor inválido para depósito.");
    }
}

public  void sacar (double valor){
    if(valor > 0 && valor <= saldo){
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso.");
    }else {
        System.out.println("Saldo insuficiente para saque ou valor inválido.");
    }
}
public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}

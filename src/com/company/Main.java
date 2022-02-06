package com.company;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();        // Instanciando a Conta Corrente
        cc.depositar(100);        // Depositando 100 reias na Conta Corrente
        Conta poupanca = new ContaPoupanca();        // Instanciando a Conta Corrente
        cc.imprimirExtrato();        // Imprimindo extrato da Conta Corrente antes da transferência
        poupanca.imprimirExtrato();        // Imprimindo extrato da Poupança antes da transferência
        cc.transferir(100, poupanca);        // Transferindo 100 reais da Conta Corrente para Poupança
        cc.imprimirExtrato();        // Imprimindo extrato da Conta Corrente depois da transferência
        poupanca.imprimirExtrato();        // Imprimindo extrato da Poupança depois da transferência
        poupanca.simularRendimento(poupanca.getSaldo());        // Simulando rendimento da Poupança
    }
}

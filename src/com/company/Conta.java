package com.company;

import java.util.Scanner;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void imprimirInfosComuns(){
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void simularRendimento(double saldo){
        Scanner sc = new Scanner(System.in);
        int count =0;
        int meses;
        double taxaJuros = 0.005; // 0,5% ao mês
        double montante = saldo;
        System.out.print("Digite a quantidade de meses que deseja simular o rendimento: ");
        meses = sc.nextInt();
        while(count < meses){
            montante *= (1+taxaJuros);
            count++;
        }
        if (meses == 1)
            System.out.printf("Após "+meses+" mês você terá R$ "+"%.2f%n", montante);
        else
            System.out.printf("Após "+meses+" meses você terá R$ "+"%.2f%n", montante);

    }

}

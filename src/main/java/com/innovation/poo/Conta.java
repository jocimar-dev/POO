package com.innovation.poo;

/*
Abstração
*/

public class Conta  {

    double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void transfere(Conta destino, double valor) {
        this.saca(valor);
        destino.deposita(valor);
    }
    /*Abstracao*/
    public void imprimeExtrato() {
        System.out.println("Saldo: " + this.saldo);
    }
}

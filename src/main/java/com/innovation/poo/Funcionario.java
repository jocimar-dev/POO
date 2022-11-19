package com.innovation.poo;

/*Encapsulamento*/
public class Funcionario {

    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /*Heranca*/
    double calculaBonificacao() {
        return this.salario * 0.1;
    }
}

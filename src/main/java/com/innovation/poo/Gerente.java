package com.innovation.poo;

public class Gerente extends Funcionario {
    public String usuario;
    public String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    /*Heranca*/
    double calculaBonificacao() {
        return this.getSalario() * 0.5 + 100;
    }
}

package com.innovation.poo;

/*Encapsulamento*/
public class SalvaFuncionario extends Funcionario {

        public static void main(String[] args) {


            /*Abstracao*/
            Conta conta = new Conta();
            conta.setSaldo(1000);
            conta.saca(500);
            conta.deposita(50);
            conta.transfere(new Conta(), 200);
            conta.imprimeExtrato();
            System.out.println("--------------------------------------------------");

            /*Heranca, Encapsulamento e Abstracao*/
            Funcionario funcionario = new Funcionario();
            funcionario.setNome("João");
            funcionario.setSalario(1000.0);
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Bonificação.: "+funcionario.calculaBonificacao());
            System.out.println("--------------------------------------------------");

            Gerente gerente = new Gerente();
            gerente.setUsuario("Maria");
            gerente.setSenha("2000");
            System.out.println("Usuario: " + gerente.getUsuario());
            System.out.println("Senha: " + gerente.getSalario());
            System.out.println("Bonificação.: "+gerente.calculaBonificacao());
            System.out.println("--------------------------------------------------");

            Recepcao recepcao = new Recepcao();
            recepcao.setVisitante("Luana Brana");
            System.out.println("Visitante: " + recepcao.getVisitante());
            System.out.println("Ramal.: "+recepcao.getVisitante());
            System.out.println("Bonificação.: "+recepcao.calculaBonificacao());

            System.out.println("--------------------------------------------------");
        }


}

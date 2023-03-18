package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Conta;
import br.newtonpaiva.dominio.Pessoa;
import br.newtonpaiva.dominio.PessoaFisica;
import br.newtonpaiva.dominio.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
       Conta c = new Conta(200);
//       c.setNumero(10);
       c.setSaldo(100.0);

        c.depositar(50.0);
        //c.depositar(-20.0);

        System.out.println("O valor do seu saldo é : " + c.getSaldo());
        System.out.println("O número da sua conta é : " + c.getNumero());

        Conta c2 = new Conta(300, 500.0);
//        c2.setNumero(90);
//        c2.setSaldo(500.0);

        System.out.println("O valor do seu saldo é : " + c2.getSaldo());
        System.out.println("O número da sua conta é: " + c2.getNumero());

        Conta c3 = new Conta(20,100.0);
        c3.sacar(200.0);

//        if(c.equals(c2))
//            System.out.println("\nMesma conta");
//        else
//            System.out.println("\nContas diferentes");

        System.out.println((c.equals(c2)) ? ("\nMesma conta") : ("\nContas diferentes"));

        System.out.println("Você possui " + c.getSaldo() + " reais de saldo em sua conta");

        //Pessoa p = new Pessoa() {



            Pessoa pessoas[] = new Pessoa[4];
            pessoas[0] = new PessoaFisica();
            pessoas[1] = new PessoaJuridica();
            pessoas[2] = new PessoaJuridica();
            pessoas[3] = new PessoaFisica();

            for (Pessoa p : pessoas)
                p.validarDocumento();
        }
    }



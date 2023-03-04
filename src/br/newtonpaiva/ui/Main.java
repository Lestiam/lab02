package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Conta;

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
    }
}

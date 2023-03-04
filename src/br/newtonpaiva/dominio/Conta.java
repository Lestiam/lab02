package br.newtonpaiva.dominio;

import java.util.Objects;

public class Conta {
    private Integer numero;
    private Double saldo;

    //construtores
    public Conta(){
        this(null);
    }

    public Conta(Integer numero){
//        this.numero = numero;
//        this.saldo = 0.0;
        this(numero, 0.0);
    }

    public Conta(Integer numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double sacar (Double valor){
        if(valor == null || saldo <= 0)
            throw new IllegalArgumentException("Saldo insuficiente na conta");

        saldo -= valor;
        return saldo;
    }

    public Double depositar (Double valor){
        if (valor == null || valor <= 0)
            throw new IllegalArgumentException("Valor menor que zero");

        saldo += valor;
        return saldo;
    }

    public void transferir(Conta destino, Double valor){
        if(this.getSaldo() < valor)
            throw new IllegalArgumentException("Erro, saldo inválido");

        if(this.equals(destino))
            throw new IllegalArgumentException("Erro, não pode transferir para a mesma conta");

        this.sacar(valor);
        destino.depositar(valor);
    }


    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        if(numero == null || numero < 0)
            throw new IllegalArgumentException("Erro, número inválido");

        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
    //comparação de uma classe conta com outra calsse conta do sistema

//alt + insert -> equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}

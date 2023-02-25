package br.newtonpaiva.dominio;

public class Conta {
    private Integer numero;
    private Double saldo;

    public Double sacar (Double valor){
        return 0.0;
    }

    public Double depositar (Double valor){
        if (valor == null || valor <= 0)
            throw new IllegalArgumentException("Valor menor que zero");
        saldo += valor;
        return saldo;
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
}

package br.com.controle;

//@author emanuelly
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public double calcularRendimento() {
        return this.taxaRendimento;
    }
}

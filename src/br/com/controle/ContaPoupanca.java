package br.com.controle;

//@author emanuelly
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    
    public double calcularRendimento() {
        return this.taxaRendimento;
    }
}

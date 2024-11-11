package br.com.controle;

import java.sql.Date;

public class ContaCorrente extends Conta {
    private double limite;
    private Date dataVencimento;

    public double consultarLimite() {
        Date atual = new Date(System.currentTimeMillis());

        if (atual.before(dataVencimento)) {
            return this.limite;
        } else {
            return 0;
        }
    }
}

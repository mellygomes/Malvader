package br.com.controle;

//@author emanuelly

import br.com.entidade.ContaDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends Usuario {
	
    private String senha_cliente;

    public String getSenha_cliente() {
        return senha_cliente;
    }

    public void setSenha_cliente(String senha_cliente) {
        this.senha_cliente = senha_cliente;
    }

    //métodos
    public double consultarSaldo() {
        double saldo = 0;
        
        try {
            Conta conta = ContaDAO.findByClienteId(this.getId_usuario());
            if (conta instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) conta;
                saldo = cc.getSaldo_conta();
            } else if (conta instanceof ContaPoupanca) {
                ContaPoupanca cp = (ContaPoupanca) conta;
                saldo = cp.getSaldo_conta();
            }
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return saldo;
    }

    public void depositar(double valor) {

    }

    public boolean sacar(double valor) {
        return false;
    }

    public String consultarExtrato() {
        return "";
    }

    public double consultarLimite() {
        return 0;
    }	
}

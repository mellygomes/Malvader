package br.com.controle;

//@author emanuelly
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
        return 0;
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

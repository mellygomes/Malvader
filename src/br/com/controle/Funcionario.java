package br.com.controle;

//@author emanuelly

import br.com.entidade.ContaDAO;
import br.com.entidade.FuncionarioDAO;

public class Funcionario extends Usuario {
    private String codigoFuncionario;
    private String cargo;
    private String senha_funcionario;

    //métodos getters e setters
    public String getCodigo_funcionario() {
        return codigoFuncionario;
    }

    public void setCodigo_funcionario(String codigo) {
        this.codigoFuncionario = codigo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha_funcionario() {
        return senha_funcionario;
    }

    public void setSenha_funcionario(String senha_funcionario) {
        this.senha_funcionario = senha_funcionario;
    }

    //métodos 
    public void abrirConta(Conta conta) {
        ContaDAO.save(conta);
    }

    public void encerrarConta(Conta conta) {

    }

    public Conta consultarDadosConta(int numeroConta) throws Exception {
        return ContaDAO.findByNumero(numeroConta);
    }

    public Cliente consultarDadosCliente(int idCliente) {
        return null;
    }

    public void alterarDadosConta(Conta conta) {

    }

    public void alterarDadosCliente(Cliente cliente) {

    }

    public void cadastrarFuncionario(Funcionario funcionario) throws Exception {
        FuncionarioDAO.save(funcionario);
        
    }

    public void gerarRelatorioMovimentacao() {
        
    }
}

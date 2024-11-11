package br.com.controle;

import java.time.LocalDateTime;
import java.util.List;

//@author emanuelly
public class Relatorio {
    private String tipo;
    private LocalDateTime dataGeracao;
    private List<String> dados;

    //métodos getters e setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDateTime dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public List<String> getDados() {
        return dados;
    }

    public void setDados(List<String> dados) {
        this.dados = dados;
    }

    public void gerarRelatorioGeral() {
            //implementar
    }

    public void exportarParaExcel() {
            //implementar
    }
}

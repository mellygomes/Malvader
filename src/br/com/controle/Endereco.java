package br.com.controle;

//@author emanuelly
public class Endereco extends Cliente{
    String cep;
    String local;
    int numeroCasa;
    String bairro;
    String cidade;
    String uf;
    String endereco;
    public String getCep() {
            return cep;	
    }
    public void setCep(String cep) {
            this.cep = cep;
    }
    public String getLocal() {
            return local;
    }
    public void setLocal(String local) {
            this.local = local;
    }
    public int getNumeroCasa() {
            return numeroCasa;
    }
    public void setNumeroCasa(int numeroCasa) {
            this.numeroCasa = numeroCasa;
    }
    public String getBairro() {
            return bairro;
    }
    public void setBairro(String bairro) {
            this.bairro = bairro;
    }
    public String getCidade() {
            return cidade;
    }
    public void setCidade(String cidade) {
            this.cidade = cidade;
    }
    public String getUf() {
            return uf;
    }
    public void setUf(String uf) {
            this.uf = uf;
    }

    public String getEndereco(String text) {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}

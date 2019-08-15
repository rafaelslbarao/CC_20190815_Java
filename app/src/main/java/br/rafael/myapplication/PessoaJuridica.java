package br.rafael.myapplication;

public class PessoaJuridica extends Pessoa implements MinhaDivulgacao {

    private int cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, int codigo) {
        super(nome, codigo);
    }

    public PessoaJuridica(String nome, int codigo, int cnpj) {
        super(nome, codigo);
        this.cnpj = cnpj;
    }

    @Override
    public String getTipoPessoa() {
        return "PESSOA JURIDICA";
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public int getCodigo() {
        return cnpj;
    }

    @Override
    public String getDescricao() {
        return "Olá eu sou uma pessoa jurídica " + getNome() + " com cpnj " + cnpj;
    }
}

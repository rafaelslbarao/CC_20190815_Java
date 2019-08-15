package br.rafael.myapplication;

public class PessoaFisica extends Pessoa implements MinhaDivulgacao {

    private int cpf;

    public PessoaFisica(String nome, int codigo) {
        super(nome, codigo);
    }

    public PessoaFisica(String nome, int codigo, int cpf) {
        super(nome, codigo);
        this.cpf = cpf;
    }

    public String getTipoPessoa()
    {
        return "PESSOA FISICA";
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getCodigo()
    {
        return cpf;
    }

    @Override
    public String getDescricao() {
        return "Olá eu sou uma pessoa física " + getNome() + " com cpf " + cpf;
    }
}

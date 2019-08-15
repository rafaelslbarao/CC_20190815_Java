package br.rafael.myapplication;

public abstract class Pessoa {
    public static final int CODIGO_INICIAL = 1;

    private String nome;
    private int codigo;

    public Pessoa() {
    }

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = Integer.parseInt(codigo);
    }

    public abstract String getTipoPessoa();
}

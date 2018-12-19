package br.com.wmsistema.sistemaParaSalaoDeBeleza.enums;

public enum TipoPessoa {

    CLIENTE("CLI"),
    FORNECEDOR("FOR"),
    FUNCIONARIO("FUN");

    private String valor;

    TipoPessoa(String tipo) {
        this.valor = tipo;
    }

    public String getValor() {
        return valor;
    }
}

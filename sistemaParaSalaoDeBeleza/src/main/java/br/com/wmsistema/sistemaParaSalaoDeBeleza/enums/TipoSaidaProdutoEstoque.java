package br.com.wmsistema.sistemaParaSalaoDeBeleza.enums;

public enum TipoSaidaProdutoEstoque {

    SAIDA_VENDA("Saída venda de produto"),
    SAIDA_USOP_CLIENTE("Saída por uso em procedimento");

    private String valor;
    TipoSaidaProdutoEstoque(String s) {
        this.valor = s;
    }

    public String getValor() {
        return valor;
    }
}

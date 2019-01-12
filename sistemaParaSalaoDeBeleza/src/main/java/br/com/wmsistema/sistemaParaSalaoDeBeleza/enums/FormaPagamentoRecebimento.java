package br.com.wmsistema.sistemaParaSalaoDeBeleza.enums;

public enum FormaPagamentoRecebimento {

    DINHEIRO("Dinheiro"),
    CHEQUE("Cheque"),
    CARTAO_DEBITO("Cartão de Débito"),
    CARTTAO_CREDITO("Cartão de Crédito");

    FormaPagamentoRecebimento(String s) {
        this.valor = s;
    }

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

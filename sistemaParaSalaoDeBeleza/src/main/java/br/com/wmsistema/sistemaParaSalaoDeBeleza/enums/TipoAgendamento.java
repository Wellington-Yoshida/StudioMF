package br.com.wmsistema.sistemaParaSalaoDeBeleza.enums;

public enum TipoAgendamento {

    AGENDAMENTO("AGE"),
    AGENDAMENTO_COMANDA("COM");

    TipoAgendamento(String tipo) {
        this.valor = tipo;
    }

    private String valor;

    public String getValor() {
        return valor;
    }
}

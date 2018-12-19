package br.com.wmsistema.sistemaParaSalaoDeBeleza.enums;

public enum TipoAutorizacao {
    
    ADMINISTRADO("Administrado"),
    APENAS_CONSULTA("Apenas consulta"),
    AGENDAMENTO("Pode realizar agendamento e editar"),
    CONSULTA_COMISSAO("Consulta de comissão"),
    CANCELAR_COMANDA("Permissão para cancelar comanda");

    private String valor;

    TipoAutorizacao(String s) {
        this.valor = s;
    }

    public String getValor() {
        return valor;
    }
}

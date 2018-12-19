package br.com.wmsistema.sistemaParaSalaoDeBeleza.enums;

public enum TipoProfissionalServico {

    CABELEREIRA("cabelereira(o)"),
    MANICURI("manicuri"),
    MAQUIADORA("maquiadora"),
    AUXILIAR("auxiliar");

    private String valor;
    TipoProfissionalServico(String s) {
        this.valor = s;
    }

    public String getValor() {
        return valor;
    }
}

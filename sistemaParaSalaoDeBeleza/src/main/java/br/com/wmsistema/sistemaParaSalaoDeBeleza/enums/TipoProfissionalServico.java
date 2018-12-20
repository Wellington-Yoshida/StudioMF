package br.com.wmsistema.sistemaParaSalaoDeBeleza.enums;

public enum TipoProfissionalServico {

    CABELEREIRA("cabelereira(o)"),
    MANICURI("manicuri"),
    MAQUIADORA("maquiadora"),
    AUXILIAR("auxiliar"),
    ESTETICISTA("esteticista"),
    BARBEIRO("barbeiro"),
    RECEPCIONISTA("recepcionista"),
    SERVICOS_GERAIIS("serviços gerais"),
    AUMOXARIFADO("almoxarifado"),
    GERENTE("gerente"),
    DESIGN_UNHAS("design de unhas"),
    DESIGN_SOBRANCELHA("design de sibrancelhas"),
    MASSAGISTA("massagista"),
    PODOLODA("podologa");

    private String valor;
    TipoProfissionalServico(String s) {
        this.valor = s;
    }

    public String getValor() {
        return valor;
    }
}

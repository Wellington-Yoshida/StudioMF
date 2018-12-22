package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;

public abstract class AbstractClassUtils {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agenda_id;

    @ManyToOne
    @JoinColumn(name = "usuarioEmpresa_Id")
    private UsuarioEmpresa usuarioEmpresa;

    public Long getAgenda_id() {
        return agenda_id;
    }

    public void setAgenda_id(Long agenda_id) {
        this.agenda_id = agenda_id;
    }

    public UsuarioEmpresa getUsuarioEmpresa() {
        return usuarioEmpresa;
    }

    public void setUsuarioEmpresa(UsuarioEmpresa usuarioEmpresa) {
        this.usuarioEmpresa = usuarioEmpresa;
    }
}

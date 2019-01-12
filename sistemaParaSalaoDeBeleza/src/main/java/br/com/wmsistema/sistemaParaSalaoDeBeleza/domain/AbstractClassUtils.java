package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Empresa.UsuarioEmpresa;

import javax.persistence.*;

public abstract class AbstractClassUtils {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuarioEmpresa_Id")
    private UsuarioEmpresa usuarioEmpresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioEmpresa getUsuarioEmpresa() {
        return usuarioEmpresa;
    }

    public void setUsuarioEmpresa(UsuarioEmpresa usuarioEmpresa) {
        this.usuarioEmpresa = usuarioEmpresa;
    }
}

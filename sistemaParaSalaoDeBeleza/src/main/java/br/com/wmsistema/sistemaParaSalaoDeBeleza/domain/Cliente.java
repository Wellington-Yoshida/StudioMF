package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@DiscriminatorValue(value = "CLI")
public class Cliente extends Pessoa implements Serializable {

    @Column(name = "OBSERVACAO")
    private String observacao;

    @Column(name = "CPF")
    private String cpf;

    @ManyToMany
    @JoinTable(name="CLIENTE_SERVICO",
            joinColumns=
            @JoinColumn(name="ClieServicoId", referencedColumnName="pessoa_Id"),
            inverseJoinColumns=
            @JoinColumn(name="ServClienteId", referencedColumnName="servico_Id")
    )
    private List<Servico> servicos;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }
}

package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "CLI")
public class Cliente extends Pessoa implements Serializable {

    @Column(name = "OBSERVACAO")
    private String observacao;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "DATA_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}

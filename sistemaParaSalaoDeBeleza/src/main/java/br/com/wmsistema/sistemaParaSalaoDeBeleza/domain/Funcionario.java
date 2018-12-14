package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.TipoProfissionalServico;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue(value = "FUN")
public class Funcionario extends Pessoa implements Serializable {

    @Column(name = "CARGO")
    private String cargo;

    @Column(name = "DATA_ENTRADA")
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;

    @Column(name = "DATA_SAIDA")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;

    @ManyToMany
    @JoinTable(name="FUNCIONARIO_SERVICO",
            joinColumns=
            @JoinColumn(name="funcServicoId", referencedColumnName="pessoa_Id"),
            inverseJoinColumns=
            @JoinColumn(name="ServFuncionarioId", referencedColumnName="servico_Id")
    )
    private List<Servico> servicos;

    @Enumerated(EnumType.STRING)
    private TipoProfissionalServico tipoProfissionalServico;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public TipoProfissionalServico getTipoProfissionalServico() {
        return tipoProfissionalServico;
    }

    public void setTipoProfissionalServico(TipoProfissionalServico tipoProfissionalServico) {
        this.tipoProfissionalServico = tipoProfissionalServico;
    }
}

package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.TipoAutorizacao;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.TipoProfissionalServico;
import sun.security.util.Password;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue(value = "FUN")
public class Funcionario extends Pessoa implements Serializable {

    @Column(name = "CARGO")
    private String cargo;

    @Column(name = "SENHA")
    private Password senha;

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

    @Enumerated(EnumType.STRING)
    private TipoAutorizacao tipoAutorizacao;

    @Column(name = "PORCENTAGEM_COMISSAO")
    private Double porcentagemComissao;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Agenda> agendas;

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

    public Password getSenha() {
        return senha;
    }

    public void setSenha(Password senha) {
        this.senha = senha;
    }

    public TipoAutorizacao getTipoAutorizacao() {
        return tipoAutorizacao;
    }

    public void setTipoAutorizacao(TipoAutorizacao tipoAutorizacao) {
        this.tipoAutorizacao = tipoAutorizacao;
    }

    public Double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(Double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    public List<Agenda> getAgendas() {
        return agendas;
    }

    public void setAgendas(List<Agenda> agendas) {
        this.agendas = agendas;
    }
}

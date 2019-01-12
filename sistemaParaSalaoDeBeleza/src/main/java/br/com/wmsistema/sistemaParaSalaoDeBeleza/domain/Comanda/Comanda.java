package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Comanda;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.AbstractClassUtils;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Agenda.Agendamento;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Pessoa.Cliente;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Pessoa.Funcionario;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Servico.Servico;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "COMANDA")
public class Comanda extends AbstractClassUtils implements Serializable {

    @OneToOne(mappedBy = "comanda")
    private Cliente cliente;

    @ManyToMany
    @JoinTable(name="COMANDA_FUNCIONARIO",
            joinColumns=
            @JoinColumn(name="comandaFuncionarioId", referencedColumnName="pessoa_Id"),
            inverseJoinColumns=
            @JoinColumn(name="servicoComandaId", referencedColumnName="servico_Id")
    )
    private List<Funcionario> funcionarios;

    @ManyToMany
    @JoinTable(name="COMANDA_SERVICO",
            joinColumns=
            @JoinColumn(name="comandaServicoId", referencedColumnName="comanda_Id"),
            inverseJoinColumns=
            @JoinColumn(name="servicoComandaId", referencedColumnName="servico_Id")
    )
    private List<Servico> servicos;

    @Column(name = "VALOR_TOTAL_COMANDA", precision = 18, scale = 2)
    private Double valorTotalComanda;

    @Column(name = "DESCONTO", precision = 18, scale = 2)
    private Double desconto;

    @OneToMany(mappedBy = "comanda", cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public Double getValorTotalComanda() {
        return valorTotalComanda;
    }

    public void setValorTotalComanda(Double valorTotalComanda) {
        this.valorTotalComanda = valorTotalComanda;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }
}


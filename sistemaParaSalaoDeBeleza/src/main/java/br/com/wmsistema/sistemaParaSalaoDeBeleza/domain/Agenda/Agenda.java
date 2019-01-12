package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Agenda;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.AbstractClassUtils;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Pessoa.Funcionario;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "AGENDA")
public class Agenda extends AbstractClassUtils implements Serializable {

    @Column(name = "DATA_AGENDA")
    @Temporal(TemporalType.DATE)
    private Date dataAgenda;

    @OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;

    @ManyToOne
    @JoinColumn(name = "funcionario_Id")
    private Funcionario funcionario;

    public Date getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(Date dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}

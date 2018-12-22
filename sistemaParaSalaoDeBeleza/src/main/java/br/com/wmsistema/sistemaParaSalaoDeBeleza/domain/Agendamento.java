package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.TipoAgendamento;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento extends AbstractClassUtils implements Serializable {

    @Column(name = "HORARIO_AGENDAMENTO")
    @Temporal(TemporalType.TIME)
    private Date horarioDoAgendamento;

    @ManyToOne
    @JoinColumn(name = "comanda_Id")
    private Comanda comanda;

    @ManyToOne
    @JoinColumn(name = "agenda_Id")
    private Agenda agenda;

    @Enumerated(EnumType.STRING)
    private TipoAgendamento tipoAgendamento;

    public Date getHorarioDoAgendamento() {
        return horarioDoAgendamento;
    }

    public void setHorarioDoAgendamento(Date horarioDoAgendamento) {
        this.horarioDoAgendamento = horarioDoAgendamento;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public TipoAgendamento getTipoAgendamento() {
        return tipoAgendamento;
    }

    public void setTipoAgendamento(TipoAgendamento tipoAgendamento) {
        this.tipoAgendamento = tipoAgendamento;
    }
}

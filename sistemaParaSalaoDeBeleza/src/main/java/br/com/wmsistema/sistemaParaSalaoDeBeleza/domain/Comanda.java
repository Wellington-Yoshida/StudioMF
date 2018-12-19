package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "COMANDA")
public class Comanda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comanda_id;

    @OneToOne(mappedBy = "comanda")
    private Cliente cliente;

    @Column(name = "DATA")
    @Temporal(TemporalType.DATE)
    private Date data;

    @ManyToMany
    @JoinTable(name="COMANDA_FUNCIONARIO",
            joinColumns=
            @JoinColumn(name="comandaFuncionarioId", referencedColumnName="pessoa_Id"),
            inverseJoinColumns=
            @JoinColumn(name="servicoComandaId", referencedColumnName="servico_Id")
    )
    private List<Funcionario> funcionarios;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(name="COMANDA_SERVICO",
            joinColumns=
            @JoinColumn(name="comandaServicoId", referencedColumnName="comanda_Id"),
            inverseJoinColumns=
            @JoinColumn(name="servicoComandaId", referencedColumnName="servico_Id")
    )
    private List<Servico> servicos;
}

package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.TipoProfissionalServico;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "SERVICO")
public class Servico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long servico_Id;

    @Column(name = "NOME")
    @NotNull(message = "Codigo é obrigatório")
    private String nome;

    @Column(name = "TEMPO_DURACAO_SERVICO")
    private String tempoDuracaoServico;

//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servicos")
//    private List<Cliente> clientes;
//
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servicos")
//    private List<Funcionario> funcionarios;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    private List<TipoProfissionalServico> tipoProfissionalServicos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempoDuracaoServico() {
        return tempoDuracaoServico;
    }

    public void setTempoDuracaoServico(String tempoDuracaoServico) {
        this.tempoDuracaoServico = tempoDuracaoServico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<TipoProfissionalServico> getTipoProfissionalServicos() {
        return tipoProfissionalServicos;
    }

    public void setTipoProfissionalServicos(List<TipoProfissionalServico> tipoProfissionalServicos) {
        this.tipoProfissionalServicos = tipoProfissionalServicos;
    }
}

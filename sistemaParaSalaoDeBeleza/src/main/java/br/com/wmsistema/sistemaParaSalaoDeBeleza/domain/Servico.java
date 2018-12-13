package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servicos")
    private List<Cliente> clientes;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "servicos")
    private List<Funcionario> funcionarios;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getTempoDuracaoServico() {
        return tempoDuracaoServico;
    }

    public void setTempoDuracaoServico(String tempoDuracaoServico) {
        this.tempoDuracaoServico = tempoDuracaoServico;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

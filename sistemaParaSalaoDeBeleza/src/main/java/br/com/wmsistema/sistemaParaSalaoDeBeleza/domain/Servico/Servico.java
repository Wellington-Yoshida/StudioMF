package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Servico;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Empresa.UsuarioEmpresa;
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

    @ManyToOne
    @JoinColumn(name = "usuarioEmpresa_Id")
    private UsuarioEmpresa usuarioEmpresa;

    @Enumerated(EnumType.STRING)
    private List<TipoProfissionalServico> tipoProfissionalServicos;

    @Column(name = "VALOR_SERVICO", precision = 18, scale = 2)
    private Double valorServico;

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

    public UsuarioEmpresa getUsuarioEmpresa() {
        return usuarioEmpresa;
    }

    public void setUsuarioEmpresa(UsuarioEmpresa usuarioEmpresa) {
        this.usuarioEmpresa = usuarioEmpresa;
    }

    public List<TipoProfissionalServico> getTipoProfissionalServicos() {
        return tipoProfissionalServicos;
    }

    public void setTipoProfissionalServicos(List<TipoProfissionalServico> tipoProfissionalServicos) {
        this.tipoProfissionalServicos = tipoProfissionalServicos;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }
}

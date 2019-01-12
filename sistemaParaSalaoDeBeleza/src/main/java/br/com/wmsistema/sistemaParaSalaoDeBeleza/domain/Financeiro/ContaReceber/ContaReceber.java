package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Financeiro.ContaReceber;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.AbstractClassUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CONTA_RECEBER")
public class ContaReceber  extends AbstractClassUtils implements Serializable {

    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;

    @Column(name = "DATA_VENCIMENTO")
    private Date dataVencimento;

    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;

    @Column(name = "VALOR_DESCONTO")
    private Double valorDesconto;

    @Column(name = "QUANTIDADE_PARCELA")
    private Integer quantidadeParcela;

    @Column(name = "NUMERO_DOCUMENTO_ORIGEM")
    private Double numeroDocumentoOrigem;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @OneToMany(mappedBy = "contaReceber", cascade = CascadeType.ALL)
    private List<ContaReceberItem> contaReceberItems;

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Integer getQuantidadeParcela() {
        return quantidadeParcela;
    }

    public void setQuantidadeParcela(Integer quantidadeParcela) {
        this.quantidadeParcela = quantidadeParcela;
    }

    public Double getNumeroDocumentoOrigem() {
        return numeroDocumentoOrigem;
    }

    public void setNumeroDocumentoOrigem(Double numeroDocumentoOrigem) {
        this.numeroDocumentoOrigem = numeroDocumentoOrigem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<ContaReceberItem> getContaReceberItems() {
        return contaReceberItems;
    }

    public void setContaReceberItems(List<ContaReceberItem> contaReceberItems) {
        this.contaReceberItems = contaReceberItems;
    }
}

package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Financeiro.ContaPagar;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.AbstractClassUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CONTA_PAGAR")
public class ContaPagar extends AbstractClassUtils implements Serializable {

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "TIPO_DESPESA")
    private String tipoDespesa;

    @Column(name = "VENCIMENTO")
    private Date vencimento;

    @Column(name = "DATA_CADASTRO")
    private Date dataCadastro;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @Column(name = "VALOR_TOTAL")
    private Double valorTotal;

    @Column(name = "QUANTIDADE_PARCELA")
    private Integer quantidadeParcela;

    @OneToMany(mappedBy = "contaPagar", cascade = CascadeType.ALL)
    private List<ContaPagarItem> contaPagarItemList;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getQuantidadeParcela() {
        return quantidadeParcela;
    }

    public void setQuantidadeParcela(Integer quantidadeParcela) {
        this.quantidadeParcela = quantidadeParcela;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<ContaPagarItem> getContaPagarItemList() {
        return contaPagarItemList;
    }

    public void setContaPagarItemList(List<ContaPagarItem> contaPagarItemList) {
        this.contaPagarItemList = contaPagarItemList;
    }
}

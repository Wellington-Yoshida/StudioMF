package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Financeiro.ContaPagar;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.AbstractClassUtils;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.FormaPagamentoRecebimento;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CONTA_PAGAR_ITEM")
public class ContaPagarItem extends AbstractClassUtils implements Serializable {

    @Column(name = "valorParcela")
    private Double valorParcela;

    @Column(name = "DATA_PAGAMENTO")
    private Date dataPagamento;

    @ManyToOne
    @JoinColumn(name = "contaPagar_Id")
    private ContaPagar contaPagar;

    @Enumerated(EnumType.STRING)
    @Column(name = "FORMA_PAGAMENTO")
    private FormaPagamentoRecebimento formaPagamento;

    @Column(name = "NUMERO_PARCELA")
    private Date numeroParcela;

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public ContaPagar getContaPagar() {
        return contaPagar;
    }

    public void setContaPagar(ContaPagar contaPagar) {
        this.contaPagar = contaPagar;
    }

    public FormaPagamentoRecebimento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentoRecebimento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Date getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Date numeroParcela) {
        this.numeroParcela = numeroParcela;
    }
}

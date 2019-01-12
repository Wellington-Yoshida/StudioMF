package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Financeiro.ContaReceber;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.AbstractClassUtils;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.FormaPagamentoRecebimento;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CONTA_RECEBER_ITEM")
public class ContaReceberItem extends AbstractClassUtils implements Serializable {

    @ManyToOne
    @JoinColumn(name = "contaReceber_id")
    private ContaReceber contaReceber;

    @Column(name = "valorParcela")
    private Double valorParcela;

    @Column(name = "DATA_PAGAMENTO")
    private Date dataPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "FORMA_RECEBIMENTO")
    private FormaPagamentoRecebimento formaRecebimento;

    @Column(name = "NUMERO_PARCELA")
    private Date numeroParcela;

    public ContaReceber getContaReceber() {
        return contaReceber;
    }

    public void setContaReceber(ContaReceber contaReceber) {
        this.contaReceber = contaReceber;
    }

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

    public FormaPagamentoRecebimento getFormaRecebimento() {
        return formaRecebimento;
    }

    public void setFormaRecebimento(FormaPagamentoRecebimento formaRecebimento) {
        this.formaRecebimento = formaRecebimento;
    }

    public Date getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Date numeroParcela) {
        this.numeroParcela = numeroParcela;
    }
}

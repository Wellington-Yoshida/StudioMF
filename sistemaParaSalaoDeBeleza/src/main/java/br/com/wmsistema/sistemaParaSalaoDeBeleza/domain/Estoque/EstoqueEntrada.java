package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Estoque;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.AbstractClassUtils;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Produto.Produto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ESTOQUE_ENTRADA")
public class EstoqueEntrada extends AbstractClassUtils implements Serializable {

    @OneToOne(mappedBy = "estoqueEntrada")
    private Produto produto;

    @Column(name = "QUANTIDADE")
    private Long quantidade;

    @Column(name = "DATA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;

    @Column(name = "VALOR_PAGO", precision = 18, scale = 2)
    private Double valorPago;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

}

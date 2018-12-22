package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.TipoSaidaProdutoEstoque;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue(value = "SAI")
public class EstoqueSaida extends Estoque {

    @OneToOne(mappedBy = "estoqueSaida")
    private Produto produto;

    @Column(name = "QUANTIDADE")
    private Long quantidade;

    @Column(name = "DATA_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaida;

    @Column(name = "VALOR_PAGO", precision = 18, scale = 2)
    private Double valorVenda;

    @Enumerated(EnumType.STRING)
    private TipoSaidaProdutoEstoque tipoSaidaProdutoEstoque;

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

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public TipoSaidaProdutoEstoque getTipoSaidaProdutoEstoque() {
        return tipoSaidaProdutoEstoque;
    }

    public void setTipoSaidaProdutoEstoque(TipoSaidaProdutoEstoque tipoSaidaProdutoEstoque) {
        this.tipoSaidaProdutoEstoque = tipoSaidaProdutoEstoque;
    }
}

package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ESTOQUE_ENTRADA")
public class EstoqueEntrada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estoqueEntrada_id;

    @OneToOne(mappedBy = "estoqueEntrada")
    private Produto produto;

    @Column(name = "QUANTIDADE")
    private Long quantidade;

    @Column(name = "DATA_ENTRADA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;

    @Column(name = "VALOR_PAGO", precision = 18, scale = 2)
    private Double valorPago;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

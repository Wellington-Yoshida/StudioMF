package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long produto_id;

    @Column(name = "NOME_PRODUTO")
    private String nomeProduto;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "MEDIDA")
    private Double medida;

    @Column(name = "QUANTIDADE")
    private Long quantidade;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @Column(name = "VALOR_PRODUTO", precision = 18, scale = 2)
    private Double valorProduto;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getMedida() {
        return medida;
    }

    public void setMedida(Double medida) {
        this.medida = medida;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

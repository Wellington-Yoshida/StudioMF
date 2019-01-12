package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Produto;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Empresa.UsuarioEmpresa;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Estoque.Estoque;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Pessoa.Fornecedor;

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
    @JoinColumn(name = "usuarioEmpresa_Id")
    private Fornecedor fornecedor;

    @Column(name = "VALOR_PRODUTO", precision = 18, scale = 2)
    private Double valorProduto;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEmpresa usuarioEmpresa;

    @ManyToOne
    @JoinColumn(name = "estoque_Id")
    private Estoque estoque;

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

    public UsuarioEmpresa getUsuarioEmpresa() {
        return usuarioEmpresa;
    }

    public void setUsuarioEmpresa(UsuarioEmpresa usuarioEmpresa) {
        this.usuarioEmpresa = usuarioEmpresa;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
}

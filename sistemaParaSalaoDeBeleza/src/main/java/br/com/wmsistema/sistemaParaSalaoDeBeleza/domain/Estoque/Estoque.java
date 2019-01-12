package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Estoque;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.AbstractClassUtils;
import br.com.wmsistema.sistemaParaSalaoDeBeleza.domain.Produto.Produto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ESTOQUE")
public class Estoque extends AbstractClassUtils implements Serializable {

    @OneToMany(mappedBy = "estoque", cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}

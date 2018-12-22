package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EMPRESA")
public class Empresa extends UsuarioEmpresa implements Serializable {

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "ENDERECO")
    private String Endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
}

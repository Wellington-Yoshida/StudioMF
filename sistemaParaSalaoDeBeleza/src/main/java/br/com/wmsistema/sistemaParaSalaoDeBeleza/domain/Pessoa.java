package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import br.com.wmsistema.sistemaParaSalaoDeBeleza.enums.TipoPessoa;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 3, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("PES")
public abstract class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pessoa_Id;

    @Column(name = "NOME")
    @NotNull(message = "Codigo é obrigatório")
    private String nome;

    @Column(name = "EMAIL")
    @Email(message = "Email deve ser válido")
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "CELULAR_2")
    private String celular2;

    @Enumerated(EnumType.STRING)
    @Column(insertable=false, updatable=false)
    private TipoPessoa tipo;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

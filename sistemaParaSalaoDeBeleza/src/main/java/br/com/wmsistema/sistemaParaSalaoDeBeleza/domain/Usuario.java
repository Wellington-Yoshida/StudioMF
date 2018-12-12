package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name = "USUARIO" )
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "EMAIL")
    @NotNull(message = "Codigo é obrigatório")
    @Email(message = "Email deve ser válido")
    private String email;

    @Column(name = "SENHA")
    @NotNull(message = "Codigo é obrigatório")
    @Min(value = 4, message = "Senha deve ter no mínimo 4 digitos")
    private String senha;

    @Column(name = "NOME_SALAO")
    @NotNull(message = "Codigo é obrigatório")
    private String nomeSalao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "usuario")
    private List<Funcionario> funcionarios;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeSalao() {
        return nomeSalao;
    }

    public void setNomeSalao(String nomeSalao) {
        this.nomeSalao = nomeSalao;
    }
}

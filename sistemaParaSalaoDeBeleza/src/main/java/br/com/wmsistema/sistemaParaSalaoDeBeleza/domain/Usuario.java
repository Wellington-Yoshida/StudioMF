package br.com.wmsistema.sistemaParaSalaoDeBeleza.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table( name = "USUARIO" )
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Codigo é obrigatório")
    @Email(message = "Email deve ser válido")
    private String email;

    @NotNull(message = "Codigo é obrigatório")
    @Min(value = 4, message = "Senha deve ter no mínimo 4 digitos")
    private String senha;

    @NotNull(message = "Codigo é obrigatório")
    private String nomeSalao;

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

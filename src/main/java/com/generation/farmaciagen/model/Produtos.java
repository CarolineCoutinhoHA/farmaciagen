package com.generation.farmaciagen.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O Atributo nome é Obrigatório!")
    @Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
    private String nome;

    @NotBlank(message = "O atributo descrição é Obrigatório!")
    @Size(min = 10, max = 1000, message = "O atributo descrição deve conter no mínimo 10 e no máximo 1000 caracteres")
    private String descricao;

    @NotBlank(message = "O atributo validade é Obrigatório!")
    private LocalDate validade;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O Atributo nome é Obrigatório!") @Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O Atributo nome é Obrigatório!") @Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O atributo descrição é Obrigatório!") @Size(min = 10, max = 1000, message = "O atributo descrição deve conter no mínimo 10 e no máximo 1000 caracteres") String getDescricao() {
        return descricao;
    }

    public void setDescricao(@NotBlank(message = "O atributo descrição é Obrigatório!") @Size(min = 10, max = 1000, message = "O atributo descrição deve conter no mínimo 10 e no máximo 1000 caracteres") String descricao) {
        this.descricao = descricao;
    }

    public @NotBlank(message = "O atributo validade é Obrigatório!") LocalDate getValidade() {
        return validade;
    }

    public void setValidade(@NotBlank(message = "O atributo validade é Obrigatório!") LocalDate validade) {
        this.validade = validade;
    }
}

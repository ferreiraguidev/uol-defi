package com.example.uoldefi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Players {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    public Long id;

    //Apresentar um cadastro contendo nome, e-mail e telefone do jogador (sendo que nome e e-mail são obrigatórios)
    @NotBlank
    public String name;

    @NotBlank
    public String email;

    public String phone;

    public Boolean avengers;

}

package br.com.alura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Usuario {

    @Id
    private UUID id;
    private String nome;
    private String cpf;
    private String username;
    private String password;
    private LocalDateTime created;
    private LocalDateTime changed;
}

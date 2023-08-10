package br.com.alura.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
public class Ordem {
    @Id
    private UUID id;
    private double preco;
    private String tipo;
    private LocalDateTime created;
    private OrdemStatus status;
    @Column(name = "user_id")
    private UUID userId;
}

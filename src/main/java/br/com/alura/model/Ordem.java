package br.com.alura.model;

import jakarta.persistence.*;
import jakarta.ws.rs.core.MediaType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;
@Getter
@Setter
@Entity
public class Ordem {
    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "preco")
    private double preco;
    @Column(name = "tipo")
    @Enumerated(EnumType.STRING)
    private OrderType tipo;
    @Column(name = "created")
    private LocalDateTime created;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrdemStatus status;
    @Column(name = "user_id")
    private UUID userId;
}

package br.com.alura.repository;

import br.com.alura.model.Ordem;
//import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrdemRepository extends CrudRepository<Ordem, UUID> {
}

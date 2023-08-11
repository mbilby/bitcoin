package br.com.alura.resource;

import br.com.alura.model.Ordem;
import br.com.alura.model.OrdemStatus;
import br.com.alura.model.OrderType;
import br.com.alura.model.Usuario;
import br.com.alura.repository.OrdemRepository;
import br.com.alura.utils.Utils;
import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;

@Path("/ordens")
public class OrdemResource {

    private OrdemRepository ordemRepository;

    @Inject
    public OrdemResource(OrdemRepository ordemRepository) {
        this.ordemRepository = ordemRepository;
    }

    @POST
    @Transactional
    @RolesAllowed("USER")
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertOrder(Ordem ordem) {
        Utils utils = new Utils();
        String tipo = ordem.getTipo().toString();
        ordem.setId(utils.geraId());
        ordem.setCreated(LocalDateTime.now());
        ordem.setStatus(OrdemStatus.ENVIADA);
        ordem.setTipo(OrderType.valueOf(tipo.toUpperCase()));
        ordemRepository.save(ordem);
    }
}

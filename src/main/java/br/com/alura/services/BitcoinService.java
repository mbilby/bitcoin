package br.com.alura.services;

import br.com.alura.model.Bitcoin;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;


@Path("/bitcoins") // PATH DO ENDPOINT
@RegisterRestClient(configKey = "bitcoin") // SERVIÇO PODE SER INJETADO
public interface BitcoinService {
    @GET
    List<Bitcoin> getAll();
}

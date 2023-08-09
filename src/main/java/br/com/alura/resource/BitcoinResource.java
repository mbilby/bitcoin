package br.com.alura.resource;

import br.com.alura.model.Bitcoin;
import br.com.alura.services.BitcoinService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import org.jboss.resteasy.reactive.RestResponse;
import java.util.List;

@Path("/bitcoin")
public class BitcoinResource {

    private BitcoinService bitcoinService;

    @Inject
    public BitcoinResource(@RestClient BitcoinService bitcoinService) {
        this.bitcoinService = bitcoinService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bitcoin> getAll() {

        return bitcoinService.getAll();
    }
}


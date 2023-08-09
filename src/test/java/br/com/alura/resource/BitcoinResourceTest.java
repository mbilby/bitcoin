package br.com.alura.resource;

import br.com.alura.model.Bitcoin;
import br.com.alura.services.BitcoinService;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(value = MockitoExtension.class)
class BitcoinResourceTest {

    @Mock
    private BitcoinService bitcoinService;

    private BitcoinResource bitcoinResource;

    @BeforeEach
    void setUp(){
        bitcoinResource = new BitcoinResource(bitcoinService);
    }

    @Test
    void getAll() {
        List<Bitcoin> bitcoins = new ArrayList<Bitcoin>();
        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setId("1");
        bitcoin.setData("data");
        bitcoin.setTipo("tipo");
        bitcoin.setPreco("preco");
        bitcoins.add(bitcoin);

        when(bitcoinService.getAll()).thenReturn(bitcoins);

        var response = bitcoinResource.getAll();

        assertInstanceOf(List.class, response);
    }
}
package br.com.alura.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bitcoin {

    @JsonProperty(value = "preco")
    public String preco;
    @JsonProperty(value = "tipo")
    public String tipo;
    @JsonProperty(value = "data")
    public String data;
    @JsonProperty(value = "id")
    public String id;
}

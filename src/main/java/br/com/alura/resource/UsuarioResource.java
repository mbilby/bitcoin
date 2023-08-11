package br.com.alura.resource;

import br.com.alura.model.RoleType;
import br.com.alura.model.Usuario;
import br.com.alura.utils.Utils;
import jakarta.annotation.security.PermitAll;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDateTime;

@Path("/usuarios")
public class UsuarioResource {
    @POST
    @PermitAll
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void insertUser(Usuario usuario){
        Utils utils = new Utils();
        usuario.setId(utils.geraId());
        usuario.setPassword(utils.EncryptedPassword(usuario.getPassword()));
        usuario.setCreated(LocalDateTime.now());
        usuario.setRole(utils.userValid(usuario.getRole()));
        Usuario.persist(usuario);
    }

//    public List<Usuario> getAll() {
//        Usuario usuario = new Usuario();
//        usuario.
//    }
}

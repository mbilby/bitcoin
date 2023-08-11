package br.com.alura.utils;

import br.com.alura.model.Usuario;
import io.quarkus.elytron.security.common.BcryptUtil;
import lombok.Getter;

import java.util.UUID;

@Getter
public class Utils {
    public UUID geraId() {
        return UUID.randomUUID();
    }

    public String EncryptedPassword(String password) {
        return BcryptUtil.bcryptHash(password);
    }

    public String userValid(String role) {
        return (role.equals("special")) ? "ADMIN": "USER";
    }
}

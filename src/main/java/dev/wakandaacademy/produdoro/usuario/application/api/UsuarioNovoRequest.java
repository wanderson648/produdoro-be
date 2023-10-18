package dev.wakandaacademy.produdoro.usuario.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class UsuarioNovoRequest {
    @Email
    String email;
    @Size(min = 6)
    String senha;
}

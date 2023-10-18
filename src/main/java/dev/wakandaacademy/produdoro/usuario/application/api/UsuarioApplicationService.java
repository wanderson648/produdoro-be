package dev.wakandaacademy.produdoro.usuario.application.api;

import jakarta.validation.Valid;

public interface UsuarioApplicationService {
    UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo);
}

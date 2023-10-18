package dev.wakandaacademy.produdoro.credencial.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;

public interface CredencialApplicationService {
    void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo);
}

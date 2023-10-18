package dev.wakandaacademy.produdoro.usuario.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class UsuarioController implements UsuarioApi {
    private final UsuarioApplicationService usuarioApplicationService;

    @Override
    public UsuarioCriadoResponse postNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[start] UsuarioController - postNovoUsuario");
        UsuarioCriadoResponse usuarioCriado = usuarioApplicationService.criaNovoUsuario(usuarioNovo);
        log.info("[finish] UsuarioController - postNovoUsuario");
        return usuarioCriado;
    }
}

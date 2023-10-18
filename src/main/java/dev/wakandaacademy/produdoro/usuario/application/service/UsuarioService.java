package dev.wakandaacademy.produdoro.usuario.application.service;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioApplicationService;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UsuarioService implements UsuarioApplicationService {
    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[start] UsuarioService - criaNovoUsuario");
        ConfiguracaoPadrao configuracaoPadrao = getConfiguracaoPadra();
        Usuario usuario = new Usuario(usuarioNovo , configuracaoPadrao);
        log.info("[finish] UsuarioService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario);
    }

    private ConfiguracaoPadrao getConfiguracaoPadra() {
        return ConfiguracaoPadrao.builder()
                .tempoMinutosFoco(25)
                .tempoMinutosPausaCurta(5)
                .tempoMinutosPausaLonga(15)
                .repeticoesParaPausaLonga(3)
                .build();
    }
}

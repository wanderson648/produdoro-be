package dev.wakandaacademy.produdoro.usuario.application.service;

import dev.wakandaacademy.produdoro.credencial.service.CredencialApplicationService;
import dev.wakandaacademy.produdoro.pomodoro.service.PomodoroApplicationSevice;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioApplicationService;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class UsuarioService implements UsuarioApplicationService {
    private final PomodoroApplicationSevice pomodoroService;
    private final CredencialApplicationService credencialService;
    private final UsuarioRepository usuarioRepository;
    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[start] UsuarioService - criaNovoUsuario");
        var configuracaoPadrao = pomodoroService.getConfiguracaoPadra();
        credencialService.criaNovaCredencial(usuarioNovo);
        var usuario = new Usuario(usuarioNovo , configuracaoPadrao);
        usuarioRepository.salva(usuario);
        log.info("[finish] UsuarioService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario);
    }

}

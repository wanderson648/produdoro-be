package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.StatusUsuario;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.Value;

import java.util.UUID;

@Value
public class UsuarioCriadoResponse {
    UUID idUsuario;
    String email;
    ConfiguracaoUsuarioResponse configuracao;
    StatusUsuario status;
    Integer quantidadePomodorosPausaCurta = 0;

    public UsuarioCriadoResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.email = usuario.getEmail();
        this.configuracao = new ConfiguracaoUsuarioResponse(usuario.getConfiguracaoUsuario());
        this.status = usuario.getStatusUsuario();
    }
}

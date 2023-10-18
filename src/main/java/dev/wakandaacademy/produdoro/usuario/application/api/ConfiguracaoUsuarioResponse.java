package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@Value
public class ConfiguracaoUsuarioResponse {
    Integer tempoMinutosFoco;
    Integer tempoMinutosPausaCurta;
    Integer tempoMinutosPausaLonga;
    Integer repeticoesParaPausaLonga;

    public ConfiguracaoUsuarioResponse(ConfiguracaoUsuario configuracaoUsuario) {
        this.tempoMinutosFoco = configuracaoUsuario.getTempoMinutosFoco();
        this.tempoMinutosPausaCurta = configuracaoUsuario.getTempoMinutosPausaCurta();
        this.tempoMinutosPausaLonga = configuracaoUsuario.getTempoMinutosPausaLonga();
        this.repeticoesParaPausaLonga = configuracaoUsuario.getRepeticoesParaPausaLonga();
    }
}

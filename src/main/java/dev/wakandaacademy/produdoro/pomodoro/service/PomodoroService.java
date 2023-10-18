package dev.wakandaacademy.produdoro.pomodoro.service;

import dev.wakandaacademy.produdoro.pomodoro.domain.ConfiguracaoPadrao;
import org.springframework.stereotype.Service;

@Service
public class PomodoroService implements PomodoroApplicationSevice {
    @Override
    public ConfiguracaoPadrao getConfiguracaoPadra() {
        return ConfiguracaoPadrao.builder()
                .tempoMinutosFoco(25)
                .tempoMinutosPausaCurta(5)
                .tempoMinutosPausaLonga(15)
                .repeticoesParaPausaLonga(3)
                .build();
    }
}

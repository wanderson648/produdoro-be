package dev.wakandaacademy.produdoro.pomodoro.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@Document(collation = "ConfiguracaoPadraoPomodoro")
public class ConfiguracaoPadrao {
    private static final String CODIGO_DEFAULT = "DEFAULT";

    @Builder.Default
    @MongoId(targetType = FieldType.STRING)
    private String codigo = CODIGO_DEFAULT;
    private Integer tempoMinutosFoco;
    private Integer tempoMinutosPausaCurta;
    private Integer tempoMinutosPausaLonga;
    private Integer repeticoesParaPausaLonga;

}

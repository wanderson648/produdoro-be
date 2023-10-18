package dev.wakandaacademy.produdoro.tarefa.domain.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collation = "Tarefa")
@Data
public class Tarefa {
    @Id
    private UUID idTarefa;
    private String nome;
    private String descricao;
    @Indexed
    private UUID idUsuario;
    @Indexed
    private UUID idArea;
    @Indexed
    private UUID idProjeto;
    @Builder.Default
    private StatusTarefa statusTarefa = StatusTarefa.A_FAZER;
}

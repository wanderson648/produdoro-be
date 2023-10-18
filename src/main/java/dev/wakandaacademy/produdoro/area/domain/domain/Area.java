package dev.wakandaacademy.produdoro.area.domain.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collation = "Area")
@Data
public class Area {
    @Id
    private UUID idArea;
    private String nome;
    private String descricao;
    @Indexed
    private UUID idUsuario;
}

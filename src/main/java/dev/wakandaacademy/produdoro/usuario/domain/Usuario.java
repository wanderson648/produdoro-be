package dev.wakandaacademy.produdoro.usuario.domain;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Usuario")
@Data
public class Usuario {
    @Id
    private UUID idUsuario;
    @Email
    @Indexed
    private String email;
    private ConfiguracaoUsuario configuracaoUsuario;
    @Builder.Default
    private StatusUsuario statusUsuario = StatusUsuario.FOCO;
    @Builder.Default
    private Integer quantidadePomodorosPausaCurta = 0;
}

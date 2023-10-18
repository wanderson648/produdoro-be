package dev.wakandaacademy.produdoro.handler;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
public class ErrorApiResponse {
    private String message;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String description;
}

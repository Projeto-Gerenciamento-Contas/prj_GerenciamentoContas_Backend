package br.com.api.gerenciamento.Modelo;

import org.springframework.stereotype.*;
import lombok.Setter;
import lombok.Getter;

@Component
@Getter
@Setter
public class RespostaModelo {
    private String mensagem;
}

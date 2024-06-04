package br.com.api.gerenciamento.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Outros")
public class OutrosModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codOutros;
    private String nomeServico;
    private double valorServico;
    private String complemento;
}

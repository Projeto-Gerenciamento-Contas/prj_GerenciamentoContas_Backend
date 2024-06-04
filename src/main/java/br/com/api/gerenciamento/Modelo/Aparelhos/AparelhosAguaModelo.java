package br.com.api.gerenciamento.Modelo.Aparelhos;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Aparelhos agua")
@Getter
@Setter
public class AparelhosAguaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codAparelhoAgua;
    private double valorAparelhoAgua;
    private String NomeAparelhoAgua;
    private double vazaoAgua;
    private LocalTime tempoUsoAgua;

}
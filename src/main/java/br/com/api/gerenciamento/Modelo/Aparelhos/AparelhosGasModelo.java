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
@Table(name = "Aparelhos Gas")
@Getter
@Setter
public class AparelhosGasModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codAparelhoGas;
    private String nomeAparelhoGas;
   private double valorAparelhoGas;
    private double vazaoGas;
    private LocalTime tempoUso;
}

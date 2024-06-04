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
@Table(name = "Aparelhos eletricos")
@Getter
@Setter
public class AparelhosEletricosModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codAparelho;
    private double valorAparelho;
    private String NomeAparelho;
    private double potencia;
    private LocalTime tempoUsoEletrico;
   

}

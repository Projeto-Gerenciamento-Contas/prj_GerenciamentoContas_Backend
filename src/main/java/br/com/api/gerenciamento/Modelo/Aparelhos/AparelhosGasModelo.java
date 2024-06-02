package br.com.api.gerenciamento.Modelo.Aparelhos;

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
    private String descricaoAparelhoGas;
    private String tipoAparelhoGas;
    private String marcaAparelhoGas;
    private String modeloAparelhoGas;
    private String numeroSerieAparelhoGas;
    private String numeroChassiAparelhoGas;
}

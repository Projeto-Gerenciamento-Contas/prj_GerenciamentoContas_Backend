package br.com.api.gerenciamento.Modelo.Aparelhos;

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
    private String nomeAparelhoAgua;
    private String descricaoAparelhoAgua;
    private String marcaAparelhoAgua;
    private String modeloAparelhoAgua;
    private String tipoAparelhoAgua;
    private String statusAparelhoAgua;
    private double vazao;
    private double pressao;
    private double temperatura;
    private double potencia;
    private double consumo;
    
    
}
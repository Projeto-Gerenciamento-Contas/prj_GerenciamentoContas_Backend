package br.com.api.gerenciamento.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Compras")
@Getter
@Setter
public class ComprasModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codCompras;
    private String nomeProduto;
    private double valorProduto;
    private String complemento;
    
}

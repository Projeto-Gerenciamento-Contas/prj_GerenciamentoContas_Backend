package br.com.api.gerenciamento.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Enderecos")
public class EnderecoModelo {
    private Long codigoEndereco;
    private int cep;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private int complemento;

}

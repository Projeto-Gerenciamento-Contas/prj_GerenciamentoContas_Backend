package br.com.api.gerenciamento.Modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.api.gerenciamento.Modelo.Aparelhos.AparelhosEletricosModelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Enderecos")
public class EnderecoModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codEndereco")
    private Long codigoEndereco;
    private int cep;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;

    @ManyToMany(mappedBy = "enderecos")
    private List<UsuarioModelo> usuarios = new ArrayList<>();

    @OneToMany
    @JoinColumn (name = "Codigo_AparelhoE")
    private List<AparelhosEletricosModelo> aparelhosEletricos;

}
